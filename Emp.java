package cn.gaoyan.test;

public class Emp implements java.io.Serializable
{
	private Integer EmpNo;
	private String ename;
	private String username;

	public Emp(Integer EmpNo,String ename){
		this.EmpNo = EmpNo;
		this.ename = ename;
	}
}