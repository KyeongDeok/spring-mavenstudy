package com.moth;

import java.util.List;

import com.moth.dao.RoleDao;
import com.moth.dto.Role;

public class jdbcExam03 {
	public static void main(String [] args) {
		RoleDao dao = new RoleDao();
		
		List <Role> list = dao.getRoles();
		
		for(Role role : list) {
			System.out.println(role);
		}
	}
}
