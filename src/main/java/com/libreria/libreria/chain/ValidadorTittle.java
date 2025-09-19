package com.libreria.libreria.chain;

import com.libreria.libreria.model.Book;

public class ValidadorTittle extends Validador {
    @Override
    public boolean validar(Book libro) {
        if (libro.getTitulo() == null || libro.getTitulo().isBlank()) {
            return false;
        }
        return siguiente == null || siguiente.validar(libro);
    }
}
