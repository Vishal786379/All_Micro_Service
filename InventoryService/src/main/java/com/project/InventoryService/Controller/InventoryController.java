package com.project.InventoryService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.InventoryService.Model.InventoryService;
import com.project.InventoryService.Service.InventorySerImpl;

@RestController
@RequestMapping("inventory")
public class InventoryController {
	
	@Autowired
	private InventorySerImpl inventorySerImpl;
	
	@PostMapping("save")
	public InventoryService saveInventory(@RequestBody InventoryService inventoryService){
		return inventorySerImpl.saveInventory(inventoryService);
	}
	
	@GetMapping("getall")
	public List<InventoryService> getAllInventory(){
		return inventorySerImpl.getAllInventory();
	}
}
