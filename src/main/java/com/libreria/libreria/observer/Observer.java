package com.libreria.libreria.observer;

import com.libreria.libreria.model.Book;

public interface Observer {
    void notificar(Book libro);
}
