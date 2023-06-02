import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		
		System.out.println("Trying to load the Driver ....");
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded....");
			
			System.out.println("Trying to connect to the DB  ");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected : "+conn);
			
			
			
			PreparedStatement pst = conn.prepareStatement("UPDATE DEPT SET DNAME=?, LOC=? WHERE DEPTNO=?");
			System.out.println("PreparedStatement created");
			System.out.println("Query fired and got the result1....");
			
			pst.setString(1, "InfoTech");
			pst.setString(2, "New Mumbai");
			
			pst.setInt(3, 10);
			
			int rows= pst.executeUpdate();
			System.out.println("ROW UPDATED : "+rows);
			
			pst.close();
			conn.close();
			
			System.out.println("Disconnected from the DB");
			
		} 
		
		catch (SQLException e) {
				System.out.println("Some problem : "+e);

		}
		
	}
}

