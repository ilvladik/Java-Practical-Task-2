package exercise_4;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Add new computer: ");
            String modelName = scanner.next();
            if (modelName.equals("stop")) {
                break;
            }
            shop.addComputer(modelName);
        }

        while (true) {
            System.out.print("Delete computer: ");
            String modelName = scanner.next();
            if (modelName.equals("stop")) {
                break;
            }
            shop.delComputer(modelName);
        }

        while (true) {
            System.out.print("Does shop contain: ");
            String modelName = scanner.next();
            if (modelName.equals("stop")) {
                break;
            }
            if (shop.find(modelName) != null) {
                System.out.println("There is such computer in the shop");
            } else {
                System.out.println("There is no such computer in the shop");
            }
        }
        System.out.println(shop);
    }
}
