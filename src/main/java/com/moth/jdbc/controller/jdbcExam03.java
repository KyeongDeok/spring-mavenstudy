package com.moth.jdbc.controller;

import java.util.List;

import com.moth.dao.RoleDao01;
import com.moth.dto.Role;

public class jdbcExam03 {
	public static void main(String [] args) {
		RoleDao01 dao = new RoleDao01();
		
		List <Role> list = dao.getRoles();
		
		for(Role role : list) {
			System.out.println(role);
		}
	}
}
