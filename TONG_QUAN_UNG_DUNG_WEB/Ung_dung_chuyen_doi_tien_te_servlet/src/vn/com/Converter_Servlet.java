package vn.com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Converter_Servlet",urlPatterns = "/converter")
public class Converter_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pr = response.getWriter();
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd =Float.parseFloat(request.getParameter("usd"));

        float vnd = usd * rate;

        pr.println("<html>");
        pr.println("<h1> Rate: " +  rate + "</h1>");
        pr.println("<h1> Usd: " +  usd + "</h1>");
        pr.println("<h1> Vnd: " +  vnd + "</h1>");
        pr.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
