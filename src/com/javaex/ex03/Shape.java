package com.javaex.ex03;

public class Shape {
	
	//field
	protected String fillColor;
	protected String lineColor;
	
	//constructor
	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	//method - g/s
	
	//method - general
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public void showInfo() {
		
	}
}

