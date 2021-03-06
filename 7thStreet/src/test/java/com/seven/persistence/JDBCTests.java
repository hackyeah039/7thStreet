package com.seven.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;


@Log4j
public class JDBCTests {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testconnection() {
		try(Connection con = DriverManager.getConnection("jdbc:log4jdbc:oracle:thin:@localhost:1521:XE", "book_ex", "book_ex")) {
			
		} catch (Exception e) {
		}
	}

}
