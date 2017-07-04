package com.otaku.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpMapper implements RowMapper<Emp>{

	@Override
	public Emp mapRow(ResultSet rs, int rowIndex) throws SQLException {
		Emp emp = new Emp();
		emp.setEmpno(rs.getInt("EMP_NO"));
		emp.setEname(rs.getString("E_NAME"));
		emp.setJob(rs.getString("JOB"));
		emp.setMgr(rs.getInt("MGR"));
		emp.setHiredate(rs.getDate("HIREDATE"));
		emp.setSal(rs.getDouble("SAL"));
		emp.setComm(rs.getDouble("COMM"));
		emp.setDeptno(rs.getInt("DEPT_NO"));
		return emp;
	}
	
}
