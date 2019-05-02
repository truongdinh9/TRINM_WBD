package vn.com.service.impl;

import vn.com.model.Product;
import vn.com.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private  static List<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1,"computer",30000));
        products.add(new Product(2,"candy",20000));
        products.add(new Product(3,"pie",30000));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product find(int id) {
        for (Product product :  products){
            if (product.getId() == id){
                return product;
            }
        }
        return  null;
    }
}
