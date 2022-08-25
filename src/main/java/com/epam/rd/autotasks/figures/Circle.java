package com.epam.rd.autotasks.figures;
class Circle extends Figure {

    private final Point x;
    private final double radius;

    public Circle(Point x, double radius) {
        this.x = x;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String pointsToString() {
        return "(" + x.getX() + "," + x.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {
        return new Point (x.getX() - radius, x.getY());
    }

    @Override
    public String toString() {
        return "Circle[" + pointsToString() + radius + "]";
    }
}
