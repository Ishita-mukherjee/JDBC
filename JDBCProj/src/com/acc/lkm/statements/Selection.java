package com.acc.lkm.statements;
import java.sql.*;


public class Selection {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc","root","root");
			Statement stmt=conn.createStatement();
			String sql="SELECT * from EMPLOYEEDET";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getDate(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			
			}
			conn.close();
		}
		catch(SQLException e) {
			System.out.println(e);
		}

	}

}
