package com.libreria.libreria.model;

public class Book {
    private Long id;
    private String titulo;
    private String autor;
    private TipoLibro tipo;
    private FormatoLibro formato;
    private EstadoBook estado;

    public Book(Long id, String titulo, String autor, TipoLibro tipo, FormatoLibro formato, EstadoBook estado) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
        this.formato = formato;
        this.estado = estado;
    }

    // Getters y setters
    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public TipoLibro getTipo() { return tipo; }
    public FormatoLibro getFormato() { return formato; }
    public EstadoBook getEstado() { return estado; }
    public void setEstado(EstadoBook estado) { this.estado = estado; }
}
