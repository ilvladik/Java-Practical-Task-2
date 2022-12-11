package exercise_2;

import java.util.Scanner;

public class TestBall {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Координаты мяча: ");
        System.out.print("x = ");
        double x = scanner.nextDouble();
        System.out.print("y = ");
        double y = scanner.nextDouble();

        Ball ball = new Ball(x, y);

        System.out.println("Мяч перемещается");
        System.out.print("x + ");
        x = scanner.nextDouble();
        System.out.print("y + ");
        y = scanner.nextDouble();
        ball.move(x, y);

        System.out.println("Координаты мяча: x = " + ball.getX() + " y = " + ball.getY());
        System.out.println(ball);
    }
}
