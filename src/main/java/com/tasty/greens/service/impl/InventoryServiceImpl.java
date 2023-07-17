package com.tasty.greens.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tasty.greens.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Value("${inventory.service.url}")
	private String inventoryServiceUrl;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String getInventoryCatalog() {
		ResponseEntity<String> inventoryCatalog = restTemplate
				.getForEntity(inventoryServiceUrl+"/catalog", String.class);
		return inventoryCatalog.getBody();
	}

	@Override
	public String getCatalogProductsByType(String type) {
		ResponseEntity<String> inventoryCatalog = restTemplate
				.getForEntity(inventoryServiceUrl+"/catalog?type="+type, String.class);
		return inventoryCatalog.getBody();
	}

}
