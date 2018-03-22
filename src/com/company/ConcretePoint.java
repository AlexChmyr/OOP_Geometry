package com.company;

public class ConcretePoint implements Point{
    private final int x;
    private final int y;

    public ConcretePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    public boolean equals(Object other){
        if (!(other instanceof Point)){
            return false;
        }

        Point otherPioint = (Point)other;
        if (otherPioint.getX() == this.x && otherPioint.getY() == this.y){
            return true;
        }
        return false;
    }
}
