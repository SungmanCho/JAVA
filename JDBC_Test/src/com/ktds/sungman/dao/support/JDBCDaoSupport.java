package com.ktds.sungman.dao.support;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JDBCDaoSupport {

	public List selectList(QueryHandler queryHandler) {

		loadOracleDriver();

		// 2. JDBC Instance ����
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();

			// Query �����ϱ�..
			String query = queryHandler.preparedQuery();
			stmt = conn.prepareStatement(query);

			// �Ķ���� �����ϱ�
			queryHandler.mappingParameters(stmt);

			rs = stmt.executeQuery();

			List result = new ArrayList();
			while (rs.next()) {
				// ROW ��ü �����ϱ�
				result.add(queryHandler.getData(rs));
			}

			return result;

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			close(conn, stmt, rs);
		}
	}

	public Object selectOne(QueryHandler queryHandler) {

		loadOracleDriver();

		// 2. JDBC Instance ����
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();

			// Query �����ϱ�..
			String query = queryHandler.preparedQuery();
			stmt = conn.prepareStatement(query);

			// �Ķ���� �����ϱ�
			queryHandler.mappingParameters(stmt);

			rs = stmt.executeQuery();

			Object result = null;
			if (rs.next()) {
				// ROW ��ü �����ϱ�
				result = queryHandler.getData(rs);
			}

			return result;

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			close(conn, stmt, rs);
		}
	}

	private void loadOracleDriver() {
		// 1. Oracle Driver Loading.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	private Connection getConnection() throws SQLException {
		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		return DriverManager.getConnection(oracleUrl, "HR", "1012");
	}

	private void close(Connection conn, PreparedStatement stmt, ResultSet rs) {
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
