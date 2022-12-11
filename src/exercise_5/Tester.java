package exercise_5;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        DogKennel dogs = new DogKennel();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Add new dog: ");
            System.out.print("Name: ");
            String name = scanner.next();
            if (name.equals("stop")) {
                break;
            }
            System.out.print("Age: ");
            int age = scanner.nextInt();
            dogs.addDog(name, age);
        }

        while (true) {
            System.out.println("Delete dog: ");
            System.out.print("Name: ");
            String name = scanner.next();
            if (name.equals("stop")) {
                break;
            }
            System.out.print("Age: ");
            int age = scanner.nextInt();
            dogs.delDog(name, age);
        }

        System.out.println("Find: ");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Age: ");
        int age = scanner.nextInt();

        Dog dog = dogs.find(name, age);
        if (dog != null) {
            System.out.println(dog);
            System.out.println("The age of the dog in human: " + dog.dogAgeToHumanAge());
        }
    }
}
