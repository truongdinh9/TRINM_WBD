package vn.com.service;

import vn.com.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProduct();
    void create(Product product);
    Product findById(int product_id);
    void update(int product_id,Product product);
    Product  remove(int product_id);
}
