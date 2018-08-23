import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.connections.MyConnection;

public class DemoFetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Connection con = MyConnection.getMyConnection();
		
		String FIND_ALL_EMPLOYEES = "select * from Emp1";
		
		try {
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

			ResultSet set = st.executeQuery(FIND_ALL_EMPLOYEES);
			
			DatabaseMetaData metaData = con.getMetaData();
			
			ResultSetMetaData resultSetMetaData = set.getMetaData();
			System.out.println("No. of col:-"+resultSetMetaData.getColumnCount());
			
//			for(int i = 1; i<=resultSetMetaData.getColumnCount();i++){
//				System.out.println(resultSetMetaData.getColumnLabel(i));
//				
//			}
			while(set.next()) {
				int empId = set.getInt(1);
				String name = set.getString(2);
				int salary = set.getInt(3);
				
				
				
				set.updateInt(3, 15000);
				set.updateRow();
				System.out.println(empId+" "+ salary);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
