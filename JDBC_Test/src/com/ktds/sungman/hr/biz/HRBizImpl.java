package com.ktds.sungman.hr.biz;


import java.util.List;

import com.ktds.sungman.hr.dao.HRDao;
import com.ktds.sungman.hr.dao.HRDaoImpl;
import com.ktds.sungman.hr.vo.EmployeesVO;;

public class HRBizImpl implements HRBiz {
	private HRDao hrDao;
	public HRBizImpl() {
		hrDao = new HRDaoImpl();
	}
	@Override
	public void printAllEmployees() {
		List<EmployeesVO> allEmployees = hrDao.getAllEmployees();
		for (EmployeesVO employeesVO : allEmployees) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\t%d\t%f\t%d\t%d\n",
					employeesVO.getEmployeeId()
					, employeesVO.getFirstName()
					, employeesVO.getLastName()
					, employeesVO.getEmail()
					, employeesVO.getPhoneNumber()
					, employeesVO.getHireDate()
					, employeesVO.getJobId()
					, employeesVO.getSalary()
					, employeesVO.getCommissionPct()
					, employeesVO.getManagerId()
					, employeesVO.getDepartmentId());
		}
					
					
		}
	@Override
	public void printAllEmployeesWithDepartments() {
		List<EmployeesVO> allEmployees = hrDao.getAllEmployeesWithDepartments();
		for (EmployeesVO employeesVO : allEmployees) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\t%d\t%f\t%d\t%d\t%d\t%s\t%d\t%d\n",
					employeesVO.getEmployeeId()
					, employeesVO.getFirstName()
					, employeesVO.getLastName()
					, employeesVO.getEmail()
					, employeesVO.getPhoneNumber()
					, employeesVO.getHireDate()
					, employeesVO.getJobId()
					, employeesVO.getSalary()
					, employeesVO.getCommissionPct()
					, employeesVO.getManagerId()
					, employeesVO.getDepartmentId()
					, employeesVO.getDepartments().getDepartmentId()
					, employeesVO.getDepartments().getDepartmentName()
					, employeesVO.getDepartments().getManagerId()
					, employeesVO.getDepartments().getLocationId());
		}
	}
	@Override
	public void printAllEmployeesWithJobs() {
		List<EmployeesVO> allEmployees = hrDao.getAllEmployeesWithJobs();
		for (EmployeesVO employeesVO : allEmployees) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\t%d\t%f\t%d\t%d\t%s\t%s\t%d\t%d\n",
					employeesVO.getEmployeeId()
					, employeesVO.getFirstName()
					, employeesVO.getLastName()
					, employeesVO.getEmail()
					, employeesVO.getPhoneNumber()
					, employeesVO.getHireDate()
					, employeesVO.getJobId()
					, employeesVO.getSalary()
					, employeesVO.getCommissionPct()
					, employeesVO.getManagerId()
					, employeesVO.getDepartmentId()
					, employeesVO.getJobs().getJobId()
					, employeesVO.getJobs().getJobTitle()
					, employeesVO.getJobs().getMaxSalary()
					, employeesVO.getJobs().getMinSalary());
		
	}
}
}
