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
        <h1>Hochschule Bremen</h1>
        <p class="lead">Neustadtswall 30</p>
        <p class="lead">28199 Bremen</p>
        <p class="lead"> </p>
        <p class="lead">Tel.: 0421-5905-0 </p>
        <p class="lead">Fax: 0421-5905-2292 </p>
        <p class="lead"> </p>
        <p class="lead">E-Mail: info@hs-bremen.de </p>

     
      </div>
      </div>
</body>
</html>