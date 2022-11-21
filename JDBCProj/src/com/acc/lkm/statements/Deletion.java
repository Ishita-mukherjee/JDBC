package com.acc.lkm.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletion {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc","root","root");
			Statement stmt=conn.createStatement();
			int res=stmt.executeUpdate("delete from employeedet where empid=13");
			System.out.println(res+ " Records deleted");
			conn.close();
		}
		catch(SQLException e) {
			System.out.println(e);
		}

	}


}
