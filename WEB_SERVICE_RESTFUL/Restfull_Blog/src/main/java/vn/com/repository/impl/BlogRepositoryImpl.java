package vn.com.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import vn.com.model.Blog;
import vn.com.repository.BlogRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Transactional
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query = em.createQuery("SELECT b FROM Blog b", Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(Long id) {
        TypedQuery<Blog> query = em.createQuery("SELECT b FROM Blog b WHERE b.id=:id", Blog.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void save(Blog model) {
        if (model.getId() != null) {
            em.merge(model); // merge cap nhat 1 doi tuong
        } else {
            em.persist(model); // persist luu 1 doi tuong
        }
    }

    @Override
    public void remove(Long id) {
        Blog blog = findById(id);
        if (blog != null) {
            em.remove(blog);
        }
    }
}
