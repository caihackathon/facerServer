<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.List" %>
<%@ page language="java" import="com.facerServer.dao.ComponentDao" %>
<%@ page language="java" import="com.facerServer.model.StdComponent" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>facerSercer - Test Page</title>
</head>
<body>
<% 
List<StdComponent> comps = ComponentDao.readAll();
if (comps != null) {
%>
<h3>Components</h3>
<table border="1" width="300">
<tr>
<td><b>Application Name</b></td>
<td><b>Component Name</b></td>
<td><b>Component Active</b></td>
<td><b>Component Status</b></td>
</tr>
<%	for (StdComponent comp : comps) { %>
<tr>
<td><%=comp.getStdApplication().getApplicationName() %></td>
<td><%=comp.getComponentName() %></td>
<td><%=comp.getComponentActive() %></td>
<td> </td>
</tr>
<%   }
  }
%>
</table>

</body>
</html>