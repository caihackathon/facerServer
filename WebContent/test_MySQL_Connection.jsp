<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<sql:query var="rs" dataSource="jdbc/facer">
select email_id, system, email_type_cde
from facer.EMAIL
</sql:query>

<html>
  <head>
    <title>DB Test</title>
  </head>
  <body>

  <h2>Results</h2>

<c:forEach var="row" items="${rs.rows}">
    ID ${row.email_id}<br/>
    System ${row.system}<br/>
    Type ${row.email_type_cde}<br/>
</c:forEach>

  </body>
</html>