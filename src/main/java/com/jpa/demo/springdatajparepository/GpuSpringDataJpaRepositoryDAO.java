package com.jpa.demo.springdatajparepository;

import com.jpa.demo.entity.gpuinfo;

public interface GpuSpringDataJpaRepositoryDAO {

	public void insert(String gpuname, String company);
	public void update(String gpuname, String company);
	public void delete(String gpuname);
	public gpuinfo select(String gpuname);
	
}
