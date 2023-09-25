package com.jpa.demo.jparepository;

import com.jpa.demo.entity.gpuinfo;

public interface GpuJpaRepositoryDao {

	public void insert(String gpuname, String company);
	public void updateById(String gpuid, String gpuname, String company);
	public void deleteById(String gpuid);
	public gpuinfo findById(String gpuname);
	
}
