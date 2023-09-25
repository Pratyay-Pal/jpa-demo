package com.jpa.demo.jparepository;

import org.springframework.stereotype.Repository;

import com.jpa.demo.entity.gpuinfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class GpuJpaRepositoryDaoImpl implements GpuJpaRepositoryDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insert(String gpuname, String company) {
		gpuinfo gpu = new gpuinfo(gpuname, company);
		entityManager.merge(gpu);
	}

	@Override
	public void updateById(String gpuid, String gpuname, String company) {
		gpuinfo gpu = entityManager.find(gpuinfo.class, gpuid);
		gpu.setCompany(company);
		gpu.setGpuname(gpuname);
		entityManager.merge(gpu);
	}

	@Override
	public void deleteById(String gpuid) {
		gpuinfo gpu = entityManager.find(gpuinfo.class, gpuid);
		entityManager.remove(gpu);
	}

	@Override
	public gpuinfo findById(String gpuid) {
		return entityManager.find(gpuinfo.class, gpuid);
	}
	
}
