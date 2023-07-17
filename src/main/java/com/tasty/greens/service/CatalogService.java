package com.tasty.greens.service;

import org.springframework.stereotype.Service;

@Service
public interface CatalogService {

	public String getCatalog();
	public String getProductsByCatalogType(String type);
}
