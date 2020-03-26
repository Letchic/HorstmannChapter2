package com.letchic.geometry;

public final class Point {
    private final double x;
    private final double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate (double x, double y){
        return new Point(x,y) ;
    }

    public Point scale (double s){
        return new Point(x*s,y*s) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;
        return Math.abs(point.x-x) <= 0.00001 &&
                Math.abs(point.y-y) <= 0.00001;
    }

    @Override
    public int hashCode() {
        int result=17;
        long temp;
        temp = Double.doubleToLongBits(x);
        result =  37 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
