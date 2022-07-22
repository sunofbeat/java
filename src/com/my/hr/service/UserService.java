package com.my.hr.service;

import java.util.List;

import com.my.hr.domain.User;

public interface UserService {
	List<User> getUsers();
	void addUser(User user);
}
