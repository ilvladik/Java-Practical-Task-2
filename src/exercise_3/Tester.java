package exercise_3;
import java.util.ArrayList;

public class Tester {
    private ArrayList<Circle> array;

    public Tester() {
        array = new ArrayList<Circle>();
    }

    public void addCircle(int x, int y, int radius) {
        Circle circle = new Circle(x, y, radius);
        array.add(circle);
    }
}
