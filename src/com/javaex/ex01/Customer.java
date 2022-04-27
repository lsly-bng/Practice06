package com.javaex.ex01;

public class Customer extends Person{
	
	//field
	private int cNo;
	private int point;
	
	//constructor
	public Customer() {
		super();
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name,hp);
		this.cNo = cNo;
		this.point = point;
	}

	//method - g/s
	public int getcNo() {
		return cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	//method - general
	public void showInfo() {
		System.out.println("#이름:"+name+", #핸드폰:"+hp+", #고객번호:"+cNo+", #포인트점수:"+point);
	}
	
	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", point=" + point + ", name=" + name + ", hp=" + hp + "]";
	}
	
	
	
}
