package vn.com.restful.repository.impl;

import org.springframework.transaction.annotation.Transactional;
import vn.com.restful.model.Customer;
import vn.com.restful.repository.CustomerRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Transactional
public class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("SELECT c FROM Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(Long id) {
        TypedQuery<Customer> query = em.createQuery("SELECT c FROM Customer c  WHERE c.id=:id",Customer.class);
        query.setParameter("id",id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return  null;
        }
    }

    @Override
    public void save(Customer model) {
        if (model.getId() != null){
            em.merge(model); // merge cap nhat 1 doi tuong
        }else {
            em.persist(model); //persist luu 1 doi tuong moi
        }
    }

    @Override
    public void remove(Long id) {
        Customer customer = findById(id);
        if (customer != null){
            em.remove(customer);
        }
    }
}
