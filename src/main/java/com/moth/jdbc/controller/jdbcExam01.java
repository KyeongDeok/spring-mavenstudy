package com.moth.jdbc.controller;

import com.moth.dao.RoleDao01;
import com.moth.dto.Role;

public class jdbcExam01 {
	public static void main(String [] args) {
		RoleDao01 dao = new RoleDao01();
		Role role = dao.getRole(501);
		System.out.println(role);
	}
}
