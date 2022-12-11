package exercise_6;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {

        Circle circleFirst = createCircle();
        Circle circleSecond = createCircle();

        System.out.println("Площадь первой окружности: " + circleFirst.getSquare() + " периметр: " + circleFirst.getPerimeter());
        System.out.println("Площадь второй окружности: " + circleSecond.getSquare() + " периметр: " + circleSecond.getPerimeter());
        if (circleFirst.equals(circleSecond)) {
            System.out.println("Радиусы окружностей равны");
        } else {
            System.out.println("Радиусы окружностей не равны");
        }

    }

    public static Circle createCircle() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Радиус окружности: ");
        double radius = scanner.nextDouble();
        System.out.println("Координаты центра: ");
        System.out.print("x = ");
        double x = scanner.nextDouble();
        System.out.print("y = ");
        double y = scanner.nextDouble();
        Circle circleFirst = new Circle(radius, x, y);
        return circleFirst;
    }
}
