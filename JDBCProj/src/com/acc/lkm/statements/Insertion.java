package com.acc.lkm.statements;

import java.sql.*;

public class Insertion {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc","root","root");
			Statement stmt=conn.createStatement();
			int res=stmt.executeUpdate("insert into employeedet values(13,'2022-11-10','Ranjan Jha','Python',45000)");
			System.out.println(res+ " Records inserted");
			conn.close();
		}
		catch(SQLException e) {
			System.out.println(e);
		}

	}

}
