package org.avi.iteratorPattern;

import java.util.List;

public class BookIterator implements Iterator<Book> {

    private int index;
    private List<Book> books;

    public BookIterator(List<Book> books) {
        this.index = 0;
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        return books.get(index ++);
    }
}
