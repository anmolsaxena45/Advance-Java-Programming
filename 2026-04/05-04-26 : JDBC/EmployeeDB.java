package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver_name = "com.mysql.cj.jdbc.Driver";
		String host = "jdbc:mysql://localhost:3306/employeeDB";
		String username = "root";
		String pwd = "anmol2004";
		String create_table = """
				CREATE TABLE IF NOT EXISTS employee (
				id INT PRIMARY KEY AUTO_INCREMENT,
				name VARCHAR(50) NOT NULL,
				dept VARCHAR(50),
				salary DECIMAL(10, 2)
				)
				""";
		
		try {
			Class.forName(driver_name);
			System.out.println("Driver is Ready");
			Connection con = DriverManager.getConnection(host, username, pwd);
			System.out.println("Host is ready");
			
			Statement smt = con.createStatement();
			smt.execute(create_table);
			System.out.println("Table is ready");
			
//			int rowAffected = smt.executeUpdate("""
//					insert into employee (name, dept, salary) values ('Emp2', 'IT', 40000), ('Emp3', 'IT', 60000)
//					""");
//			
//			if(rowAffected>0) System.out.println("Record inserted");
//			else System.out.println("Record not inserted");
			
			ResultSet rs = smt.executeQuery("select * from employee");
			System.out.println("ID\t Name\t Dept\t\t Salary");
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				long salary = rs.getLong("salary");
				System.out.println(String.format("%d\t %s \t %s \t\t %d", id, name, dept, salary));
			}
			
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
//                                           Statement
//             ---------------------------------- ----------------------------------
//            |                                  |                                  |
//        Statement                      PreparedStatement                   CallableStatement