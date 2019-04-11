package vn.com.controller;

import vn.com.model.Caculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CaculatorServlet",urlPatterns = "/calculate")
public class CaculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float fisrtOperand = Float.parseFloat(request.getParameter("firstOperand"));
        float secondOperand = Float.parseFloat(request.getParameter("secondOperand"));
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter pr = response.getWriter();
        pr.println("<html>");
        pr.println("<h1>Result: </h1>");
        try {
            float result = Caculator.calculate(fisrtOperand,secondOperand,operator);
            pr.println(fisrtOperand + " " + operator + " " + secondOperand + " = " + result);
        }catch (Exception e){
            pr.println("Error: " + e.getMessage());
        }
        pr.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
