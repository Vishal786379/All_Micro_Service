package com.project.InventoryService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.InventoryService.Model.InventoryService;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryService, Integer> {

}
