package com.moth.jdbcexam.dao;

import static com.moth.jdbcexam.dao.RoleDaoSqls.DELETE_BY_ROLE_ID;
import static com.moth.jdbcexam.dao.RoleDaoSqls.SELECT_ALL;
import static com.moth.jdbcexam.dao.RoleDaoSqls.SELECT_BY_ROLE_ID;
import static com.moth.jdbcexam.dao.RoleDaoSqls.UPDATE;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.moth.dto.Role;

@Repository
public class RoleDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Role> rowMapper = BeanPropertyRowMapper.newInstance(Role.class);
	
	//스프링 4.3부터 기본생성자가 없으면 자동으로 Bean을 파라미터로 주입.
	public RoleDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("role");
	}
	
	public List<Role> selectAll(){
		return jdbc.query(SELECT_ALL, Collections.emptyMap(), rowMapper);
	}
	
	public int insert(Role role) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(role);
		return insertAction.execute(params);
	}
	
	public int update(Role role) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(role);
		return jdbc.update(UPDATE,params);
	}
	
	public int deleteById(Integer id) {
		Map<String, ?> params = Collections.singletonMap("roleId", id);
		return jdbc.update(DELETE_BY_ROLE_ID, params);
	}
	
	public Role selectById(Integer id) {
		try {
			Map<String, ?> params = Collections.singletonMap("roleId", id);
			return jdbc.queryForObject(SELECT_BY_ROLE_ID, params, rowMapper);		
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}
}
