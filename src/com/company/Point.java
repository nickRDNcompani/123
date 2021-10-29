package com.company;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){

        this.x = x;
        this.y = y;

    }

    public void moveX(int ammount){
        this.x += ammount;
    }
    public void moveY(int ammount){
        this.y += ammount;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distanceToAnotherPoint(Point point){
        int distanceX = 0;
        int distanceY = 0;

        if(this.x>point.x){
            distanceX += this.x-point.x;
        }else{
            distanceX += point.x-this.x;
        }
        if(this.y>point.y){
            distanceY += this.y-point.y;
        }else{
            distanceY += point.y-this.y;
        }

        return Math.sqrt(distanceX*distanceX + distanceY*distanceY);
    }

    @Override
    public String toString() {
        return "x:" + this.x + " y:" + this.y;
    }
}



