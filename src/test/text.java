package test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class text {
	static void test(String sql){
         System.out.println("���Կ�ʼ��������������������");
			
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc��������ɹ���");
			//�������ݿ�����
			String url="jdbc:oracle:thin:@localhost:1521:ORCL";
			String uid="wanglj";
			String passwd="brcb1234";
			
			conn=DriverManager.getConnection(url, uid, passwd);
			System.out.println("jdbc���ӳɹ�");
			
			//�����������ݿ�Ĺ���
			Statement stmt=conn.createStatement();
			//sql
			//String sql="insert into classs values('005','JAVA�м���',to_Date('2013-12-21','yyyy-mm-dd'))";
			ResultSet rs=stmt.executeQuery(sql);
			//System.out.println("Ӱ������="+an);
			int no=0;
			while(true){
				boolean isNextOK=rs.next();
				if(isNextOK==false)
					break;
			}
			no++;
			
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
				System.out.println("���ݿ����ӹر�");
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}	
	}

	public static void main(String[] args) {
		String sql="select * from classs";
		test(sql);
	}

}
