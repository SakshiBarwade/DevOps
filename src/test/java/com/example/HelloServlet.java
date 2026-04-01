package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h1>Hello from DevOps Pipeline!</h1>");
        out.println("<p>Git + GitHub + Maven + Jenkins + TestNG + Docker</p>");
        out.println("<p>Student: Omkar Barad | Experiment No: 10</p>");
    }
}