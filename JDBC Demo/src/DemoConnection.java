import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName = CITI", "sa", "sa123");
			System.out.println("Connection successful");
			
			String INSERT_Emp = "insert into Emp1 values(1,'city',1000)";
			Statement st = con.createStatement();
			int rows = st.executeUpdate(INSERT_Emp);
			System.out.println("rows inserted:-" + rows);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
