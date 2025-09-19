package com.libreria.libreria.decorator;

import com.libreria.libreria.model.Book;

public class BookBase implements BookComponent {
    private Book libro;
    public BookBase(Book libro) {
        this.libro = libro;
    }
    @Override
    public Book getLibro() {
        return libro;
    }
}
