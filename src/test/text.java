package test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class text {
	static void test(String sql){
         System.out.println("测试开始。。。。。。。。。。");
			
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc驱动载入成功？");
			//建立数据库连接
			String url="jdbc:oracle:thin:@localhost:1521:ORCL";
			String uid="wanglj";
			String passwd="brcb1234";
			
			conn=DriverManager.getConnection(url, uid, passwd);
			System.out.println("jdbc连接成功");
			
			//构建操作数据库的工具
			Statement stmt=conn.createStatement();
			//sql
			//String sql="insert into classs values('005','JAVA中级班',to_Date('2013-12-21','yyyy-mm-dd'))";
			ResultSet rs=stmt.executeQuery(sql);
			//System.out.println("影响行数="+an);
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
				System.out.println("数据库连接关闭");
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}	
	}

	public static void main(String[] args) {
		String sql="select * from classs";
		test(sql);
	}

}
