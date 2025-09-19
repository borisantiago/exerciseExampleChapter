package com.libreria.libreria.factory;

import com.libreria.libreria.model.*;

public abstract class AbstractLibroFactory {
    public abstract BookFactory getLibroFactory(TipoLibro tipo);
}
