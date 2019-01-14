package com.test.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER = 
			// MySQL Driver 5 이하
			// "com.mysql.jdbc.Driver";
			// MySQL Driver 6 이상 
			"com.mysql.cj.jdbc.Driver";
	
	private static final String URL = 
			// MySQL 5.6 이하
			// "jdbc:mysql://localhost:3306/test_web";
			// MySQL 5.7 이상
			"jdbc:mysql://localhost:3306/test_web?useSSL=false&serverTimezone=UTC";
	
	@Test
	public void testConnection() throws Exception {
		// load driver
		Class.forName(DRIVER);
		
		// connect to DBMS
		// try - with 구문 (jdk 1.7 이상 지원)
		// 예외 발생 시 자동으로 자원을 닫아준다(try문 내에 객체는 AutoClosable 인터페이스를 구현한 객체 사용) 
		try (Connection con = DriverManager.getConnection(URL, "testweb", "shdk2040")) {
			
			System.out.println(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
