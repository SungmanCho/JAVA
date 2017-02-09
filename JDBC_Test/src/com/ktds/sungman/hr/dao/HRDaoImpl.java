package com.ktds.sungman.hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.sungman.hr.vo.*;

public class HRDaoImpl implements HRDao {

	@Override
	public List<EmployeesVO> getAllEmployees() {

		// 1. Oracle Driver Loading.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ ����̹� �ε� ����! �ý����� �����մϴ�.");
			return null;
		}

		// 2. JDBC Instance ����
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// 3. Oracle Instance�� ����
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "1012");

			// 4. ������ �����.
			String query = " SELECT " + "   EMPLOYEE_ID, FIRST_NAME, LAST_NAME,  "
					+ "   EMAIL, PHONE_NUMBER, HIRE_DATE,  " + "   JOB_ID, SALARY, COMMISSION_PCT,  "
					+ "   MANAGER_ID, DEPARTMENT_ID " + " FROM HR.EMPLOYEES ";

			// 5. ������ �����Ѵ�.
			stmt = conn.prepareStatement(query);

			// 6. ������ �������� ���´�.
			rs = stmt.executeQuery();

			// 6-1. ������ �������� List ��ü�� �Ҵ��Ѵ�.
			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();
			while (rs.next()) {
				// 6-2. ROW�� ������ employeesVO�� �����Ѵ�.
				employeesVO = new EmployeesVO();
				employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				employeesVO.setFirstName(rs.getString("FIRST_NAME"));
				employeesVO.setLastName(rs.getString("LAST_NAME"));
				employeesVO.setEmail(rs.getString("EMAIL"));
				employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				employeesVO.setHireDate(rs.getString("HIRE_DATE"));
				employeesVO.setJobId(rs.getString("JOB_ID"));
				employeesVO.setSalary(rs.getInt("SALARY"));
				employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
				employeesVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));

				// 6-3. employees �� employeesVO�� add�Ѵ�.
				employees.add(employeesVO);
			}

			// 7. return �Ѵ�.
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Oracle �ν��Ͻ��� �������� ���߽��ϴ�. �ý����� �����մϴ�.");
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}

	}

	@Override
	public List<EmployeesVO> getAllEmployeesWithDepartments() {
		// 1. Oracle Driver Loading.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ ����̹� �ε� ����! �ý����� �����մϴ�.");
			return null;
		}

		// 2. JDBC Instance ����
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// 3. Oracle Instance�� ����
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "1012");

			// 4. ������ �����.
			String query = " SELECT " + "   E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME,  "
					+ "   E.EMAIL, E.PHONE_NUMBER, E.HIRE_DATE,  " + "   E.JOB_ID, E.SALARY, E.COMMISSION_PCT,  "
					+ "   E.MANAGER_ID, E.DEPARTMENT_ID, " + "   D.DEPARTMENT_ID D_DEPARTMENT_ID, D.DEPARTMENT_NAME, "
					+ "   D.MANAGER_ID D_MANAGER_ID, " + "   D.LOCATION_ID " + " FROM EMPLOYEES E, "
					+ "   DEPARTMENTS D " + " WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID ";

			// 5. ������ �����Ѵ�.
			stmt = conn.prepareStatement(query);

			// 6. ������ �������� ���´�.
			rs = stmt.executeQuery();

			// 6-1. ������ �������� List ��ü�� �Ҵ��Ѵ�.
			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();

			DepartmentsVO departmentVO = null;
			

			while (rs.next()) {
				// 6-2. ROW�� ������ employeesVO�� �����Ѵ�.
				employeesVO = new EmployeesVO();
				employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				employeesVO.setFirstName(rs.getString("FIRST_NAME"));
				employeesVO.setLastName(rs.getString("LAST_NAME"));
				employeesVO.setEmail(rs.getString("EMAIL"));
				employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				employeesVO.setHireDate(rs.getString("HIRE_DATE"));
				employeesVO.setJobId(rs.getString("JOB_ID"));
				employeesVO.setSalary(rs.getInt("SALARY"));
				employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
				employeesVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));

				departmentVO = employeesVO.getDepartments();
				departmentVO.setDepartmentId(rs.getInt("D_DEPARTMENT_ID"));
				departmentVO.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				departmentVO.setManagerId(rs.getInt("D_MANAGER_ID"));
				departmentVO.setLocationId(rs.getInt("LOCATION_ID"));

				// 6-3. employees �� employeesVO�� add�Ѵ�.
				employees.add(employeesVO);
			}

			// 7. return �Ѵ�.
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Oracle �ν��Ͻ��� �������� ���߽��ϴ�. �ý����� �����մϴ�.");
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

			}
		}
	}

	@Override
	public List<EmployeesVO> getAllEmployeesWithJobs() {
		// 1. Oracle Driver Loading.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ ����̹� �ε� ����! �ý����� �����մϴ�.");
			return null;
		}

		// 2. JDBC Instance ����
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// 3. Oracle Instance�� ����
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "1012");

			// 4. ������ �����.
			String query = " SELECT " + "   E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME,  "
					+ "   E.EMAIL, E.PHONE_NUMBER, E.HIRE_DATE,  " + "   E.JOB_ID, E.SALARY, E.COMMISSION_PCT,  "
					+ "   E.MANAGER_ID, E.DEPARTMENT_ID, " + "   J.JOB_ID J.JOB_ID, J.JOB_TITLE, "
					+ "   J.MAX_SALARY,  " + " J.MIN_SALARY " + " FROM EMPLOYEES E, "
					+ "   JOBS J  " + " WHERE E.DEPARTMENT_ID = J.JOB_ID ";

			// 5. ������ �����Ѵ�.
			stmt = conn.prepareStatement(query);

			// 6. ������ �������� ���´�.
			rs = stmt.executeQuery();

			// 6-1. ������ �������� List ��ü�� �Ҵ��Ѵ�.
			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();

			JobsVO	jobsVO = null;

			while (rs.next()) {
				// 6-2. ROW�� ������ employeesVO�� �����Ѵ�.
				employeesVO = new EmployeesVO();
				employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				employeesVO.setFirstName(rs.getString("FIRST_NAME"));
				employeesVO.setLastName(rs.getString("LAST_NAME"));
				employeesVO.setEmail(rs.getString("EMAIL"));
				employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				employeesVO.setHireDate(rs.getString("HIRE_DATE"));
				employeesVO.setJobId(rs.getString("JOB_ID"));
				employeesVO.setSalary(rs.getInt("SALARY"));
				employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
				employeesVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));

				jobsVO = employeesVO.getJobs();
				jobsVO.setJobId(rs.getString("J_JOB_ID"));
				jobsVO.setJobTitle(rs.getString("JOB_TITLE"));
				jobsVO.setMaxSalary(rs.getInt("MAX_SALARY"));
				jobsVO.setMinSalary(rs.getInt("MIN_SALARY"));

				// 6-3. employees �� employeesVO�� add�Ѵ�.
				employees.add(employeesVO);
			}

			// 7. return �Ѵ�.
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Oracle �ν��Ͻ��� �������� ���߽��ϴ�. �ý����� �����մϴ�.");
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}
	}

}
