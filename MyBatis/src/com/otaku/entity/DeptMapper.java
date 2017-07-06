package com.otaku.entity;

import java.util.List;

public interface DeptMapper {
	public void addDept(Dept dept);
	public void updateDept(Dept dept);
	public void deleteById(int id);
	public void findById(int id);
	public List<Dept> findAll();
}
