package databaseconfigure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
	
		Class.forName("oracle.jdbc.driver.OracleDriver"); // JDBC location
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs =stmt.executeQuery("select * from employees");
		ArrayList<String> columnValue = new ArrayList<>();
		while(rs.next()) {
			columnValue.add(rs.getString("Last_name"));
		}
		System.out.println(columnValue);
		connection.close();
	}
	
	}
