<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.List" %>
<%@ page language="java" import="com.facerServer.dao.ApplicationDao" %>
<%@ page language="java" import="com.facerServer.model.StdApplication" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>facerSercer - Test Page</title>
</head>
<body>
<% 
ApplicationDao dao = new ApplicationDao();
List<StdApplication> apps = dao.readAll();
if (apps != null) {
%>
<h3>Applications</h3>
<table border="1" width="300">
<tr>
<td><b>ID</b></td>
<td><b>Name</b></td>
<td><b>Active</b></td>
<td><b>Status</b></td>
</tr>
<%	for (StdApplication app : apps) { %>
<tr>
<td><%=app.getApplicationId()%></td>
<td><%=app.getApplicationName()%></td>
<td><%=app.getApplicationActive()%></td>
<td> </td>
</tr>
<%   }
  }
%>
</table>

</body>
</html>
