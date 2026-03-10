package com.tnsf.programs.Abstraction;


public class Square extends Shape {

    int s;

    public Square(int s) {
        super();
        this.s = s;
    }

    @Override
    void calArea() {
        area = s * s;
    }
}
