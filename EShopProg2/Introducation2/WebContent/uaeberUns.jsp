<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<%
if (session.getAttribute("login") == null) {
	response.sendRedirect("login.jsp");
}

%>

<div class="container">

      
        <div class="jumbotron">
        <h1>Study Help</h1>
     <p class="lead">Dieses Projekt entstand im Rahmen des Moduls "Datenbankbasierte Webanwendungen" an der Hochschule Bremen.</p>
      <p class="lead">Mitglieder des Teams sind:</p>
      <p class="lead">Nicholas Amberge</p>
      <p class="lead">Hatice Ay</p>
      <p class="lead">Christoph Helweg</p>
      <p class="lead">Janek Janßen</p>
      </div>
      </div>
</body>
</html>