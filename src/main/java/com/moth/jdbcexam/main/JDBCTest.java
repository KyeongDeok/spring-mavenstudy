package com.moth.jdbcexam.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.moth.dto.Role;
import com.moth.jdbcexam.config.ApplicationConfig;
import com.moth.jdbcexam.dao.RoleDao;

public class JDBCTest {
	public static void main(String [] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		RoleDao roleDao = ac.getBean(RoleDao.class);
		
		Role role = new Role();
		role.setRoleId(500);
		role.setDescription("Programmer");
		
//		int count = roleDao.insert(role);
		
		int count  = roleDao.update(role);
		System.out.println(count + "입력하였습니다.");
		
		Role resultRole = roleDao.selectById(501);
		System.out.println(resultRole);
				
		int deleteCount = roleDao.deleteById(500);
		System.out.println(deleteCount + "건 삭제하였습니다.");
			
		Role resultRole2 = roleDao.selectById(500);
		System.out.println(resultRole2);
		
	}
}
