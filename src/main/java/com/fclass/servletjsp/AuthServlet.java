package com.fclass.servletjsp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class AuthServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{

       String inputUsername = req.getParameter("username");
       String inputPassword = req.getParameter("password");
       int num1 = Integer.parseInt(req.getParameter("num1"));
       int num2 = Integer.parseInt(req.getParameter("num2"));
       String username = "raffayhusayn";
       String password = "1234";
       PrintWriter out = res.getWriter();
       out.println(inputUsername + "has the password"+ inputPassword );

       if(inputUsername.equals(username) && inputPassword.equals(password)){
           HttpSession session = req.getSession();
           session.setAttribute("num1" , num1);
           session.setAttribute("num2", num2);
           res.sendRedirect("add");

        }else{
           out.println("incorrect username or password, try again");
           res.sendRedirect("index.html");
       }
    }

}