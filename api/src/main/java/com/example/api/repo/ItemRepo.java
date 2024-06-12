package com.example.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.entity.ItemEntity;

@Repository
public interface ItemRepo extends JpaRepository<ItemEntity, Long> {

	
}
