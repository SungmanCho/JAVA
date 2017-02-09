package com.ktds.sungman.hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.sungman.dao.support.JDBCDaoSupport;
import com.ktds.sungman.dao.support.QueryHandler;
import com.ktds.sungman.dao.support.annotaion.BindData;

import com.ktds.sungman.hr.vo.DepartmentsVO;
import com.ktds.sungman.hr.vo.EmployeesVO;
import com.ktds.sungman.hr.vo.JobsVO;

public class HRDaoImpl extends JDBCDaoSupport implements HRDao {

	@Override
	public List<EmployeesVO> getAllEmployees() {
		
		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				
				StringBuffer query = new StringBuffer();
				query.append(" SELECT EMPLOYEE_ID ");
				query.append(" 		, FIRST_NAME ");
				query.append("		, LAST_NAME ");
				query.append("		, EMAIL ");
				query.append("		, PHONE_NUMBER ");
				query.append("		, JOB_ID ");
				query.append(" 		, SALARY ");
				query.append(" 		, COMMISSION_PCT ");
				query.append(" 		, MANAGER_ID ");
				query.append(" 		, DEPARTMENT_ID ");
				query.append(" 		, HIRE_DATE ");
				query.append(" 		, DEPARTMENT_ID ");
				query.append(" FROM		EMPLOYEES ");
				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return employeesVO;
			}
			
		});
	}

	@Override
	public EmployeesVO findOneEmployee(int employeeId) {
		return(EmployeesVO) selectOne(new QueryHandler() {
			
			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();
				query.append(" SELECT EMPLOYEE_ID ");
				query.append(" 		, FIRST_NAME ");
				query.append("		, LAST_NAME ");
				query.append("		, EMAIL ");
				query.append("		, PHONE_NUMBER ");
				query.append("		,JOB_ID ");
				query.append(" 		,SALARY ");
				query.append(" 		,COMMISSION_PCT ");
				query.append(" 		,MANAGER_ID ");
				query.append(" 		,DEPARTMENT_ID ");
				query.append(" 		,HIRE_DATE ");
				query.append(" 		,DEPARTMENT_ID ");
				query.append(" FROM		EMPLOYEES ");
				query.append(" WHERE 	EMPLOYEE_ID = ? ");// TODO Auto-generated method stub
				return query.toString();
			}
			
			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setInt(1, employeeId);
			}
			
			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return employeesVO;
				
			}
		});
	}

	@Override
	public List<EmployeesVO> getAllEmployeesWithDepartments() {

		selectList(new QueryHandler(){
			@Override
			public String preparedQuery() {
				String query = " SELECT " + "   EMPLOYEE_ID, FIRST_NAME, LAST_NAME,  "
						+ "   EMAIL, PHONE_NUMBER, HIRE_DATE,  " + "   JOB_ID, SALARY, COMMISSION_PCT,  "
						+ "   MANAGER_ID, DEPARTMENT_ID " + " FROM HR.EMPLOYEES ";
				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) {
			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return employeesVO;
			}
			
		});
		
		// 1. Oracle Driver Loading.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패! 시스템을 종료합니다.");
			return null;
		}

		// 2. JDBC Instance 생성
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// 3. Oracle Instance에 연결
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "1012");

			// 4. 쿼리를 만든다.
			String query = " SELECT " + "   E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME,  "
					+ "   E.EMAIL, E.PHONE_NUMBER, E.HIRE_DATE,  " + "   E.JOB_ID, E.SALARY, E.COMMISSION_PCT,  "
					+ "   E.MANAGER_ID, E.DEPARTMENT_ID, " + "   D.DEPARTMENT_ID D_DEPARTMENT_ID, D.DEPARTMENT_NAME, "
					+ "   D.MANAGER_ID D_MANAGER_ID, " + "   D.LOCATION_ID " + " FROM EMPLOYEES E, "
					+ "   DEPARTMENTS D " + " WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID ";

			// 5. 쿼리를 실행한다.
			stmt = conn.prepareStatement(query);

			// 6. 쿼리의 실행결과를 얻어온다.
			rs = stmt.executeQuery();

			// 6-1. 쿼리의 실행결과를 List 객체에 할당한다.
			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();

			DepartmentsVO departmentVO = null;

			while (rs.next()) {
				// 6-2. ROW의 정보를 employeesVO에 셋팅한다.
				employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
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
				BindData.bindData(rs, departmentVO);
				departmentVO.setDepartmentId(rs.getInt("D_DEPARTMENT_ID"));
				departmentVO.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				departmentVO.setManagerId(rs.getInt("D_MANAGER_ID"));
				departmentVO.setLocationId(rs.getInt("LOCATION_ID"));

				// 6-3. employees 에 employeesVO를 add한다.
				employees.add(employeesVO);
			}

			// 7. return 한다.
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Oracle 인스턴스에 연결하지 못했습니다. 시스템을 종료합니다.");
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
			System.out.println("오라클 드라이버 로딩 실패! 시스템을 종료합니다.");
			return null;
		}

		// 2. JDBC Instance 생성
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// 3. Oracle Instance에 연결
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "1012");

			// 4. 쿼리를 만든다.
			String query = " SELECT " + "   E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME,  "
					+ "   E.EMAIL, E.PHONE_NUMBER, E.HIRE_DATE,  " + "   E.JOB_ID, E.SALARY, E.COMMISSION_PCT,  "
					+ "   E.MANAGER_ID, E.DEPARTMENT_ID, " + "   J.JOB_ID J.JOB_ID, J.JOB_TITLE, "
					+ "   J.MAX_SALARY,  " + " J.MIN_SALARY " + " FROM EMPLOYEES E, " + "   JOBS J  "
					+ " WHERE E.DEPARTMENT_ID = J.JOB_ID ";

			// 5. 쿼리를 실행한다.
			stmt = conn.prepareStatement(query);

			// 6. 쿼리의 실행결과를 얻어온다.
			rs = stmt.executeQuery();

			// 6-1. 쿼리의 실행결과를 List 객체에 할당한다.
			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();

			JobsVO jobsVO = null;

			while (rs.next()) {
				// 6-2. ROW의 정보를 employeesVO에 셋팅한다.
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

				// 6-3. employees 에 employeesVO를 add한다.
				employees.add(employeesVO);
			}

			// 7. return 한다.
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Oracle 인스턴스에 연결하지 못했습니다. 시스템을 종료합니다.");
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
