package vn.com.service;

import vn.com.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> finfAll();
    void save(Customer customer);
    Customer findBy(int id);
    void update(int id,Customer customer);
    void remove(int id);
}
