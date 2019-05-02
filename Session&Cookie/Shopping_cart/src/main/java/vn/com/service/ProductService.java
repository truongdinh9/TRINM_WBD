package vn.com.service;

import vn.com.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product find(int id);
}
