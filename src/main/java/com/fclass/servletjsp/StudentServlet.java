package com.fclass.servletjsp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Student> studentsList = new ArrayList<>();
        Student s1 = new Student("raffay", 1);
        Student s2 = new Student("ayesha", 2);
        Student s3 = new Student("nabia", 3);
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);

        req.setAttribute("student_List_Param", studentsList);
        RequestDispatcher rd = req.getRequestDispatcher("jstljsp");
        rd.forward(req,res);
    }
}
