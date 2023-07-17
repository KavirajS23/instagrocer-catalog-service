package com.tasty.greens.service;

import org.springframework.stereotype.Service;

@Service
public interface InventoryService {

	public String getInventoryCatalog();
	public String getCatalogProductsByType(String type);
}
