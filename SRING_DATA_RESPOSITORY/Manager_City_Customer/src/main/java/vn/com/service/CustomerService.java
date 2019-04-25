package vn.com.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.com.model.Customer;
import vn.com.model.Province;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(String firstName,Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
