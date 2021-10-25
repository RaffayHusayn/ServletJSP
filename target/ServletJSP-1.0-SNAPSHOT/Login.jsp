<%--
  Created by IntelliJ IDEA.
  User: raffay
  Date: 10/25/21
  Time: 3:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        .form{
            margin: 3px;
        }
    </style>
</head>
<body>
    <form  action="auth" method="post">
        <h3 >Login </h3>
        <input type="text" class="form" name ="username" placeholder="Username" value = "raffayhusayn">
        <br>
        <input type="password" class="form"  name = "password" placeholder="Password" value = "1234">
        <input type="submit"  value="Login">
    </form><!--.login-form-->
</body>
</html>
