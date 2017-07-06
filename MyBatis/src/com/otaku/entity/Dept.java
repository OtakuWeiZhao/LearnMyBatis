package com.otaku.entity;

public class Dept {
	private Integer dept_no;
	private String d_name;
	private String loc;

	public Integer getDeptno() {
		return dept_no;
	}

	public void setDeptno(Integer deptno) {
		this.dept_no = deptno;
	}

	public String getDname() {
		return d_name;
	}

	public void setDname(String dname) {
		this.d_name = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
