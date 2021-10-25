package com.fclass.servletjsp;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

//@WebFilter(filterName = "PasswordFilter")
@WebFilter("/jstlsqljsp" )
public class PasswordFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String password = request.getParameter("password");
        if(password.length() > 3) {
            chain.doFilter(request, response);
        }else{
            out.println("password too short");
        }
    }
}
