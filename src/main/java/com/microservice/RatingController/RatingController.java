package com.microservice.RatingController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.RatingEntity.RatingEntity;
import com.microservice.RatingService.RatingServiceLayer;


@RestController
@RequestMapping(value = "/microservice/rating")
public class RatingController {
	@Autowired
	RatingServiceLayer service;
	@PostMapping(value = "/create")
	public ResponseEntity<RatingEntity> createUser( @RequestBody RatingEntity bean){
		RatingEntity creatdRating = service.createRating(bean);
		return ResponseEntity.ok(creatdRating);
	}
	//findSingle User
	@GetMapping(value = "/{ratingId}")
	public ResponseEntity<RatingEntity> findUser( @PathVariable String ratingId){
		RatingEntity singlerating = service.getSingleRating(ratingId);
		return ResponseEntity.ok(singlerating);
	}
	
	//FindAllusers
	@GetMapping(value = "/")
	public ResponseEntity<List<RatingEntity>> findAll(){
		List<RatingEntity> allratings = service.getAllRatings();
		return ResponseEntity.ok(allratings);
	}
	@GetMapping(value = "/fromuser/{userId}")
	public ResponseEntity<List<RatingEntity>> findRatingByUserId( @PathVariable String userId){
		List<RatingEntity> byuserIdContaining = service.getByuserIdContaining(userId);
		return ResponseEntity.ok(byuserIdContaining);
	}
	@GetMapping(value = "/fromhotel/{hotelId}")
	public ResponseEntity<List<RatingEntity>> findRatingByHotelId( @PathVariable String hotelId){
		  List<RatingEntity> byhotelIdContaining = service.getByhotelIdContaining(hotelId);
		return ResponseEntity.ok(byhotelIdContaining);
	}

}
