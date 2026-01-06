package com.vivek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	public User findByEmail(String username);

}
