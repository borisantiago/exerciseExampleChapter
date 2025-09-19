package com.libreria.libreria.chain;

import com.libreria.libreria.model.Book;

public class ValidadorAuthor extends Validador {
    @Override
    public boolean validar(Book libro) {
        if (libro.getAutor() == null || libro.getAutor().isBlank()) {
            return false;
        }
        return siguiente == null || siguiente.validar(libro);
    }
}
