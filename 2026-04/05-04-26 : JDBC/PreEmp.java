package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver_name = "com.mysql.cj.jdbc.Driver";
		String host = "jdbc:mysql://localhost:3306/employeeDB";
		String username = "root";
		String pwd = "anmol2004";
		String query = "select * from employee where salary >= ?";
		long inSalary = 400;
		
		String insertQuery = "insert into employee \r\n"
				+ "				(name, dept, salary) values (?, ?, ?)";
		
		//String updateQuery = "update employee set name = Emp8 where id = 8";
			try {
			Class.forName(driver_name);
			System.out.println("Driver is Ready");
			Connection con = DriverManager.getConnection(host, username, pwd);
			System.out.println("Host is ready");
			
//			PreparedStatement inPst = con.prepareStatement(insertQuery);
//			inPst.setString(1, "Emp7");
//			inPst.setString(2, "MCA");
//			inPst.setLong(3, 65000);
//			inPst.executeUpdate();
			
			//update query
//			PreparedStatement upPst = con.prepareStatement(updateQuery);
//			upPst.executeUpdate();
			
			
			PreparedStatement  pst = con.prepareStatement(query);
			pst.setLong(1, inSalary);
			ResultSet rs = pst.executeQuery();
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
//    These are completed             These are not completed
//    statement.