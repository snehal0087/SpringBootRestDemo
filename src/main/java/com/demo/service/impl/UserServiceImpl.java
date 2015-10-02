package com.demo.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;
import org.springframework.util.Assert;

@Service
public class UserServiceImpl implements UserService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(User user) {
		Assert.notNull(user, "User must not be null");
		userRepository.save(user);
		log.debug("User save successfully ");
	}

	@Override
	public User updateUser(User user) {
		Assert.notNull(user, "User must not be null");
		User oldUser = userRepository.findOne(user.getId());
		Assert.notNull(oldUser, "Old User must not be null");
		oldUser.setName(user.getName());
		oldUser.setAddress(user.getAddress());
		log.debug("{} updated ",oldUser);
		return userRepository.saveAndFlush(oldUser);
	}

	@Override
	public void deleteUser(Long userId) {
		Assert.notNull(userId, "userId must not be null");
		userRepository.delete(userId);
		log.debug("User with userId {} deleted successfully", userId);
	}

	@Override
	public List<User> getAllUsers() {
		Assert.notNull(userRepository.getAllUsers(), "user list must not be null");
		return userRepository.getAllUsers();
	}

}
