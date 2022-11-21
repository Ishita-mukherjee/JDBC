package com.acc.lkm.preparedStatements;
import java.sql.*;

public class Updation {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc", "root","root");

			
			  PreparedStatement ps=conn.prepareStatement("update employeedet set role=? where empid=?");
			  ps.setString(1, "Developer");
			  ps.setInt(2, 6);
			  int res=ps.executeUpdate(); 
			  System.out.println(res+" Updated");
			
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
