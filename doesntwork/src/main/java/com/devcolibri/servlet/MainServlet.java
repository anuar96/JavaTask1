package com.devcolibri.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
//@WebServlet("/")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.process(req, resp);
    }
    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setStatus(200);
        Enumeration en = request.getParameterNames();
        String value = "";
        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        while(en.hasMoreElements()) {
            // Get the name of the request parameter
            String name = (String)en.nextElement();
//            out.println(name);
            // Get the value of the request parameter
            value = request.getParameter(name);
//            out.println(value);
            // If the request parameter can appear more than once in the query string, get all values
            String[] values = request.getParameterValues(name);
        }
        out.close();
        request.setAttribute("name", value);

        request.getRequestDispatcher("answerpage.jsp").forward(request, response);
    }
}