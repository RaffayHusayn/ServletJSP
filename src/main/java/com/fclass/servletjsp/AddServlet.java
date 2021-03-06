package com.fclass.servletjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/add")
public class AddServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//        HttpSession session = req.getSession();
//
//        int num1 = (int)session.getAttribute("num1");
//        int num2 = (int)session.getAttribute("num2");
        int num1 =Integer.parseInt( req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1+ num2;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<b> Add servlet : "+ result + "</b>");

        req.setAttribute("result" , result);
        RequestDispatcher rd = req.getRequestDispatcher("square");
        rd.forward(req, res);


       //Cookies with a redirect
//        Cookie cookie = new Cookie("result-cookie", result+"");//adding +"" after int makes it a string
//        res.addCookie(cookie);
       //Sessions with a redirect
//        HttpSession session = req.getSession();
//        session.setAttribute("result-param", result) ;

//        Send response back with this Url
//        res.sendRedirect("square");
        //Forward request to a different servlet
//        req.setAttribute("result-attribute", result);
//        RequestDispatcher rd = req.getRequestDispatcher("square");//param : url of the servlet it's calling
//        rd.forward(req, res);

    }

}
