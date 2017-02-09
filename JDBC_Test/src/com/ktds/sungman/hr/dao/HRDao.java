package com.ktds.sungman.hr.dao;

import java.util.List;


import com.ktds.sungman.hr.vo.*;


public interface HRDao {

	public List<EmployeesVO> getAllEmployees();
	public EmployeesVO findOneEmployee(int employeeId);//사원 번호 찾기
	public List<EmployeesVO> getAllEmployeesWithDepartments();
	public List<EmployeesVO> getAllEmployeesWithJobs();
}
