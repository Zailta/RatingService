package com.microservice.RatingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.Exception.CustomException.ResourceNotFoundException;
import com.microservice.RatingEntity.RatingEntity;
import com.microservice.RatingRepository.RatingRepository;
import com.microservice.RatingService.RatingServiceInterface.RatingServiceInterface;
@Service
public class RatingServiceLayer implements RatingServiceInterface{
	@Autowired
	RatingRepository ratingRepository;
	@Override
	public RatingEntity createRating(RatingEntity bean) {
		RatingEntity savedrating = ratingRepository.save(bean);
		return savedrating;
	}

	@Override
	public RatingEntity getSingleRating(String ratingID) {
		RatingEntity singleRating = ratingRepository.findById(ratingID).orElseThrow(()->new ResourceNotFoundException("Rating", "ID", ratingID));
		return singleRating;
	}

	@Override
	public List<RatingEntity> getAllRatings() {
		List<RatingEntity> allratings = ratingRepository.findAll();
		return allratings;
	}

	

}
