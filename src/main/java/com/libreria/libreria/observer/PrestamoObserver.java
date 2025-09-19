package com.libreria.libreria.observer;

import com.libreria.libreria.model.Book;

public class PrestamoObserver implements Observer {
    @Override
    public void notificar(Book libro) {
        System.out.println("Notificación: El libro '" + libro.getTitulo() + "' ha sido prestado.");
    }
}
