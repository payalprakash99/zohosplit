package zohosplits.signuplogin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import zohosplits.signuplogin.model.Users;

public class UsersDao {
	public static int registerUser(Users user) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO Users" + "(USERNAME, EMAILID, PASSWORD) VALUES "+" (?, ?, ?);";

		int result = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8000/zohosplits?useSSL=false","root", "")){

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getEmailID());
			preparedStatement.setString(3, user.getPassword());

			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}
		return result;
	}

	public static boolean loginUser(String emailID, String password) throws ClassNotFoundException {
	
		//Users user = new Users();

		boolean st =false;
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8000/zohosplits","root","");
            PreparedStatement ps = con.prepareStatement("select USERID from Users where emailID=? and password=?");
            ps.setString(1, emailID);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            st = rs.next();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;
		
	}

	private static void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}