package com.moth.diexam01;

public class UserBean {
/*
 * 1. 기본생성자를 선언
 * 2. 필드는 private
 * 3. getter setter를 가진다 -> 네임 프로퍼티.
 */
	
	private String name;
	private int age;
	private boolean male;
	
	public UserBean() {}
	public UserBean(String name, int age, boolean male) {
		this.name = name;
		this.age = age;
		this.male = male;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
}
