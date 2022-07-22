package com.my.hr.service;

import java.util.List;

import com.my.hr.dao.UserDao;
import com.my.hr.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}	
	
	@Override
	public List<User> getUsers() {
		
		return userDao.selectUser();
	}

}
