<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.mit.*" import="java.sql.*"  %>
<!--  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>-->
<jsp:include page="header.jsp"></jsp:include>
<form action="Upload" method="post" enctype="multipart/form-data" name="description">
<div class="container">
 <div class="jumbotron">
<table border="0" cellspacing="2" cellpadding="2">
  <tbody>
    <tr>
      <td align="right">Studiengangname:</td>
      <td>
        <input maxlength="50" name="studiengang" list="studiengangliste" size="45" type="text" required="required" />
    <datalist name="studiengangliste" id="studiengangliste">
    <%
    String[] studiengaenge = StudiengangDAO.getStudiengaenge();
    for (int i = 0; i < studiengaenge.length; i++) {
    	%>
    		<option><%=studiengaenge[i]%></option>
    	<%
    }
    %>
    </datalist>
      </td>
    </tr>
    <tr>
      <td align="right">Semester:</td>
      <td>
      <!--  <input maxlength="50" name="semester" size="45" type="text" /> -->
         <select name="semester" id="semester"> 

      <option value="1">Semester 1</option> 

      <option value="2">Semester 2</option> 

      <option value="3">Semester 3</option> 

      <option value="4">Semester 4</option> 

      <option value="5">Semester 5</option> 

      <option value="6">Semester 6</option> 

      <option value="7">Semester 7</option> 
      
      <option value="8">Semester 8</option> 
      
      <option value="9">Semester 9</option> 
      
      <option value="10">Semester 10</option> 

    </select>
      </td>
    </tr>
    <tr>
      <td align="right">Stadt:</td>
      <td>
            <input maxlength="50" name="stadt" list="stadtliste" size="45" type="text" required="required" />
    <datalist name="stadtliste" id="stadtliste">
    <%
    String[] staedte = BildungsstaetteDAO.getStaedte();
    for (int i = 0; i < staedte.length; i++) {
    	%>
    		<option><%=staedte[i]%></option>
    	<%
    }
    %>
      </td>
    </tr>
    <tr>
      <td align="right">Bundesland:</td>
      <td>
         <select name="bundesland" id="bundesland">

							<option selected="selected">Bremen</option>

							<option>Hamburg</option>

							<option>Berlin</option>

							<option>Niedersachsen</option>

							<option>Baden-Württenberg</option>

							<option>Bayern</option>

							<option>Brandenburg</option>

							<option>Hessen</option>

							<option>Mecklenburg-Vorpommern</option>

							<option>Nordrhein-Westfalen</option>

							<option>Rheinland-Pfalz</option>

							<option>Saarland</option>

							<option>Sachsen</option>

							<option>Sachen-Anhalt</option>

							<option>Schleswig-Holstein</option>

							<option>Thüringen</option></td>
    </tr>
    <tr>
    <td align="right">Modul:</td>
    <td>
    <input maxlength="50" name="modul" list="modulliste" size="45" type="text" required="required" />
    <datalist name="modulliste" id="modulliste">
    <%
    String[] module = StudiengangDAO.getModule();
    for (int i = 0; i < module.length; i++) {
    	%>
    		<option><%=module[i]%></option>
    	<%
    }
    %>
    </datalist>
    </td>
    </tr>
    <tr>
    <td align="right">Bildungsstätte:</td>
    <td>
    <%
    String[] bildungsstaetten = BildungsstaetteDAO.getBildungsstaetten();
    %>
    <input maxlength="50" name="namebs" list="namebs" size="45" type="text" required="required" />
    <datalist name="namebs" id="namebs">
    <%
    for (int i = 0; i < bildungsstaetten.length; i++) {
    	%>
    		<option><%=bildungsstaetten[i]%></option>
    	<%
    }
    
    %>
    
      
      </datalist>
    </td>
    </tr>
     <tr>
     <td align="right">Lernmaterial zum Hochladen: </td>
    <td>  
      <input type="file" name="file" required="required" />
    </td>
    </tr>
     <tr>
     <td align="right" >Titel: </td>
    <td>  
     <input type="text" name="titel" maxlength="50" size="45" required="required" />
    </td>
    </tr>
      <tr>
      <td align="right"> Thema: </td>
    <td>  
       <input type="text" name="thema" maxlength="50" size="45" required="required" />
    </td>
    </tr>
    <tr>
      <td></td>
      <td>
        <input type="submit" value="Laden" />
      </td>
    </tr>
  </tbody>
</table>
</div>
</div>
</from>
</body>
</html>