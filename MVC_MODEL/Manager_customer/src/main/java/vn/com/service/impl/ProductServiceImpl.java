package vn.com.service.impl;

import vn.com.model.Product;
import vn.com.service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"dell","2019-06-06",3000000));
        productMap.put(2,new Product(2,"asus","2019-06-06",2000000));
        productMap.put(3,new Product(3,"samsung","2019-06-06",1000000));
        productMap.put(4,new Product(4,"apple","2019-06-06",6000000));
        productMap.put(5,new Product(5,"huwei","2019-06-06",10000000));
    }
    @Override
    public List<Product> listProduct() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void create(Product product) {
        productMap.put(product.getProduct_id(),product);
    }

    @Override
    public Product findById(int  product_id) {
        return productMap.get(product_id);
    }

    @Override
    public void update(int product_id, Product product) {
        productMap.put(product_id,product);
    }

    @Override
    public Product remove(int product_id) {
       return productMap.remove(product_id);
    }
}
