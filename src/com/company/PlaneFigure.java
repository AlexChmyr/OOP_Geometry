package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class PlaneFigure implements Figure{
    protected List<Point> points;
    protected final int pointsCount;
    protected boolean completed = false;

    public PlaneFigure(int pointsCount){
        this.points = new ArrayList<Point>();
        this.pointsCount = pointsCount;
    }

    public final void addPoint(Point newPoint){
        if(pointsCount <= points.size()){
            System.out.println("The figure is already created");
            return;
        }

        if(pointAlreadyAdded(newPoint)){
            System.out.println("This point is already added.");
            return;
        }

        points.add(newPoint);

        if(points.size() == pointsCount){
            if(checkState()){
                completed = true;
                constructionDone();
            }
            else{
                constructionFailed();
            }
        }
    }

    private boolean pointAlreadyAdded(Point newPoint){
        for (Point p : points){
            if (p.equals(newPoint)){
                return true;
            }
        }
        return false;
    }

    public void print(){
        if (completed){
            for (Point p: points) {
                System.out.printf("Point %d: x = %d, y = %d \n",
                        points.indexOf(p)+1,
                        p.getX(),
                        p.getY());
            }
        }
        else {
            System.out.println("The figure is not completed yet");
        }
    }

    protected abstract boolean checkState();
    protected abstract void constructionDone();
    protected abstract void constructionFailed();
}
