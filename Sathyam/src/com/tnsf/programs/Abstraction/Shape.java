package com.tnsf.programs.Abstraction;
public abstract class Shape {

	int area;

	abstract void calArea();   // abstract method

	public int show() {
		return area;
	}
}
