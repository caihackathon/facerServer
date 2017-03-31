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
List<StdApplication> apps = ApplicationDao.readAll();
if (apps != null) {
%>
<h3>Applications</h3>
<table border="1" width="300">
<tr>
<td width="80"><b>ID</b></td>
<td width="220"><b>Name</b></td>
</tr>
<%	for (StdApplication app : apps) { %>
<tr>
<td><%=app.getApplicationId()%></td>
<td><%=app.getApplicationName()%></td>
</tr>
<%   }
  }
%>
</table>

</body>
</html>
