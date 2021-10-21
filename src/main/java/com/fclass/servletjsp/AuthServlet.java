package com.fclass.servletjsp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/auth")
public class AuthServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

       String inputUsername = req.getParameter("username");
       String inputPassword = req.getParameter("password");
       int num1 = Integer.parseInt(req.getParameter("num1"));
       int num2 = Integer.parseInt(req.getParameter("num2"));
       String username = "raffayhusayn";
       String password = "1234";
       PrintWriter out = res.getWriter();

       if(inputUsername.equals(username) && inputPassword.equals(password)){
           HttpSession session = req.getSession();
           session.setAttribute("num1" , num1);
           session.setAttribute("num2", num2);
//           res.sendRedirect("add");
            RequestDispatcher rd = req.getRequestDispatcher("/Add.jsp");
            req.setAttribute("num1" , num1);
            req.setAttribute("num2", num2);
            rd.include(req, res);
            res.setContentType("text/html");

            out.println("<b>auth servlet</b>");

        }else{
           out.println("incorrect username or password, try again");
           res.sendRedirect("index.html");
       }
    }

}
