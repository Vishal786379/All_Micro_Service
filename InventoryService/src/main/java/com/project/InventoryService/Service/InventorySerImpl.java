package com.project.InventoryService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.InventoryService.Model.InventoryService;
import com.project.InventoryService.Repository.InventoryRepository;

@Service
public class InventorySerImpl implements InventorySer{
	
	@Autowired
	private InventoryRepository inventoryRepository;

	@Override
	public InventoryService saveInventory(InventoryService inventoryService) {
		return inventoryRepository.save(inventoryService);
	}

	@Override
	public List<InventoryService> getAllInventory() {
		return inventoryRepository.findAll();
	}
	
}
