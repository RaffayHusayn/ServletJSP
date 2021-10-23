<%--
  Created by IntelliJ IDEA.
  User: raffay
  Date: 10/22/21
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Students in Software Engineering</title>
</head>
<body>
    <h1>Student in Software Engineering</h1>
    <%
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/student";
        String name = "root";
        String password = "password";
        String query = "Select * from software";

        Connection con  = DriverManager.getConnection(url, name , password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            out.println(rs.getInt(1)+ "  " + rs.getString(2));
        }
        st.close();
        con.close();
    %>
</body>
</html>
