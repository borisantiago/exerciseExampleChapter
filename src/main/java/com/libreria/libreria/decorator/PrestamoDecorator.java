package com.libreria.libreria.decorator;

import com.libreria.libreria.model.*;

public class PrestamoDecorator implements BookComponent {
    private BookComponent libroComponent;
    public PrestamoDecorator(BookComponent libroComponent) {
        this.libroComponent = libroComponent;
    }
    @Override
    public Book getLibro() {
        Book libro = libroComponent.getLibro();
        libro.setEstado(EstadoBook.PRESTADO);
        return libro;
    }
}
