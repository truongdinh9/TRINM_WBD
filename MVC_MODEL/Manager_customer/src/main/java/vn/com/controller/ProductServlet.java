package vn.com.controller;

import vn.com.model.Product;
import vn.com.service.ProductService;
import vn.com.service.impl.ProductServiceImpl;

import javax.imageio.IIOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = "/products")
public class ProductServlet extends HttpServlet {

    private ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = " ";
        }
        switch (action) {
            case "create":
                createProduct(request,response);
                break;
            case "update":
                updateProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            default:
                break;
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.remove(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error.jsp");
        } else {
            request.setAttribute("product", product);
           response.sendRedirect("/products");
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id =Integer.parseInt( request.getParameter("id"));
        String name = request.getParameter("name");
        String nsx = request.getParameter("nsx");
        double price = Double.parseDouble(request.getParameter("price"));

        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher = request.getRequestDispatcher("error.jsp");
        }else {
            product.setProduct_name(name);
            product.setNsx(nsx);
            product.setPrice(price);
            this.productService.update(id,product);
            request.setAttribute("product",product);
            response.sendRedirect("/products");
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String product_name = request.getParameter("name");
        String nsx = request.getParameter("nsx");
        double price = Double.parseDouble(request.getParameter("price"));
        int product_id = (int) (Math.random()*10000);

        Product product = new Product(product_id,product_name,nsx,price);
        this.productService.create(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        request.setAttribute("message","New product");
        try{
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreate(request,response);
                break;
            case "update":
                showUpdate(request,response);
                break;
            case "delete":
                showDelete(request,response);
                break;
            case "view":
                view(request,response);
                break;
            default:
                listProduct(request,response);
                break;
        }
    }

    private void showDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id =Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher = request.getRequestDispatcher("error.jsp");
        }else {
            request.setAttribute("product",product);
            dispatcher =request.getRequestDispatcher("product/delete.jsp");
        }
        dispatcher.forward(request,response);
    }


    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher = request.getRequestDispatcher("error.jsp");
        }else {
            request.setAttribute("product",product);
            dispatcher = request.getRequestDispatcher("product/update.jsp");
        }
        dispatcher.forward(request,response);
    }
    private void view(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher = request.getRequestDispatcher("error.jsp");
        }else {
            request.setAttribute("product",product);
            dispatcher = request.getRequestDispatcher("product/view.jsp");
        }
        dispatcher.forward(request,response);
    }
    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        dispatcher.forward(request,response);
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = this.productService.listProduct();
        request.setAttribute("listProduct",products);

        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
