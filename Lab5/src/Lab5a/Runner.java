package Lab5a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        String book2;
        Catalog.Book book = new Catalog.Book();
        List<Catalog.Book> books = new ArrayList<Catalog.Book>();
        Catalog cat = new Catalog() {
            public String toString(List<Book> book) {
                for (Catalog.Book book1 : book) {
                    System.out.println("1).Name   " + book1.name + "\n2).Catalog id    " + book1.customerId+"\n3).Is it taken?  " + book1.taken+"\n");
                }
                return null;
            }
        };
        Catalog cat2 = new Catalog();
        boolean k = true;
        while (k) {
            System.out.println(
                    "1). Create a library"
                            + "\n2). Take a book" +
                            "\n3). Return a book\n"
            );
            Scanner scanner = new Scanner(System.in);
            int key = scanner.nextInt();
            switch (key) {
                case 1:
                    books = cat.createBook(book, 6);
                    cat.toString(books);
                    cat.setBooksList(books);
                    break;
                case 2:
                    System.out.println("What book do you want to take? ");
                    System.out.println(Arrays.toString(Books.values()));
                    Scanner scanner1 =new Scanner(System.in);
                    book2 = scanner1.nextLine();
                    System.out.println(cat.takeABook(book2, 1 + Math.random() * 10));
                    break;
                case 3:
                    System.out.println(cat.toString(books));
                    System.out.println("What book do you want to return? ");
                    Scanner scanner2 =new Scanner(System.in);
                    book2 = scanner2.nextLine();
                    cat.returnABook(book2,1 + Math.random() * 10);
                    break;
            }
            System.out.println("Do you want to continue? "
                    + "\nTrue" + "\nFalse");
            if (scanner.hasNext()) {
                k = scanner.nextBoolean();
            }
        }
    }
}
