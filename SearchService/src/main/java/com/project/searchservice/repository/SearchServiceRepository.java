package com.project.searchservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.searchservice.model.Search;


@Repository
public interface SearchServiceRepository extends JpaRepository<Search, Integer> {
	
}
