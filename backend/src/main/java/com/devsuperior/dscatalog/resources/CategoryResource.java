package com.devsuperior.dscatalog.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.services.CategoryService;

@RestController
@CrossOrigin
@RequestMapping(value = "/categories")
public class CategoryResource {

	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findall() {
		List<Category> list = service.findall();
		return ResponseEntity.ok(list);
	}
	
}
