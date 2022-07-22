package com.my.hr;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.my.hr.dao.UserDao;
import com.my.hr.dao.UserDaoImpl;
import com.my.hr.domain.User;
import com.my.hr.presentation.Console;
import com.my.hr.presentation.UserIo;
import com.my.hr.service.UserService;
import com.my.hr.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		
		UserDao userDao = new UserDaoImpl(users);
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		userIo.play();
		
		
		
	}
}
