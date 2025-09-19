package com.libreria.libreria.factory;

import com.libreria.libreria.model.*;

public abstract class BookFactory {
    public abstract Book crearLibro(Long id, String titulo, String autor);
}
