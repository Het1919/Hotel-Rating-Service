package com.example.rating.service.services;

import java.util.List;

import com.example.rating.service.entities.Rating;

public interface RatingService {

	//create
	Rating createRating(Rating rating);
	
	//get all ratings
	List<Rating> getRatings();
	
	//get all by UserId
	List<Rating> getRatingByUserId(String userId);
	
	//get all by HotelId
	List<Rating> getRatingByHotelId(String hotelId);
}
