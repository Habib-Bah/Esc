package com.opendevup.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opendevup.model.Topos;

public interface ToposRepository extends JpaRepository<Topos, Long> {
	
	
	public List<Topos> findByLocalisation(String localisation);
	
	//@Query("select t from Topos t where t.localisation like x" )
	//public Page<Topos> chercherTopo(@Param("x")String localisation, Pageable pageable);

}
