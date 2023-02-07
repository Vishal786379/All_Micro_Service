package com.project.InventoryService.Service;

import java.util.List;

import com.project.InventoryService.InventoryServiceApplication;
import com.project.InventoryService.Model.InventoryService;

public interface InventorySer {
	
	InventoryService saveInventory(InventoryService inventoryService);
	
	List<InventoryService> getAllInventory();
}
