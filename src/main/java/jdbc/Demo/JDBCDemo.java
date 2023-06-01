package jdbc.Demo;

import java.sql.*;

public class JDBCDemo {
	public static void main(String[] args) {

		try {
			String username = "root";
			String password = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");// driver class
			// create connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatemorning",
					username, password);

			Statement statement = connection.createStatement();// create Statement

			ResultSet rs = statement.executeQuery("select * from song");// Execute Query
			while (rs.next())

				System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " = " + rs.getString(3));

			connection.close();// close connection

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}