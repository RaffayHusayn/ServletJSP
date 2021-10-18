package com.fclass.servletjsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1+ num2;

        HttpSession session = req.getSession();
        session.setAttribute("result-param", result) ;

//        Send response back with this Url
        res.sendRedirect("square");
        //Forward request to a different servlet
//        req.setAttribute("result-attribute", result);
//        RequestDispatcher rd = req.getRequestDispatcher("square");//param : url of the servlet it's calling
//        rd.forward(req, res);

    }

}
