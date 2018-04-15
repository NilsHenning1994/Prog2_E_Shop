<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
if (session.getAttribute("login") == null) {
	response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="XML/css/bootstrap/docs/examples/favicon.ico">
    <!-- Bootstrap core CSS -->
    <link href="XML/css/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="XML/css/bootstrap/docs/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="justified-nav.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="XML/Scss/bootstrap/docs/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<title>Insert title here</title>
</head>
<body>

 <div class="container">

      <!-- The justified navigation menu is meant for single line per list item.
           Multiple lines will require custom code not provided by Bootstrap. -->
      <div class="masthead">
        <h3 class="text-muted">StudyHelp</h3>
        <nav>
          <ul class="nav nav-justified">
            <li class="active"><a href="index.jsp">Home</a></li>
            <li><a href="suchen.jsp">Suche</a></li>
            <li><a href="laden.jsp">Hochladen</a></li>
            <%
            	if (session.getAttribute("admin") != null) {
            		%>
            			<li><a href="admin.jsp">Admin</a></li>
            		<%
            	}
            %>
            <li><a href="uaeberUns.jsp">Über Uns</a></li>
            <li><a href="kontakt.jsp">Kontakte</a></li>
            <li><a href="abmelden.jsp">Abmelden</a></li>
          </ul>
        </nav>
      </div>

      <div style= "height: 100px"></div>