package com.fclass.servletjsp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{

       //For Session params
       HttpSession session = req.getSession();
       int noToSquare = (int) session.getAttribute("result-param");
       // For Request Dispatcher
//        int noToSquare = (int) req.getAttribute("result-attribute");
        // For SendRedirect
//        int noToSquare = Integer.parseInt(req.getParameter("num")) ;

        noToSquare = noToSquare*noToSquare;
        PrintWriter out = res.getWriter();
        out.println(noToSquare);

    }
}
