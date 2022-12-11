package exercise_3;

public class Circle {
    private Point centre;
    private double radius;

    public Circle(int x, int y, double radius) {
        this.centre = new Point(x, y);
        this.radius = radius;
    }

    public void changeCentre(int x, int y) {
        centre.setX(x);
        centre.setY(y);
    }

    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
