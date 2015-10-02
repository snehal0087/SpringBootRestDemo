package com.demo.service;

import java.util.List;

import com.demo.model.User;

public interface UserService {
	public void addUser(User user);

	public User updateUser(User user);

	public void deleteUser(Long userId);

	public List<User> getAllUsers();
}
