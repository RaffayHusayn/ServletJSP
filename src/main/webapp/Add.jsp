<%@ page import="java.io.PrintWriter" %>
<%@ page import="jakarta.servlet.RequestDispatcher" %>
<%@ page import="static java.lang.System.out"%>;
<%--
  Created by IntelliJ IDEA.
  User: raffay
  Date: 10/20/21
  Time: 10:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Jsp</title>
</head>
<body bgcolor="#faebd7">

    <%
        int num1 =Integer.parseInt( request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1+ num2;
        out.println("result is : "+ result);
//        request.setAttribute("result" , result);
//        RequestDispatcher rd = request.getRequestDispatcher("square");
//        rd.forward(request, response);


    %>
</body>
</html>
