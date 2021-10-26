package com.fclass.servletjsp;

import com.fclass.dao.LoginDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "AuthDAO", value = "/AuthDAO")
public class AuthDAO extends HttpServlet {
    LoginDAO dao = new LoginDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        String inputUsername = request.getParameter("username");
        String inputPassword = request.getParameter("password");
        PrintWriter out = response.getWriter();



        Boolean LoginSuccess = dao.authenticate(inputUsername, inputPassword);
        if (LoginSuccess) {

            HttpSession session = request.getSession();
            session.setAttribute("username", inputUsername);
            response.sendRedirect("welcomejsp");
        } else {
            RequestDispatcher rdNotLogin = request.getRequestDispatcher("loginjsp");
            out.println("<h3 style=\"color:red;\">Try Again</h3>");
            rdNotLogin.include(request, response);
        }
    }
}
