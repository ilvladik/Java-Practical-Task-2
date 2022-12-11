package exercise_7;

import ru.mirea.dog.Dog;
import ru.mirea.dog.DogKennel;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Add new book: ");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.equals("stop")) {
                break;
            }
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Date: ");
            int date = Integer.parseInt(scanner.nextLine());
            bookShelf.addBook(title, author, date);
        }

        while (true) {
            System.out.println("Delete book: ");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.equals("stop")) {
                break;
            }
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Date: ");
            int date = scanner.nextInt();
            bookShelf.delBook(title, author, date);
        }

        System.out.println("Сортировка: ");
        bookShelf.sort();
        System.out.println(bookShelf);
        System.out.println("Написана раньше всех: " + bookShelf.min());
        System.out.println("Написана позже всех: " + bookShelf.max());

    }
}
