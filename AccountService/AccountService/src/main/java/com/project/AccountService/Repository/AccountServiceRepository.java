package com.project.AccountService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.AccountService.Model.AccountService;

@Repository
public interface AccountServiceRepository extends JpaRepository<AccountService, Integer> {
	
}
