package com.jpa.demo.allrequests.jdbcandspringdatajpa;

public class InsertRequestJDBC {

	private String gpuname;
	private String company;

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
		return "InsertRequestJDBC [gpuname=" + gpuname + ", company=" + company + "]";
	}		
}
