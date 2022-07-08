package com.nt.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.nt.model.Booking;



@Repository
public interface TravlingRepo extends JpaRepository<Booking,Integer> {
	
	
	public List<Booking> findByDestination(String dest);


}
