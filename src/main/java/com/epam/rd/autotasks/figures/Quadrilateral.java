package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        double abc;
        double adc;
        abc = Math.abs((a.getX() * (b.getY() - c.getY())) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY())) / 2.0;
        adc = Math.abs((a.getX() * (d.getY() - c.getY())) + d.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - d.getY())) / 2.0;
        return abc + adc;
    }

    @Override
    public Point leftmostPoint() {
        if (a.getX() <= b.getX() && a.getX() <= c.getX() && a.getX() <= d.getX()) {
            return a;
        }
        if (b.getX() <= a.getX() && b.getX() <= c.getX() && b.getX() <= d.getX()) {
            return b;
        }
        if (c.getX() <= a.getX() && c.getX() <= c.getX() && c.getX() <= d.getX()) {
            return c;
        }
        return d;
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")(" +
                b.getX() + "," + b.getY() + ")(" +
                c.getX() + "," + c.getY() + ")(" +
                d.getX() + "," + d.getY() + ")";
    }

    @Override
    public String toString() {
        return "Quadrilateral[" + pointsToString() + "]";
    }
}
