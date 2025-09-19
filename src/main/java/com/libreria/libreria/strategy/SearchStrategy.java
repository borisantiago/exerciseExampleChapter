package com.libreria.libreria.strategy;

import com.libreria.libreria.model.Book;
import java.util.List;

public interface SearchStrategy {
    List<Book> buscar(List<Book> libros, String query);
}
