package com.microservice.RatingService.RatingServiceInterface;

import java.util.List;

import com.microservice.RatingEntity.RatingEntity;

public interface RatingServiceInterface {
	
	RatingEntity createRating(RatingEntity bean) ;
	RatingEntity getSingleRating(String ratingID);
	List<RatingEntity> getAllRatings();
	List<RatingEntity> getByuserIdContaining(String userId);
	List<RatingEntity> getByhotelIdContaining(String hotelId);

}
