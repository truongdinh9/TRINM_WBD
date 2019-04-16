package com.code.respository.impl;

import com.code.model.Customer;
import com.code.respository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerImplement implements CustomerRepository {
    @Override
    public List<Customer> lisCustomers() {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(new Customer("Tri", "30/07/1997", "ThaiBinh", ""));
        listCustomer.add(new Customer("Tri", "30/07/1997", "ThaiBinh", ""));
        listCustomer.add(new Customer("Tri", "30/07/1997", "ThaiBinh", ""));
        listCustomer.add(new Customer("Tri", "30/07/1997", "ThaiBinh", ""));
        return listCustomer;
    }
}
