package com.javaex.ex02;

public class Shape {

	// field
	private String fillColor;
	private String lineColor;

	// constructor
	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}

	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape(2) 실행");
	}

}
