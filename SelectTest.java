import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		
		System.out.println("Trying to load the Driver ....");
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected : "+conn);
			
			Statement statement = conn.createStatement();
			System.out.println("Statement made");
			
			ResultSet rs = statement.executeQuery("SELECT * FROM DEPT");
			System.out.println("Query fired and got the result....");
			
			while(rs.next()) {
				System.out.println("DEPNO :"+rs.getInt(1));
				System.out.println("DNAME :"+rs.getString(2));
				System.out.println("LOC   :"+rs.getString(3));
				System.out.println("----------------------");
			}
			rs.close();
			statement.close();
			conn.close();
			
			System.out.println("Disconnected from the DB");
			
		} catch (SQLException e) {
				System.out.println("Some problem : "+e);

		}
		
	}
}
