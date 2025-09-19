package com.libreria.libreria.strategy;

import com.libreria.libreria.model.Book;
import java.util.List;
import java.util.stream.Collectors;

public class SearchByAuthor implements SearchStrategy {
    @Override
    public List<Book> buscar(List<Book> libros, String query) {
        return libros.stream()
            .filter(libro -> libro.getAutor().toLowerCase().contains(query.toLowerCase()))
            .collect(Collectors.toList());
    }
}
