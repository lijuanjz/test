package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestTemo {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc��������ɹ���");
			//�������ݿ�����
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String uid = "wanglj";
			String passwd = "brcb1234";

			conn = DriverManager.getConnection(url, uid, passwd);
			System.out.println("jdbc���ӳɹ�");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				System.out.println("���ݿ����ӹر�");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
