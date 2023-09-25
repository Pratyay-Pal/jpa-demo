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
import com.jpa.demo.jdbcrepository.GpuJdbcRepositoryDao;

@RestController
@RequestMapping("/SpringJDBC")
public class SpringJdbcController {

	private Logger logger = LogManager.getLogger(SpringJdbcController.class);
	
	@Autowired
	private GpuJdbcRepositoryDao repository;
	
	@PostMapping("/insert")
	public ResponseEntity<?> insertRecordUsingSpringJDBC(@RequestBody InsertRequestJDBC insertRequest){
		logger.info("/insertRecordUsingSpringJDBC Request received : "+insertRequest.toString());
		repository.insert(insertRequest.getGpuname(), insertRequest.getCompany());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> updateRecordUsingSpringJDBC(@RequestBody UpdateRequestJDBC updateRequest){
		logger.info("/updateRecordUsingSpringJDBC Request received : "+updateRequest.toString());
		repository.update(updateRequest.getGpuname(), updateRequest.getCompany());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> deleteRecordUsingSpringJDBC(@RequestBody DeleteRequestJDBC deleteRequest){
		logger.info("/deleteRecordUsingSpringJDBC Request received : "+deleteRequest.toString());
		repository.delete(deleteRequest.getGpuname());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/select")
	public ResponseEntity<SelectResponse> selectRecordUsingSpringJDBC(@RequestBody SelectRequestJDBC selectRequest){
		logger.info("/selectRecordUsingSpringJDBC Request received : "+selectRequest.toString());
		gpuinfo gpu = repository.select(selectRequest.getGpuname());
		SelectResponse selectResponse = new SelectResponse();
		selectResponse.setCompany(gpu.getCompany());
		selectResponse.setGpuname(gpu.getGpuname());
		selectResponse.setGpuid(gpu.getGpuid()+"");
		logger.info("GPU : "+gpu.toString());
		return new ResponseEntity<SelectResponse>(selectResponse,HttpStatus.OK);
	}
	
}
