package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.entity.ItemEntity;
import com.example.api.repo.ItemRepo;
@CrossOrigin(origins  = "*")
@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private ItemRepo itemRepo;
	
	@GetMapping
	public List<ItemEntity> getItem(){
		return itemRepo.findAll();
		
	}
	
	
	@PostMapping
	public ItemEntity addItem(@RequestBody ItemEntity newItem) {
		return itemRepo.save(newItem);
	}
	
	
	
}
