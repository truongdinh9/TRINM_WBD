package vn.com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Dictional_Servlet",urlPatterns = "/dictional")
public class Dictional_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dic = new HashMap<>();
        dic.put("Hello","Xin chao");
        dic.put("How","Lam the nao");
        dic.put("Book","Quyen vo");
        dic.put("Computer","May tinh");

        String search = request.getParameter("search");

        PrintWriter pr = response.getWriter();
        pr.println("<html>");
        String rs = dic.get(search);
        if ( rs != null){
            pr.println("Work: "  + search);
            pr.println("Result: " + rs);
        }else {
            pr.println("Not found");
        }
        pr.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
