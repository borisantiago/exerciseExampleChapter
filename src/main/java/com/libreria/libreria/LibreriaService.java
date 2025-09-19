package com.libreria.libreria;

import com.libreria.libreria.model.*;
import com.libreria.libreria.strategy.*;
import com.libreria.libreria.observer.Observer;
import com.libreria.libreria.decorator.*;
import com.libreria.libreria.chain.*;
import java.util.*;

public class LibreriaService {
    private List<Book> libros = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private SearchStrategy searchStrategy;
    private Validador validador;

    public LibreriaService() {
        // Cadena de validadores
        ValidadorTittle valTitulo = new ValidadorTittle();
        ValidadorAuthor valAutor = new ValidadorAuthor();
        valTitulo.setSiguiente(valAutor);
        this.validador = valTitulo;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public boolean agregarLibro(Book libro) {
        if (validador.validar(libro)) {
            libros.add(libro);
            return true;
        }
        return false;
    }
    public void setSearchStrategy(SearchStrategy strategy) {
        this.searchStrategy = strategy;
    }

    public List<Book> buscarLibros(String query) {
        if (searchStrategy == null) return Collections.emptyList();
        return searchStrategy.buscar(libros, query);
    }

    public List<Book> listarLibros() {
        return new ArrayList<>(libros);
    }

    public boolean prestarLibro(Long id) {
        for (Book libro : libros) {
            if (libro.getId().equals(id) && libro.getEstado() == EstadoBook.DISPONIBLE) {
                BookComponent decorador = new PrestamoDecorator(new BookBase(libro));
                decorador.getLibro();
                notificar(libro);
                return true;
            }
        }
        return false;
    }

    private void notificar(Book libro) {
        for (Observer obs : observers) {
            obs.notificar(libro);
        }
    }
}
