<%--
  Created by IntelliJ IDEA.
  User: raffay
  Date: 10/23/21
  Time: 7:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql" uri ="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri ="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title> SQL with JSTL</title>
</head>
<body>
    <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/student" user="root" password="password"/>
    <sql:query var="rs" dataSource="${db}" >
        select name, id from software
    </sql:query>
    <c:forEach  items="${rs.rows}" var="software">
        <c:out value="${software.name}"/>
        <c:out value = " : "/>
        <c:out value="${software.id}"/>
        <c:out value="(length of name = ${fn:length(software.name)} )" />
        <br>

    </c:forEach>

</body>
</html>
