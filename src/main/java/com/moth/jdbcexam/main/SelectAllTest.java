package com.moth.jdbcexam.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.moth.dto.Role;
import com.moth.jdbcexam.config.ApplicationConfig;
import com.moth.jdbcexam.dao.RoleDao;

public class SelectAllTest {

	public static void main(String [] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		RoleDao roleDao = ac.getBean(RoleDao.class);
		
		List <Role> list = roleDao.selectAll();
		
		for(Role role : list) {
			System.out.println(role);
		}
	}
}
