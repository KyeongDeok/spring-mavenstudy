package com.moth.jdbc.controller;

import com.moth.dao.RoleDao01;

public class JDBCExam4 {
	public static void main(String[] args) {
//삭제 테스트
		int roleId = 1;

		RoleDao01 dao = new RoleDao01();
		int deleteCount = dao.deleteRole(roleId);

		System.out.println(deleteCount);
	}
}
