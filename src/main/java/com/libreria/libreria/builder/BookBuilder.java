package com.libreria.libreria.builder;

import com.libreria.libreria.model.*;

public class BookBuilder {
    private Long id;
    private String titulo;
    private String autor;
    private TipoLibro tipo;
    private FormatoLibro formato;
    private EstadoBook estado = EstadoBook.DISPONIBLE;

    public BookBuilder setId(Long id) {
        this.id = id;
        return this;
    }
    public BookBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }
    public BookBuilder setAutor(String autor) {
        this.autor = autor;
        return this;
    }
    public BookBuilder setTipo(TipoLibro tipo) {
        this.tipo = tipo;
        return this;
    }
    public BookBuilder setFormato(FormatoLibro formato) {
        this.formato = formato;
        return this;
    }
    public BookBuilder setEstado(EstadoBook estado) {
        this.estado = estado;
        return this;
    }
    public Book build() {
        return new Book(id, titulo, autor, tipo, formato, estado);
    }
}
