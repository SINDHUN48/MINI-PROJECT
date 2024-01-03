import java.sql.*;

public class DButil {
	private static final String URL="jdbc:mysql://localhost:3306/SVHEC";
	private static final String USERNAME="root";
	private static final String PASSWORD="npsjg6763";
	
	public static Connection getConnectionObj() {
	try{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}
	catch(ClassNotFoundException e) {
		System.out.println("Error"+e.getMessage());
		}
	catch(SQLException e) {
		System.out.println("Error"+e);
		
	}
	         return null;
	}
}
