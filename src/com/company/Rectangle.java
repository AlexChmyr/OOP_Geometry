package com.company;

public class Rectangle extends PlaneFigure {

    public Rectangle() {
        super(4);
    }

    @Override
    protected boolean checkState() {
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        Point p3 = points.get(2);
        Point p4 = points.get(3);

        double diagonal1 = Math.sqrt(Math.pow(p1.getX()-p3.getX(),2)+Math.pow(p1.getY()-p3.getY(),2));
        double diagonal2 = Math.sqrt(Math.pow(p2.getX()-p4.getX(),2)+Math.pow(p2.getY()-p4.getY(),2));

        if(diagonal1 != diagonal2){
            return false;
        }

        return true;
    }

    @Override
    protected void constructionDone() {
        System.out.println("Rectangle is built.");
    }

    @Override
    protected void constructionFailed() {
        System.out.println("This figure is not a rectangle.");
    }

    public void print(){
        System.out.println("Rectangle:");
        super.print();
    }
}
