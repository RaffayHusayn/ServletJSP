<%--
  Created by IntelliJ IDEA.
  User: raffay
  Date: 10/23/21
  Time: 3:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
<h2>
    jstljsp is running, it just needs a list of student objects to work properly which is sent by StudentServlet
</h2>
<c:forEach items="${student_List_Param}" var="s">
        ${s}<br> <!-- this is just printing a list of Student objects sent from StudentServlet.java-->
    </c:forEach>
</body>
</html>
