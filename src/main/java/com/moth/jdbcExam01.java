package com.moth;

import com.moth.dao.RoleDao;
import com.moth.dto.Role;

public class jdbcExam01 {
	public static void main(String [] args) {
		RoleDao dao = new RoleDao();
		Role role = dao.getRole(1);
		System.out.println(role);
	}
}
