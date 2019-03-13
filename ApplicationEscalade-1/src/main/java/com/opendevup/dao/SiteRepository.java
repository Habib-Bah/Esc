package com.opendevup.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.opendevup.model.Site;

public interface SiteRepository extends CrudRepository<Site, Long> {
	
	List<Site> findByLocalisation(String localisation);
}
