package org.avi.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>() {{
           add(new Book("Book1", 10));
           add(new Book("Book2", 11));
        }};
        Aggregate library = new Library(books);
        Iterator<Book> iterator = library.createIterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
    }
}
