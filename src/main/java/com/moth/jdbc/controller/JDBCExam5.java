package com.moth.jdbc.controller;

import com.moth.dao.RoleDao01;
import com.moth.dto.Role;

public class JDBCExam5 {
	public static void main(String[] args) {
		//수정테스트
				int roleId = 501;
				String description = "CEO";
				
				Role role = new Role(roleId, description);
				
				RoleDao01 dao = new RoleDao01();
				int updateCount = dao.updateRole(role);

				System.out.println(updateCount);
			} 
}
