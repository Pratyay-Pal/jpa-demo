package com.jpa.demo.springdatajparepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.demo.entity.gpuinfo;

@Component
public class GpuSpringDataJpaRepositoryDAOImpl implements GpuSpringDataJpaRepositoryDAO{

	private Logger logger = LogManager.getLogger(GpuSpringDataJpaRepositoryDAOImpl.class);
	
	@Autowired
	private GpuSpringDataJpaRepositoryJPA repository;
	
	public void insert(String gpuname, String company) {
		gpuinfo gpu = new gpuinfo(gpuname, company);
		repository.save(gpu);
	}

	public void update(String gpuname, String company) {
		logger.info(repository.updateByGpuname(gpuname, company)+" row(s) updated");
	}
	
	public void delete(String gpuname) {
		logger.info(repository.deleteByGpuname(gpuname)+" row(s) deleted");
	}
	
	public gpuinfo select(String gpuname) {
		return repository.getByGpuname(gpuname);
	}
	
}
