package com.libreria.libreria.chain;

import com.libreria.libreria.model.Book;

public abstract class Validador {
    protected Validador siguiente;
    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }
    public abstract boolean validar(Book libro);
}
