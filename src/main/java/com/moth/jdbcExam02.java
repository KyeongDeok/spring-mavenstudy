package com.moth;

import com.moth.dao.RoleDao;
import com.moth.dto.Role;

public class jdbcExam02 {
	public static void main(String [] args) {
		int roleId = 501;
		String description = "CTO";
		
		Role role = new Role(roleId, description);
		
		RoleDao dao = new RoleDao();
		int insertCount = dao.addRole(role);

		System.out.println(insertCount);
	}
}
