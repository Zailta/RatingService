package com.microservice.RatingEntity;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RatingEntity {

	@Id
	@UuidGenerator
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedback;

}
