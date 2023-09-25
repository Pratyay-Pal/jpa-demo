package com.jpa.demo.allrequests.jdbcandspringdatajpa;

public class SelectResponse {

	private String gpuid;
	private String gpuname;
	private String company;
	public String getGpuid() {
		return gpuid;
	}
	public void setGpuid(String gpuid) {
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
		return "SelectResponse [gpuid=" + gpuid + ", gpuname=" + gpuname + ", company=" + company + "]";
	}
	
}
