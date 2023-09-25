package com.jpa.demo.allrequests.jpa;

public class UpdateRequestJPA {

	private String gpuname;
	private String company;
	private String gpuid;
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
	public String getGpuid() {
		return gpuid;
	}
	public void setGpuid(String gpuid) {
		this.gpuid = gpuid;
	}
	@Override
	public String toString() {
		return "UpdateRequestJPA [gpuname=" + gpuname + ", company=" + company + ", gpuid=" + gpuid + "]";
	}
	
}
