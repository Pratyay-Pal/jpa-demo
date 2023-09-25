package com.jpa.demo.jdbcrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jpa.demo.constants.SqlQuery;
import com.jpa.demo.entity.gpuinfo;

@Repository
@Component
public class GpuJdbcRepositoryDaoImpl implements GpuJdbcRepositoryDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	public void insert(String gpuname, String company) {
		jdbcTemplate.update(SqlQuery.gpuInfoInsertQuery, gpuname, company);
	}
	
	public void update(String gpuname, String company) {
		jdbcTemplate.update(SqlQuery.gpuInfoUpdateQuery, company, gpuname);
	}
	
	public void delete(String gpuname) {
		jdbcTemplate.update(SqlQuery.gpuInfoDeleteQuery, gpuname);
	}
	
	public gpuinfo select(String gpuname) {
		gpuinfo gpu = jdbcTemplate.queryForObject(SqlQuery.gpuInfoSelectQuery, new BeanPropertyRowMapper<>(gpuinfo.class),gpuname);
		return gpu;
	}
	
}
