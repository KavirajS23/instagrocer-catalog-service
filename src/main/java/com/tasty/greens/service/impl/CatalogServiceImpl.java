package com.tasty.greens.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tasty.greens.service.CatalogService;
import com.tasty.greens.service.InventoryService;

@Service
public class CatalogServiceImpl implements CatalogService {
	
	@Autowired
	private InventoryService inventoryService;

	@Override
	public String getCatalog() {
		return inventoryService.getInventoryCatalog();
	}

	@Override
	public String getProductsByCatalogType(String type) {
		return inventoryService.getCatalogProductsByType(type);
	}

}
