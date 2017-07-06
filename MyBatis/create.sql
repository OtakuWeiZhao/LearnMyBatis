CREATE DATABASE mybatis;

USE mybatis;

CREATE TABLE t_emp(
 emp_no INT PRIMARY KEY,
 e_name VARCHAR(20),
 job VARCHAR(10),
 mgr INT,
 hiredate DATE,
 sal DOUBLE,
 comm DOUBLE,
 dept_no INT
);

INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (1, 'MISHIMA', 'CLERK', 3, '2013-05-10', 800, NULL, 20);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (2, 'KYOUKO', 'SALESMAN', 3, '2013-06-30', 1500, NULL, 10);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (3, 'HANA', 'SALESMAN', 3, '2012-07-11', 2000, NULL, 20);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (4, 'NERO', 'MANAGER', 3, '2014-05-27', 9000, 200, 30);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (5, 'SHIRAISHI', 'CLERK', 3, '2013-04-18', 750, NULL, 22);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (6, 'MEGUMI', 'ANAYLST', 3, '2011-06-10', 1200, 200, 2);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (7, 'OKITEGAMI', 'PRESIDENT', 3, '2015-08-10', 5000, 500, 2);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (8, 'ZHANGSAN', 'CLERK', 3, '2017-06-19', 900, NULL, 12);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (9, 'NERO', 'CLERK', 3, '2014-05-21', 950, NULL, 23);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (10, 'OTAKU', 'MANAGER', 3, '2011-09-18', 2000, 120, 25);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (11, 'AOI', 'CLERK', 3, '2015-06-11', 620, NULL, 2);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (12, 'KOISORA', 'PRESIDENT', 3, '2000-07-11', 5000, 500, 12);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (13, 'IZUMI', 'CLERK', 3, '2016-11-12', 520, NULL, 10);
INSERT INTO t_emp (emp_no, e_name, job, mgr, hiredate, sal, comm, dept_no) VALUES (14, 'YUZUI', 'MANAGER', 3, '2017-02-16', 1200, 150, 20);

USE mybatis;

CREATE TABLE t_dept(
  dept_no INT PRIMARY KEY,
  d_name VARCHAR(20),
  loc VARCHAR(50)
);

INSERT INTO t_dept VALUES(10, 'testing', 'beijing');
INSERT INTO t_dept VALUES(20, 'saling', 'shanghai');