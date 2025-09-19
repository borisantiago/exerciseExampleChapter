package com.libreria.libreria.factory;

import com.libreria.libreria.model.*;

public class BookFisicoFactory extends AbstractLibroFactory {
    @Override
    public BookFactory getLibroFactory(TipoLibro tipo) {
        if (tipo == TipoLibro.FICCION) {
            return new FiccionFactory(FormatoLibro.FISICO);
        } else {
            return new NoFiccionFactory(FormatoLibro.FISICO);
        }
    }
}
