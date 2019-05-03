package vn.com.restful.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import vn.com.restful.model.Customer;
import vn.com.restful.repository.CustomerRepository;
import vn.com.restful.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
