package vn.com.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import vn.com.base.Repository;
import vn.com.model.Blog;

public interface BlogRepository extends Repository<Blog> {

}
