package test;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.StudDao;
import Dao.StudentPO;

public class TestStud {


	public static void main(String[] args) {
		StudDao dao=new StudDao();
		/*String sql="insert into student values(?,?,?)";
		StudentPO po=new StudentPO();
		po.setStudNum(7777);
		po.setName("红云");
		po.setClassNo("002");
		int an=dao.insert(po, sql);
		System.out.println("营销行数="+an);*/
		
		//查询
		int studNum=1111;
		String name=dao.getOnePO(studNum);
		try {
			System.out.println(name);
			//System.out.println(rs.getObject(1));
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
