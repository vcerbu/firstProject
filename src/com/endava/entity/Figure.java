package com.endava.entity;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class Figure {

    private double dimension;

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public Figure(double dimension) {
        this.dimension = dimension;
    }

    public Figure() {
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }
}
