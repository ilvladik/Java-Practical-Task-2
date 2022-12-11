package exercise_1;

import java.util.Scanner;

public class TestAuthor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Имя: ");
        String name = scanner.next();

        System.out.print("Почта: ");
        String email = scanner.next();

        System.out.print("Пол 'м' или 'ж': ");
        char gender = scanner.next().charAt(0);

        Author man = new Author(name, email, gender);

        System.out.println("Имя: " + man.getName());
        System.out.println("Почта: " + man.getEmail());
        System.out.println("Пол: " + man.getGender());
        System.out.println(man);

        System.out.print("Поменять почту: ");
        email = scanner.next();
        man.setEmail(email);

        System.out.println(man);
    }
}
