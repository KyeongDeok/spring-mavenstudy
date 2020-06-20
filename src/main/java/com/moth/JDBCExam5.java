package com.moth;

import com.moth.dao.RoleDao;
import com.moth.dto.Role;

public class JDBCExam5 {
	public static void main(String[] args) {
		//수정테스트
				int roleId = 501;
				String description = "CEO";
				
				Role role = new Role(roleId, description);
				
				RoleDao dao = new RoleDao();
				int updateCount = dao.updateRole(role);

				System.out.println(updateCount);
			} 
}
