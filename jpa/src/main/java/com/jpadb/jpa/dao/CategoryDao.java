package com.jpadb.jpa.dao;

import com.jpadb.jpa.model.Category;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.function.Predicate;

public interface CategoryDao  extends CrudRepository<Category, Integer>,JpaSpecificationExecutor {

    @Query("select order_no,")
    public List<Category> getList();
}
