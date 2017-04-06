<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.List" %>
<%@ page language="java" import="com.facerServer.dao.UserLoginDao" %>
<%@ page language="java" import="com.facerServer.model.UserLogin" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>facerSercer - Test Page</title>
</head>
<body>
<% 
List<UserLogin> users = UserLoginDao.readByLastName();
if (users != null) {
%>
<h3>Users - by UserId</h3>
<table border="1" width="300">
<tr>
<td>User ID</td>
<td>First Name</td>
<td>Last Name</td>
<td>Email Address</td>
<td>User Active</td>
<td>Password Reset</td>
</tr>
<%	for (UserLogin user : users) { %>
<tr>
<td><%=user.getUserId() %></td>
<td><%=user.getFirstName() %></td>
<td><%=user.getLastName() %></td>
<td><%=user.getEmailAddress() %></td>
<td><%=user.getUserActive() %></td>
<td><%=user.getResetPasswordFlg() %></td>
</tr>
<%   }
  }
%>
</table>

</body>
</html>
