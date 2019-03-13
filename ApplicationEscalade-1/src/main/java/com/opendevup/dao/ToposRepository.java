package com.opendevup.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.opendevup.model.Topos;

public interface ToposRepository extends CrudRepository<Topos, Long> {
	
	
	public List<Topos> findByLocalisation(String localisation);

}
