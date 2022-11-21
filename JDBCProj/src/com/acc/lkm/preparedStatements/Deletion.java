package com.acc.lkm.preparedStatements;
import java.sql.*;

public class Deletion {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc", "root","root");

			PreparedStatement ps = conn.prepareStatement("delete from employeedet where empid=?");
			ps.setInt(1, 3);
			int res = ps.executeUpdate();
			System.out.println(res + " Deleted");
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
