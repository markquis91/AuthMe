import java.sql.*;

public class Dbcon {

	final String dbstring = "jdbc:sqlite:/Users/markquissimmons/eclipse-workspace/HappyFood/HappyFoodData.db";
	
	public java.sql.Connection getConnection() {
		try {
			java.sql.Connection connection = DriverManager.getConnection(dbstring);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
