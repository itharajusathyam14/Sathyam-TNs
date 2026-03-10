package com.tnsf.programs.Abstraction;

public class Rectangle extends Shape {

    int height;
    int width;

    public Rectangle(int height, int width) {
        super();
        this.height = height;
        this.width = width;
    }

    @Override
    void calArea() {
        area = height * width;
    }

	

}
