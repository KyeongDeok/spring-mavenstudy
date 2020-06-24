package com.moth.jdbc.controller;

import com.moth.dao.RoleDao01;
import com.moth.dto.Role;

public class jdbcExam02 {
	public static void main(String [] args) {
		int roleId = 501;
		String description = "CTO";
		
		Role role = new Role(roleId, description);
		
		RoleDao01 dao = new RoleDao01();
		int insertCount = dao.addRole(role);

		System.out.println(insertCount);
	}
}
