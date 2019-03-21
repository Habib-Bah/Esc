package com.opendevup.dao;

import org.springframework.data.repository.CrudRepository;

import com.opendevup.model.AppUser;

public interface AppUserRepository extends CrudRepository<AppUser, Long>{

	//AppUser findByName(String nom);
	
	
}
