package com.rkvision.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rkvision.model.Rating;
import com.rkvision.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingController {
	
	/*
	 * @GetMapping("/{movieId}") public Rating getRating(@PathVariable("movieId")
	 * String movieId) { return new Rating(movieId,4); }
	 */
	
	
	@GetMapping("users/{userId}")
	public UserRating getRatingforUser(@PathVariable("userId") String userId) {
		//get all rated movie id's
		List<Rating> ratings = Arrays.asList(
				
				new Rating("550",4),
				new Rating("500",5) 
				); 
		
		
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		
		return userRating;
				
	}

}
