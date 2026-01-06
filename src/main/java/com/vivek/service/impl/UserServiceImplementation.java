package com.vivek.service.impl;


import com.vivek.exception.UserException;
import com.vivek.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.vivek.config.JwtProvider;
import com.vivek.model.User;
import com.vivek.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {


	private final UserRepository userRepository;
	private final JwtProvider jwtProvider;
	private final PasswordEncoder passwordEncoder;
	private final JavaMailSender javaMailSender;

	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		String email=jwtProvider.getEmailFromJwtToken(jwt);
		
		
		User user = userRepository.findByEmail(email);
		
		if(user==null) {
			throw new UserException("user not exist with email "+email);
		}
		return user;
	}



	
	@Override
	public User findUserByEmail(String username) throws UserException {
		
		User user=userRepository.findByEmail(username);
		
		if(user!=null) {
			
			return user;
		}
		
		throw new UserException("user not exist with username "+username);
	}



}
