package com.company;

public class Main {

    public static void main(String[] args) {
	    Figure triangle = new Rectangle();
        triangle.addPoint(new ConcretePoint(1,1));
        triangle.addPoint(new ConcretePoint(2, 1));
        triangle.addPoint(new ConcretePoint(2,2));
        triangle.addPoint(new ConcretePoint(1,2));

        triangle.print();

    }
}
