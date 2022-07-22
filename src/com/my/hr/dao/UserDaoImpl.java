package com.my.hr.dao;

import java.util.List;

import com.my.hr.domain.User;

public class UserDaoImpl implements UserDao{
	private List<User> users;
		
	public UserDaoImpl(List<User> users) {
		this.users = users;
	}

	@Override
	public List<User> selectUser() {
		return this.users;
	}
	
	@Override
	public void insertUser(User user) {
		users.add(user);
	}
}
