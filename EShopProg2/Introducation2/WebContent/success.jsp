<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.mit.*" import="java.sql.*"   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/style.css">
</head>
<body>

<jsp:useBean id="obj" class="com.mit.StudentBean"/>
<jsp:setProperty property="*" name="obj"/>
<Jsp: getProperty property = "email" name = "userinfo" /> <br> 
<Jsp: getProperty property = "passwort" name = "userinfo" /> <br> 

<%
Connection conn;
PreparedStatement pst;
conn=ConnectionProvider.getCon();

String email = obj.getEmail();
String modus = request.getParameter("Modus");

Statement stEmail = conn.createStatement();
String sqlEmail= "SELECT email,passwort,admin FROM student where email = '" + email + "'";
ResultSet rsEmail= stEmail.executeQuery(sqlEmail);
boolean emailVorhanden = false;
boolean isAdmin = false;
String emailData = "";
String passwordData = "";
while(rsEmail.next()){
	
	emailData = rsEmail.getString(1);
	passwordData = rsEmail.getString(2);
	
	if(email.equals(rsEmail.getString(1))){
		emailVorhanden = true;
		if (rsEmail.getBoolean(3) == true) {
			isAdmin = true;
		}
	}
}

if (modus.equals("registrieren")) {
	if (emailVorhanden) {
		out.println("leider ist die Email: "+ email  +" schon vorhanden" );
	} else {
		// Neuen Benutzer anlegen
		int status= StudentDAO.insertStudent(obj);
		if (status >0){
			out.println(request.getParameter("email") + " Sie wurden in unserer Datenbank gespeichert");
			session.setAttribute("login", "ja");
			session.setAttribute("mail",emailData);
			System.out.println("mail");
			System.out.println(session.getAttribute("mail"));
			if (isAdmin) {
				session.setAttribute("admin", "ja");
			}
			response.sendRedirect("index.jsp");
			
		}		
	}
}
if (modus.equals("login")) {
	if (!emailVorhanden) {
		out.println("leider ist die Email: "+ email  +" nicht vorhanden" );
	} else {
		//  Passwort pruefen!!!
		if (obj.getPasswort().equals(passwordData)) {
			out.println("Login erfolgreich!");
			session.setAttribute("login", "ja");
			session.setAttribute("mail",emailData);
			System.out.println("mail");
			System.out.println(session.getAttribute("mail"));
			if (isAdmin) {
				session.setAttribute("admin", "ja");
			}
			response.sendRedirect("index.jsp");
		} else {
			out.println("Kennwort ist leider falsch");	
		}
	}
}




%>



</body>
</html>