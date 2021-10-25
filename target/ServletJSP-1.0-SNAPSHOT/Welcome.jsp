<%--
  Created by IntelliJ IDEA.
  User: raffay
  Date: 10/25/21
  Time: 5:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body background=" red">
    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        String sessionUsername = (String)session.getAttribute("username");
        if(sessionUsername== null){
            response.sendRedirect("Login.jsp");
        }
    %>
    <h1> Welcome : ${username}</h1>
    <form action="logout" method="post">
        <input type="submit" value = "log out"  />
    </form>
</body>
</html>
