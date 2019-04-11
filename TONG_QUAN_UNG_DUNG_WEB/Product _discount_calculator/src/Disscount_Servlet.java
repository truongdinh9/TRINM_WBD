import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Disscount_Servlet", urlPatterns = "/pay")
public class Disscount_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pr = response.getWriter();
        String listProduct = request.getParameter("listProduct");
        double price = Double.parseDouble(request.getParameter("price"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

        double discountAmount = price * discountPercent * 0.01 ;

        double discountPrice = price - discountAmount;
        pr.println("<html>");
        pr.println("<h1>List Product: " + listProduct + "</h1>");
        pr.println("<h1>Price: " + price + "</h1>");
        pr.println("<h1>Discount Percent: " + discountPercent + "</h1>");
        pr.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        pr.println("<h1>Discount Price: " + discountPrice + "</h1>");
        pr.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
