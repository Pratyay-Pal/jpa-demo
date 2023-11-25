package com.jpa.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.allrequests.jdbcandspringdatajpa.DeleteRequestJDBC;
import com.jpa.demo.allrequests.jdbcandspringdatajpa.InsertRequestJDBC;
import com.jpa.demo.allrequests.jdbcandspringdatajpa.SelectRequestJDBC;
import com.jpa.demo.allrequests.jdbcandspringdatajpa.SelectResponse;
import com.jpa.demo.allrequests.jdbcandspringdatajpa.UpdateRequestJDBC;
import com.jpa.demo.entity.gpuinfo;
import com.jpa.demo.springdatajparepository.GpuSpringDataJpaRepositoryDAO;

@RestController
@RequestMapping("/SpringDataJPA")
public class SpringDataJpaController {

	private Logger logger = LogManager.getLogger(SpringDataJpaController.class);
	
	@Autowired
	private GpuSpringDataJpaRepositoryDAO springDataJpaRepositoryDAO;
	
	@PostMapping("/insert")
	public ResponseEntity<?> insertRecordUsingSpringDataJpa(@RequestBody InsertRequestJDBC insertRequest){
		logger.info("/insertRecordUsingSpringDataJpa Request received : "+insertRequest.toString());
		springDataJpaRepositoryDAO.insert(insertRequest.getGpuname(), insertRequest.getCompany());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> updateRecordUsingSpringDataJpa(@RequestBody UpdateRequestJDBC updateRequest){
		logger.info("/updateRecordUsingSpringDataJpa Request received : "+updateRequest.toString());
		springDataJpaRepositoryDAO.update(updateRequest.getGpuname(), updateRequest.getCompany());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> deleteRecordUsingJPA(@RequestBody DeleteRequestJDBC deleteRequest){
		logger.info("/deleteRecordUsingJPA Request received : "+deleteRequest.toString());
		springDataJpaRepositoryDAO.delete(deleteRequest.getGpuname());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/select")
	public ResponseEntity<SelectResponse> selectRecordUsingJPA(@RequestBody SelectRequestJDBC selectRequest){
		logger.info("/selectRecordUsingJPA Request received : "+selectRequest.toString());
		gpuinfo gpu = springDataJpaRepositoryDAO.select(selectRequest.getGpuname());
		SelectResponse selectResponse = new SelectResponse();
		selectResponse.setCompany(gpu.getCompany());
		selectResponse.setGpuname(gpu.getGpuname());
		selectResponse.setGpuid(gpu.getGpuid()+"");
		logger.info("GPU : "+gpu.toString());
		return new ResponseEntity<SelectResponse>(selectResponse,HttpStatus.OK);
	}
	
}
