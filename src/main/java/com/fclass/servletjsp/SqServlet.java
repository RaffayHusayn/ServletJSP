package com.fclass.servletjsp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/square")
public class SqServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{

        int noToSquare = (int) req.getAttribute("result");
        //For Cookies
//        int noToSquare = 0;
//        Cookie[] cookies = req.getCookies();
//        for(Cookie c: cookies){
//            if(c.getName().equals("result-cookie")){
//              noToSquare=Integer.parseInt(c.getValue());
//              break;
//            }
//        }
       //For Session params
//       HttpSession session = req.getSession();
//       int noToSquare = (int) session.getAttribute("result-param");
       // For Request Dispatcher
//        int noToSquare = (int) req.getAttribute("result-attribute");
        // For SendRedirect
//        int noToSquare = Integer.parseInt(req.getParameter("num")) ;

        noToSquare = noToSquare*noToSquare;

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("\n \n\n"+ "<b> Square of the sum : " + noToSquare + "</b>");
        System.out.println(noToSquare);

    }
}
