package com.otaku.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.otaku.entity.Dept;

public class TestMybatis {
	@Test
	public void testInsert() throws IOException {
		String conf = "SqlMapConfig.xml";
		Reader reader = Resources.getResourceAsReader(conf);
		// 创建SessionFactory对象
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory sf = sfb.build(reader);

		// 创建Session
		SqlSession session = sf.openSession();

		Dept dept = new Dept();
		dept.setDeptno(60);
		dept.setDname("testing");
		dept.setLoc("beijing");
		session.insert("addDept", dept);
		session.commit();
		session.close();
	}
	
	@Test
	public void testUpdate() throws IOException{
		String conf = "SqlMapConfig.xml";
		Reader reader = Resources.getResourceAsReader(conf);
		// 创建SessionFactory对象
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory sf = sfb.build(reader);

		// 创建Session
		SqlSession session = sf.openSession();
		
		Dept dept = (Dept)session.selectOne("findById", 60);
		dept.setDname("开发部");
		dept.setLoc("北京");
		
		session.update("updateDept", dept);
		session.commit();
		session.close();
	}
	
	@Test
	public void testDelete() throws IOException{
		String conf = "SqlMapConfig.xml";
		Reader reader = Resources.getResourceAsReader(conf);
		// 创建SessionFactory对象
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory sf = sfb.build(reader);

		// 创建Session
		SqlSession session = sf.openSession();
		session.delete("deleteById", 60);
		session.commit();
		session.close();
	}
	
	@Test
	public void testFindById() throws IOException{
		String conf = "SqlMapConfig.xml";
		Reader reader = Resources.getResourceAsReader(conf);
		// 创建SessionFactory对象
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory sf = sfb.build(reader);

		// 创建Session
		SqlSession session = sf.openSession();
		Dept dept = (Dept)session.selectOne("findById", 20);
		System.out.println(dept.getDeptno() + " " + dept.getDname() + " " + dept.getLoc());
		session.close();
	}
	
	@Test
	public void testFindAll() throws IOException{
		String conf = "SqlMapConfig.xml";
		Reader reader = Resources.getResourceAsReader(conf);
		// 创建SessionFactory对象
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory sf = sfb.build(reader);

		// 创建Session
		SqlSession session = sf.openSession();
		List<Dept> list = session.selectList("findAll");	
		for(Dept dept : list){
			System.out.println(dept.getDeptno() + " " + dept.getDname() + " " + dept.getLoc());
		}
		session.close();
	}
}
