package com.libreria.libreria.factory;

import com.libreria.libreria.model.*;

public class BookDigitalFactory extends AbstractLibroFactory {
    @Override
    public BookFactory getLibroFactory(TipoLibro tipo) {
        if (tipo == TipoLibro.FICCION) {
            return new FiccionFactory(FormatoLibro.DIGITAL);
        } else {
            return new NoFiccionFactory(FormatoLibro.DIGITAL);
        }
    }
}
