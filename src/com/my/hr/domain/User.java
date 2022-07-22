package com.my.hr.domain;

import java.time.LocalDate;

public class User {
	private int id;
	private String name;
	private LocalDate regDate;
	
	public User(String name, int id, LocalDate regDate) {
		this.id = id;
		this.name = name;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return String.format("%3s %6s    %8s", id, name, regDate);
	}
}
