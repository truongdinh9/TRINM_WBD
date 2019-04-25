package vn.com.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import vn.com.model.Province;

public interface ProvinceRepository  extends PagingAndSortingRepository<Province,Long> {
}
