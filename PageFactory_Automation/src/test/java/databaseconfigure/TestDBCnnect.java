package databaseconfigure;

import java.sql.SQLException;

public class TestDBCnnect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBConfigure.getDataTable("select * from employees", "First_Name", "Employee_id");
	}
	
}
