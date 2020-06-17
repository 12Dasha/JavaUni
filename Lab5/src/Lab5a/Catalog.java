package Lab5a;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Catalog {
    List<Book> books = new ArrayList<Book>();
    public static class Book{
        Books name;
        double customerId;
        StringBuilder notes;
        boolean taken = false;
        public Book(){

        }
        public Book(Books name, double customerId){
            this.name = name;
            this.customerId = customerId;
            notes = new StringBuilder();
            taken =false;
        }

    }
    public class Book1{
        Books name;
        double customerId;
        StringBuilder notes;
        boolean taken = false;
        public Book1(){

        }
    }
    public void setBooksList(List<Book> books1){
        this.books = books1;
    }
    public String takeABook (String name, double id){
        for(Book current: books){
            if(current.taken) continue;
            else{
                if(current.name == Books.valueOf(name)){
                current.taken = true;
                current.notes.append(id);
                current.notes.append("taken");
                current.notes.append(new Date());
                current.notes.append(name);
                return Double.toString(current.customerId);
                }
                else continue;
            }
        }
        return "This book is taken((";
    }
    public void returnABook (String name, double id){
        for(Book current: books){
            if(current.name == Books.valueOf(name)){
                if(current.taken){
                current.taken = false;
                current.notes.append(id);
                current.notes.append("returned");
                current.notes.append(new Date());
                current.notes.append(name);
                    System.out.println("\nYou've returned a book");
                return;
                }
                break;
            }
        }
        System.out.println("You don't need to return this book");
    }
    public List<Book> createBook(Book book, int number){
        List<Book> books1 = new ArrayList<Book>();
        for (int i = 0; i<number; i++){
            books1.add(Creation.createBook());
        }
        setBooksList(books1);
        return books1;
    }
    public String toString(List<Book> books){
        StringBuilder catalog = new StringBuilder();
        for(Book book : books){
            catalog.append(book.notes);
        }
        return catalog.toString();
    }
}
