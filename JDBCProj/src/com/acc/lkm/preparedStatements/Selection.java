package com.acc.lkm.preparedStatements;

import java.sql.*;

public class Selection {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc", "root","root");

			
			  PreparedStatement ps=conn.prepareStatement("SELECT * from EMPLOYEEDET"); 
			  ResultSet rs=ps.executeQuery();
			  while(rs.next()) 
			  {
					System.out.println(rs.getInt(1)+" "+rs.getDate(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		  
			  }
			 

			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
