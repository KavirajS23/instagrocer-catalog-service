package com.tasty.greens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tasty.greens.service.CatalogService;

@RestController
public class CatalogsController {
	
	@Autowired
	private CatalogService catalogService;

	@GetMapping
	public ResponseEntity<Object> getCatalogs(@RequestParam(name="type", defaultValue = "", required = false) String type) {
		if(!"".equals(type)) {
			return new ResponseEntity<>(catalogService.getProductsByCatalogType(type), HttpStatus.OK);
		}
		return new ResponseEntity<>(catalogService.getCatalog(), HttpStatus.OK);
	}
}
