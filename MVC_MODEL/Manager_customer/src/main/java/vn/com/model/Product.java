package vn.com.model;

public class Product {
    private int product_id;
    private String product_name;
    private String nsx;
    private double price;

    public Product() {
    }

    public Product(int product_id, String product_name, String nsx, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.nsx = nsx;
        this.price = price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
