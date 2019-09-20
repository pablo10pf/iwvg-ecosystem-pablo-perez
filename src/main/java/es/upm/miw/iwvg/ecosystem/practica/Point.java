package es.upm.miw.iwvg.ecosystem.practica;

public class Point {

    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public double module() {
        return Math.sqrt((double) this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }

    public double distanceToPoint(Point point1) {
        double leg1 = this.x - point1.getX();
        double leg2 = this.y - point1.getY();
        double hypotenuse = Math.sqrt(leg1 * leg1 + leg2 * leg2);
        return hypotenuse;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}