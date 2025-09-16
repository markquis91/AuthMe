import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Identity {

	
	public boolean verified(String ogDob, String dob) {
		if (!ogDob.equals(dob)) return false;
		return ogDob.equals(dob);
	}
	
	
	public String getDob(Connection connection, String dateOfBirth) {
		String sql = "SELECT name, date_of_birth FROM users WHERE date_of_birth = ?";
		
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setString(1, dateOfBirth);
			try (ResultSet results = statement.executeQuery()) {
				if (results.next()) {
					String name = results.getString("name");
					String dbDob = results.getString("date_of_birth");
					
					if (verified(dateOfBirth,dbDob)) {
						System.out.println("DOB VERIFIED.");
						return name;
					} else {
						System.out.println("DOB NOT CONFIRMED");
					}
				}
			};
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
