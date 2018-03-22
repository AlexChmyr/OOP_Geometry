package com.company;

public class Main {

    public static void main(String[] args) {
	    Figure rectangle = new Rectangle();
        rectangle.addPoint(new ConcretePoint(1,1));
        rectangle.addPoint(new ConcretePoint(2, 1));
        rectangle.addPoint(new ConcretePoint(2,2));
        rectangle.addPoint(new ConcretePoint(1,2));

        rectangle.print();

        Figure triangle = new Triangle();
        triangle.addPoint(new ConcretePoint(1,1));
        triangle.addPoint(new ConcretePoint(5, 2));
        triangle.addPoint(new ConcretePoint(3,3));

        triangle.print();
    }
}
