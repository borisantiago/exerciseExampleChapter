package com.libreria.libreria.adapter;

public class LegacyBookAdapter implements IBook {
    private LegacyBook legacyLibro;
    public LegacyBookAdapter(LegacyBook legacyLibro) {
        this.legacyLibro = legacyLibro;
    }
    @Override
    public Long getId() {
        return legacyLibro.getLegacyId();
    }
    @Override
    public String getTittle() {
        return legacyLibro.getLegacyTitle();
    }
    @Override
    public String getAuthor() {
        return legacyLibro.getLegacyAuthor();
    }
}
