package com.microservice.RatingRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.RatingEntity.RatingEntity;
@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, String> {

}
