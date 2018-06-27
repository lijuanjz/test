package Dao;

public class StudentPO {
	
	private Integer StudNum;
	private String name;
	private String classNo;
	public StudentPO(){
		
	}
	public StudentPO(Integer studNum, String name, String classNo) {
		super();
		StudNum = studNum;
		this.name = name;
		this.classNo = classNo;
	}
	public Integer getStudNum() {
		return StudNum;
	}
	public void setStudNum(Integer studNum) {
		StudNum = studNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	
}
