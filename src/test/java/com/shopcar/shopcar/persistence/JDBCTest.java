package com.shopcar.shopcar.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;
import org.junit.Test;

public class JDBCTest {
	private Logger logger = Logger.getLogger(JDBCTest.class);
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle")) {
			logger.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}

	}
}
