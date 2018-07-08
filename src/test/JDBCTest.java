package test;

import java.sql.*;
import java.util.*;

public class JDBCTest {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.
					getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe", 
							"kstad", "1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TAB");
			List<String> list = new ArrayList<>();
			while(rs.next()) {
				list.add(rs.getString("TNAME"));
			}
			System.out.println("테이블"+list);
		} catch (SQLException e) {
			System.out.println("에러발생");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
