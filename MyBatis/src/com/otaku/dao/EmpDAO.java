package com.otaku.dao;

import java.util.List;

import com.otaku.entity.Emp;

public interface EmpDAO {
	public void save(Emp emp);
	public void update(Emp emp);
	public void delete(int no);
	public Emp findByNo(int no);
	public List<Emp> findAll();
}
