package com.project.productcatlog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.productcatlog.Model.ProductCatlog;

@Repository
public interface ProductCatlogRepository extends JpaRepository<ProductCatlog, Integer> {

}
