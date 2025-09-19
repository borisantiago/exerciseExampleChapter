package com.libreria.libreria.factory;

import com.libreria.libreria.model.*;

public class FiccionFactory extends BookFactory {
    private FormatoLibro formato;
    public FiccionFactory(FormatoLibro formato) {
        this.formato = formato;
    }
    @Override
    public Book crearLibro(Long id, String titulo, String autor) {
        return new Book(id, titulo, autor, TipoLibro.FICCION, formato, EstadoBook.DISPONIBLE);
    }
}
