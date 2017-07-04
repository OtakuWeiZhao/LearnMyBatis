package com.otaku.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.otaku.dao.EmpDAO;
import com.otaku.entity.Emp;

public class Test1 {
	public static void main(String[] args) {
		String conf = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		EmpDAO empDao = ac.getBean("jdbcEmpDao1", EmpDAO.class);
		List<Emp> list = empDao.findAll();
		for (Emp emp : list) {
			System.out.println(emp.getEmpno() + " " + emp.getEname());
		}
	}
}
