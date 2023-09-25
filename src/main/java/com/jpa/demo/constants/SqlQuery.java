package com.jpa.demo.constants;

public class SqlQuery {

	public static final String gpuInfoInsertQuery = "insert into gpuinfo (gpuname, company) values(?,?)";
	public static final String gpuInfoUpdateQuery = "update gpuinfo set company = ? where gpuname = ?";
	public static final String gpuInfoDeleteQuery = "delete from gpuinfo where gpuname = ?";
	public static final String gpuInfoSelectQuery = "select * from gpuinfo where gpuname = ?";
	
	public static final String gpuInfoUpdateQuerySpringDataJpa = "update gpuinfo set company = :company where gpuname = :gpuname";
	public static final String gpuInfoDeleteQuerySpringDataJpa = "delete from gpuinfo where gpuname = :gpuname";

}
