package com.exam.service;

import java.util.Set;

import com.exam.model.User;
import com.exam.model.UserRole;

public interface UserService {

	// for creating new user
	public User createUser(User user, Set<UserRole> userRoles);
	
	// for getting the existing username
	public User getUser(String username);
	
	// to delete user
	public void deleteUser(Long userId);
}
