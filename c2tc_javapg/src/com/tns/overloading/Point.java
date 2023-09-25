package com.tns.overloading;
// program to illustrate function overloading
public   class Point {
	private float x;
	
	private float y;
	// constructor overloading
	public Point() {
//		x=0.0f;
//		y=0.0f;
		
	}
	public Point(float x)
	{
		this.x=x;
		//this.y=x;
	}
	public Point(float x, float y)
	{
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
