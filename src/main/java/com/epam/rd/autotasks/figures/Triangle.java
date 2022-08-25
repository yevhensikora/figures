package com.epam.rd.autotasks.figures;

class Triangle extends Figure {

    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return Math.abs((a.getX() * (b.getY() - c.getY())) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY())) / 2.0;
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")(" +
                b.getX() + "," + b.getY() + ")(" +
                c.getX() + "," + c.getY() + ")";
    }

    @Override
    public String toString() {
        return "Triangle[" + pointsToString() + "]";
    }

    @Override
    public Point leftmostPoint() {

        if (a.getX() <= b.getX() && a.getX() <= c.getX()) {
            return a;
        }
        if (c.getX() <= a.getX() && c.getX() <= b.getX()) {
            return c;
        }
        return b;
    }
}

