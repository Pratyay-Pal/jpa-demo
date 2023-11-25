package com.jpa.demo.springdatajparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.demo.constants.SqlQuery;
import com.jpa.demo.entity.gpuinfo;

import jakarta.transaction.Transactional;

public interface GpuSpringDataJpaRepositoryJPA extends JpaRepository<gpuinfo, Integer>{
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(SqlQuery.gpuInfoUpdateQuerySpringDataJpa)
	int updateByGpuname(@Param("gpuname") String gpuname, @Param("company") String company);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(SqlQuery.gpuInfoDeleteQuerySpringDataJpa)
	int deleteByGpuname(@Param("gpuname") String gpuname);
	
	gpuinfo getByGpuname(String gpuname);
}
