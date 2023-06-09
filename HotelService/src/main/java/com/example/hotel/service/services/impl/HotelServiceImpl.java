package com.example.hotel.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.service.entities.Hotel;
import com.example.hotel.service.exceptions.ResourceNotFoundException;
import com.example.hotel.service.repositories.HotelRepository;
import com.example.hotel.service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setHotelId(hotelId);
		return this.hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return this.hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		return this.hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found !! "+id));
	}

}
