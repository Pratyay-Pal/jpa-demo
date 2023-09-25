package com.jpa.demo.jdbcrepository;

import com.jpa.demo.entity.gpuinfo;

public interface GpuJdbcRepositoryDao {

	public void insert(String gpuname, String company);
	public void update(String gpuname, String company);
	public void delete(String gpuname);
	public gpuinfo select(String gpuname);
	
}
