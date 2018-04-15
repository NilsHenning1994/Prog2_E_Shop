<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
  <title>Animated login form</title>
 <link rel="stylesheet" href="XML/css/style.css">
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

</head>
<body>
 <div class="wrapper">
  <form name="fi" id="fi" method="post" action="success.jsp"  class="login" >
 

  <p class="title">Login</p>
  	<input type="hidden" name="Modus" id="Modus" value="login" />
    <input type="email" placeholder="E-Mail Adresse" autofocus name="email" class="form-control" required="required" />
    <i class="fa fa-user"></i>
    <input type="password" placeholder="Passwort" name="passwort" class="form-control" required="required" />
    <i class="fa fa-key"></i>
    <br>
    <br>
     <input type="submit" class="state" value="Login" id="login" / >
     Kein Account? <a href="register.jsp">Hier</a> registrieren.
 </p>
</form>

</div>
</body>
</html>