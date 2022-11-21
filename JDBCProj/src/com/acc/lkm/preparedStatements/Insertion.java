package com.acc.lkm.preparedStatements;
import java.sql.*;

public class Insertion {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc", "root","root");
			
			  PreparedStatement ps=conn.prepareStatement("insert into employeedet values(?,?,?,?,?)");
			  ps.setInt(1, 6);
			  ps.setDate(2, java.sql.Date.valueOf("2022-04-07"));
			  ps.setString(3, "Swati Rathore"); 
			  ps.setString(4,"Jr Developer"); 
			  ps.setInt(5, 67000); 
			  
			  int res=ps.executeUpdate(); 
			  System.out.println(res+" Inserted");		 

			
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
