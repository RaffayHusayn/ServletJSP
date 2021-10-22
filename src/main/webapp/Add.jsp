<%@ page import="java.io.PrintWriter" %>
<%@ page import="jakarta.servlet.RequestDispatcher" %>
<%@ page import="static java.lang.System.out"%>
<%@ page import="java.util.Scanner" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Enumeration" %>
<%--
  Created by IntelliJ IDEA.
  User: raffay
  Date: 10/20/21
  Time: 10:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="errorjsp" %>
<html>
<head>
    <title>Add Jsp</title>
</head>
<body >

    <%!
        String outsideClass = "outside Class";
    %>

    <%
//        int i = 6/0;
        out.println("addjsp: " + config.getInitParameter("class"));
//        out.println(application.getInitParameter("name"));
        int num1 =Integer.parseInt( request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1+ num2;
        request.setAttribute("result" , result);
        RequestDispatcher rd = request.getRequestDispatcher("square");
        rd.include(request, response);


    %>

    <%="<b>the sum is : " + result + "</b>"%>
</body>
</html>
