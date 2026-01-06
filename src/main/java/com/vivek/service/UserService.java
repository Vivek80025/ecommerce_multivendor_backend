package com.vivek.service;

import com.vivek.exception.UserException;
import com.vivek.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
