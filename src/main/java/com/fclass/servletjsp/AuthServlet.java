package com.fclass.servletjsp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/auth")
public class AuthServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        //Registering the Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        res.setContentType("text/html");
        String inputUsername = req.getParameter("username");
        String inputPassword = req.getParameter("password");
        String query = "select password from login where username = ? ";
        PrintWriter out = res.getWriter();

        String passwordDB = "";

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password");
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, inputUsername);
            ResultSet rs = st.executeQuery();
            rs.next();
            passwordDB = rs.getString(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (inputPassword.equals(passwordDB) && passwordDB != "") {

            HttpSession session = req.getSession();
            session.setAttribute("username", inputUsername);
            res.sendRedirect("welcomejsp");
        } else {
            RequestDispatcher rdNotLogin = req.getRequestDispatcher("loginjsp");
            out.println("<h3 style=\"color:red;\">Try Again</h3>");
            rdNotLogin.include(req, res);
        }
    }

}
