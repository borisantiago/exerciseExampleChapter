package com.libreria.libreria.factory;

import com.libreria.libreria.model.*;

public class NoFiccionFactory extends BookFactory {
    private FormatoLibro formato;
    public NoFiccionFactory(FormatoLibro formato) {
        this.formato = formato;
    }
    @Override
    public Book crearLibro(Long id, String titulo, String autor) {
        return new Book(id, titulo, autor, TipoLibro.NO_FICCION, formato, EstadoBook.DISPONIBLE);
    }
}
