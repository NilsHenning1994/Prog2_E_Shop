<%@page import="com.mit.Admin"%>
<%@page import="com.mit.LernmaterialDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%
	if (session.getAttribute("admin") == null) {
		response.sendRedirect("index.jsp");
	}

	Admin.processAction(request, response);
%>
<h1>Admin</h1>
<table class="table">
	<thead>
	<tr>
	<td>ID</td>
	<td>Titel</td>
	<td>Thema</td>
	<td>Studiengang</td>
	<td>Modul</td>
	<td>Semester</td>
	<td>Bildungsstätte</td>
	<tr>
	</thead>
	<%
		String[][] data = LernmaterialDAO.getUnpublishedLernmaterial();
		System.out.println(data.length);
	%>
	<% for (int i = 1; i < data.length; i++) { %>
		<tr>
			<td><%=data[i][0]%></td>
			<td><%=data[i][1]%></td>
			<td><%=data[i][2]%></td>
			<td><%=data[i][3]%></td>
			<td><%=data[i][4]%></td>
			<td><%=data[i][5]%></td>
			<td><%=data[i][6]%></td>
			<td><a href="GetFile?id=<%=data[i][0]%>" target="_blank">Link</a></td>
			<td><a href="admin.jsp?action=accept&id=<%=data[i][0]%>" role="button">
					<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
				</a>
			</td>
			<td><a href="admin.jsp?action=reject&id=<%=data[i][0]%>" role="button">
					<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
				</a>
			</td>
		</tr>
	<% } %>

</table>
</body>
</html>