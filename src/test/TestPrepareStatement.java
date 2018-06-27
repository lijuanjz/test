package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestPrepareStatement {
	static void test(){
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:ORCL";
			String uid="wanglj";
			String passwd="brcb1234";
			conn=DriverManager.getConnection(url, uid, passwd);
			
			String sql="select * from  student";
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
	}

}
