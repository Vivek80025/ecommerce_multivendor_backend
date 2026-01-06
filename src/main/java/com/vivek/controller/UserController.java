package com.vivek.controller;

import com.vivek.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.exception.UserException;

import com.vivek.service.UserService;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@GetMapping("/profile")
	public ResponseEntity<User> getUserProfileHandler(
			@RequestHeader("Authorization") String jwt) throws UserException{

		System.out.println("/api/users/profile");
		User user=userService.findUserProfileByJwt(jwt);
		return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
	}


}
