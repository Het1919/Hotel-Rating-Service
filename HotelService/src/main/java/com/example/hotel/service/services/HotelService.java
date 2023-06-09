package com.example.hotel.service.services;

import java.util.List;

import com.example.hotel.service.entities.Hotel;

public interface HotelService {

	//create
	Hotel create(Hotel hotel);
	
	//getAll
	List<Hotel> getAll();
	
	//get single
	Hotel get(String id);
}
