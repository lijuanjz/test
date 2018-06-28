package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class StudDao {
	public int insert(StudentPO po,String sql){
		int an=0;
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc驱动载入成功？");
			//建立数据库连接
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String uid = "wanglj";
			String passwd = "brcb1234";

			conn = DriverManager.getConnection(url, uid, passwd);
			System.out.println("jdbc连接成功");
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			pstmt.setObject(1, po.getStudNum());
			pstmt.setObject(2, po.getName());
			pstmt.setObject(3, po.getClassNo());
			an=pstmt.executeUpdate();
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				System.out.println("数据库连接关闭");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

		return an;
	}
	public int update(StudentPO po){
		return 0;
	}
	public int delete(StudentPO po){
		return 0;
	}
	public int delete(String userId){
		return 0;
	}
	public String getOnePO(int studNum){
		StudentPO po=null;
		String name=null;
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc驱动载入成功？");
			//建立数据库连接
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String uid = "wanglj";
			String passwd = "brcb1234";

			conn = DriverManager.getConnection(url, uid, passwd);
			System.out.println("jdbc连接成功");
			String sql="select * from student where studnum=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setObject(1, studNum);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()==false)
				return null;
			name=rs.getString("name");
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				System.out.println("数据库连接关闭");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return name;
	}
	public List search(){
		return null;
	}
	public List search(Object[]args){
		return null;
	}

}
