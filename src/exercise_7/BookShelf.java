package exercise_7;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    @Override
    public String toString() {
        return books.toString();
    }
    public void addBook(String name, String author, int date) {
        Book book = new Book(name, author, date);
        books.add(book);
    }

    public void delBook(String name, String author, int date) {
        books.removeIf(book -> (book.getName().equals(name) &&
                            book.getAuthor().equals(author) &&
                            book.getDate() == date));
    }

    public void sort() {
        for (int i = 0; i < books.size() - 1; i++) {
            for (int j = i + 1; j < books.size(); j++) {
                if (books.get(i).getDate() > books.get(j).getDate()) {
                    Book book = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, book);
                }
            }
        }
    }

    public Book max() {
        Book oldestBook = null;
        if (!books.isEmpty()) {
            int max = books.get(0).getDate();
            oldestBook = books.get(0);
            for (Book book : books) {
                if (max < book.getDate()) {
                    max = book.getDate();
                    oldestBook = book;
                }
            }
        }
        return oldestBook;
    }

    public Book min() {
        Book newestBook = null;
        if (!books.isEmpty()) {
            int min = books.get(0).getDate();
            newestBook = books.get(0);
            for (Book book : books) {
                if (min > book.getDate()) {
                    min = book.getDate();
                    newestBook = book;
                }
            }
        }
        return newestBook;
    }


}
