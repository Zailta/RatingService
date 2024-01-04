package com.microservice.RatingRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.RatingEntity.RatingEntity;
@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, String> {
	List<RatingEntity> findByuserId(String userId);
	List<RatingEntity> findByhotelId(String hotelId);

}
