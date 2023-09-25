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
import com.jpa.demo.allrequests.jdbcandspringdatajpa.SelectResponse;
import com.jpa.demo.allrequests.jdbcandspringdatajpa.UpdateRequestJDBC;
import com.jpa.demo.allrequests.jpa.DeleteRequestJPA;
import com.jpa.demo.allrequests.jpa.SelectRequestJPA;
import com.jpa.demo.allrequests.jpa.UpdateRequestJPA;
import com.jpa.demo.entity.gpuinfo;
import com.jpa.demo.jparepository.GpuJpaRepositoryDao;

@RestController
@RequestMapping("/JPA")
public class JpaController {

	private Logger logger = LogManager.getLogger(JpaController.class);
	
	@Autowired
	private GpuJpaRepositoryDao repository;
	
	@PostMapping("/insert")
	public ResponseEntity<?> insertRecordUsingJPA(@RequestBody InsertRequestJDBC insertRequest){
		logger.info("/insertRecordUsingJPA Request received : "+insertRequest.toString());
		repository.insert(insertRequest.getGpuname(), insertRequest.getCompany());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> updateRecordUsingJPA(@RequestBody UpdateRequestJPA updateRequest){
		logger.info("/updateRecordUsingJPA Request received : "+updateRequest.toString());
		repository.updateById(updateRequest.getGpuid(), updateRequest.getGpuname(), updateRequest.getCompany());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> deleteRecordUsingJPA(@RequestBody DeleteRequestJPA deleteRequest){
		logger.info("/deleteRecordUsingJPA Request received : "+deleteRequest.toString());
		repository.deleteById(deleteRequest.getGpuid());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/select")
	public ResponseEntity<SelectResponse> selectRecordUsingJPA(@RequestBody SelectRequestJPA selectRequest){
		logger.info("/selectRecordUsingJPA Request received : "+selectRequest.toString());
		gpuinfo gpu = repository.findById(selectRequest.getGpuid());
		SelectResponse selectResponse = new SelectResponse();
		selectResponse.setCompany(gpu.getCompany());
		selectResponse.setGpuname(gpu.getGpuname());
		selectResponse.setGpuid(gpu.getGpuid()+"");
		logger.info("GPU : "+gpu.toString());
		return new ResponseEntity<SelectResponse>(selectResponse,HttpStatus.OK);
	}
	
}
