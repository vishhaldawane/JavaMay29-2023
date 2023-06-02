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
			System.out.println("Driver loaded....1");
			
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver loaded....2");
			
			
			System.out.println("Trying to connect to the DB 1 ");
			Connection conn1 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connected : "+conn1);
			
			System.out.println("Trying to connect to the DB 2 ");
			Connection conn2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
			System.out.println("Connected : "+conn2);
			
			
			Statement statement1 = conn1.createStatement();
			System.out.println("Statement 1 made");
			
			Statement statement2 = conn1.createStatement();
			System.out.println("Statement 2 made");
			
			ResultSet rs1 = statement1.executeQuery("SELECT * FROM DEPT");
			System.out.println("Query fired and got the result1....");
			
			ResultSet rs2 = statement1.executeQuery("SELECT * FROM DEPT");
			System.out.println("Query fired and got the result2....");
			
			while(rs1.next()) {
				System.out.println("HSQL> DEPNO :"+rs1.getInt(1));
				System.out.println("HSQL> DNAME :"+rs1.getString(2));
				System.out.println("HSQL> LOC   :"+rs1.getString(3));
				System.out.println("----------------------");
			}
			System.out.println("==============================");
			while(rs2.next()) {
				System.out.println("ORCL> DEPNO :"+rs2.getInt(1));
				System.out.println("ORCL> DNAME :"+rs2.getString(2));
				System.out.println("ORCL> LOC   :"+rs2.getString(3));
				System.out.println("----------------------");
			}
			
			rs1.close();
			rs2.close();
			
			statement1.close();
			statement2.close();
			
			conn1.close();
			conn2.close();
			
			System.out.println("Disconnected from the DB");
			
		} catch (SQLException e) {
				System.out.println("Some problem : "+e);

		}
		
	}
}
