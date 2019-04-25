package vn.com.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import vn.com.model.Customer;
import vn.com.model.Province;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
