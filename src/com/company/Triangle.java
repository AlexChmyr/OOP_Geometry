package com.company;

public class Triangle extends PlaneFigure{


    public Triangle() {
        super(3);
    }

    @Override
    protected boolean checkState() {
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        Point p3 = points.get(2);

        // Check if points lie on the same line
        boolean onSameLine = (p1.getX()-p3.getX())/(p1.getX()-p2.getX()) == (p1.getY()-p3.getY())/(p1.getY()-p2.getY());
        if (onSameLine){
            return false;
        }

        return true;
    }

    @Override
    protected void constructionDone() {
        System.out.println("Triangle is built.");
    }

    @Override
    protected void constructionFailed() {
        System.out.println("This figure is not a triangle.");
    }

    public void print(){
        System.out.println("Triangle:");
        super.print();
    }
}
