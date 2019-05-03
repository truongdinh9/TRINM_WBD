package vn.com.restful.repository;

import org.springframework.transaction.annotation.Transactional;
import vn.com.restful.base.Repository;
import vn.com.restful.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public interface CustomerRepository extends Repository<Customer > {


}
