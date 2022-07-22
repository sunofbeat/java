package com.my.hr.dao;

import java.util.List;

import com.my.hr.domain.User;

public interface UserDao {
	List<User> selectUser();
	public void insertUser(User user);
}
