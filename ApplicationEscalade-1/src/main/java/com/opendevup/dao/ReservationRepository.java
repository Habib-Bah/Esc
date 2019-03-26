package com.opendevup.dao;

import org.springframework.data.repository.CrudRepository;

import com.opendevup.model.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long>{

}
