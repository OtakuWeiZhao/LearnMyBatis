package com.otaku.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.otaku.entity.Emp;
import com.otaku.entity.EmpMapper;

public class JdbcEmpDAO1 extends JdbcDaoSupport implements EmpDAO {

	@Override
	public void save(Emp emp) {
		String sql = "insert into t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) "
				+ "values (?,?,?,?,?,?,?,?)";
		Object[] params = { emp.getEmpno(), emp.getEname(), emp.getJob(), emp.getMgr(), emp.getHiredate(), emp.getSal(),
				emp.getComm(), emp.getDeptno() };
		super.getJdbcTemplate().update(sql, params);
	}

	@Override
	public void update(Emp emp) {
		String sql = "update t_emp " + "set e_name=?,job=?,mgr=?,hiredate=?,sal=?,comm=?,deptno=?";
		Object[] params = { emp.getEmpno(), emp.getEname(), emp.getJob(), emp.getMgr(), emp.getHiredate(), emp.getSal(),
				emp.getComm(), emp.getDeptno() };
		super.getJdbcTemplate().update(sql, params);
	}

	@Override
	public void delete(int no) {
		String sql = "delete from t_emp where emp_no=?";
		Object[] params = { no };
		super.getJdbcTemplate().update(sql, params);
	}

	@Override
	public Emp findByNo(int no) {
		String sql = "select * from t_emp where emp_no=?";
		Object[] params = { no };
		RowMapper<Emp> mapper = new EmpMapper();
		Emp emp = super.getJdbcTemplate().queryForObject(sql, params, mapper);
		return emp;
	}

	@Override
	public List<Emp> findAll() {
		String sql = "select * from t_emp";
		RowMapper<Emp> mapper = new EmpMapper();
		List<Emp> list = super.getJdbcTemplate().query(sql, mapper);
		return list;
	}

}
