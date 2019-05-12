package com.vn.code.mokup.type.repository;


import com.vn.code.mokup.entity.Type;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeRepository extends PagingAndSortingRepository<Type,Long> {

}
