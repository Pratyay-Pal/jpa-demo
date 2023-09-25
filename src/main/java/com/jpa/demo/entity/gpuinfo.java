package com.jpa.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class gpuinfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="gpuid")
	private int gpuid;
	@Column(name="gpuname")
	private String gpuname;
	@Column(name="company")
	private String company;
	
	public int getGpuid() {
		return gpuid;
	}

	public void setGpuid(int gpuid) {
		this.gpuid = gpuid;
	}	

	public String getGpuname() {
		return gpuname;
	}

	public void setGpuname(String gpuname) {
		this.gpuname = gpuname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "gpuinfo [gpuid=" + gpuid + ", gpuname=" + gpuname + ", company=" + company + "]";
	}

	public gpuinfo(String gpuname, String company) {
		this.gpuname = gpuname;
		this.company = company;
	}
	
	public gpuinfo() {

	}
	
}
