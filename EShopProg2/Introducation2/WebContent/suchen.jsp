<%@page import="com.mit.LernmaterialDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="https://cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css"
	rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<script type="text/javascript" src="//code.jquery.com/jquery-1.12.4.js"></script>
	<script type="text/javascript"
		src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function() {
	    $('#example').DataTable({ "language": {
	        "url": "https://cdn.datatables.net/plug-ins/1.10.15/i18n/German.json"
	    } });
	} );
	</script>
	<%
if (session.getAttribute("login") == null) {
	response.sendRedirect("login.jsp");
} 
String[][] data = null;

if (request.getParameter("suchstring") == null) {
	data = LernmaterialDAO.getLernmaterial();
} else {
	int suchfeld = Integer.parseInt(request.getParameter("suchfeld"));
	data = LernmaterialDAO.getFilteredLernmaterial(suchfeld, request.getParameter("suchstring"));
}

%>
	<form action="./suchen.jsp">
		Suchfeld: <input type="text" name="suchstring" /> <select
			name="suchfeld">
			<option value=0>Titel</option>
			<option value=1>Thema</option>
			<option value=2>Studiengang</option>
			<option value=3>Modul</option>
			<option value=4>Semester</option>
			<option value=5>Bildungsstätte</option>
		</select> <input type="submit" method="POST" value="Ansicht filtern">
		<button onclick="suchen.jsp">Ansicht zurücksetzen</button>
	</form>
	<table id="example" class="display" cellspacing="0" width="100%">
		<thead>
			<tr>
				<%
            		for (int i = 0; i < data[0].length; i++) {
            			%><th><%=data[0][i]%></th>
				<%
            		}
            	%>

			</tr>
		</thead>
		<tfoot>
			<tr>
				<%
            		for (int i = 0; i < data[0].length; i++) {
            			%><th><%=data[0][i]%></th>
				<%
            		}
            	%>

			</tr>
		</tfoot>
		<tbody>
			<% 
        	for (int i = 1; i < data.length; i++) {
        		%><tr>
				<%
        		for (int j = 0; j < data[i].length; j++) {
        			%>
				<td><%=data[i][j]%></td>
				<%
        		}
        		 %>
			</tr>
			<%
        	} 
        %>




		</tbody>
	</table>


</body>
</html>