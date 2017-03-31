<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.List" %>
<%@ page language="java" import="com.facerServer.dao.IncidentDao" %>
<%@ page language="java" import="com.facerServer.model.Incident" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>facerSercer - Test Page</title>
</head>
<body>
<% 
List<Incident> incidents = IncidentDao.readAll();if (incidents != null) {
%>
<h3>Incidents</h3>
<table border="1" width="300">
<tr>
<td>Incident ID</td>
<td>Incident Type</td>
<td>Severity</td>
<td>Application</td>
<td>Component</td>
<td>Incident Date</td>
</tr>
<%	for (Incident inc : incidents) { %>
<tr>
<td><%=inc.getIncidentId() %></td>
<td><%=inc.getStdIncidentType().getIncidentTypeName() %></td>
<td><%=inc.getStdSeverity().getSeverityName() %></td>
<td><%=inc.getStdIncidentType().getStdComponent().getStdApplication().getApplicationName() %></td>
<td><%=inc.getStdIncidentType().getStdComponent().getComponentName() %></td>
<td><%=inc.getIncidentDate().toString() %></td>
</tr>
<%   }
  }
%>
</table>

</body>
</html>
