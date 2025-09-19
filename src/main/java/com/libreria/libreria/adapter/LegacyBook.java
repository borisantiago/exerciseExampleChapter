package com.libreria.libreria.adapter;

public class LegacyBook {
    private long legacyId;
    private String legacyTitle;
    private String legacyAuthor;

    public LegacyBook(long legacyId, String legacyTitle, String legacyAuthor) {
        this.legacyId = legacyId;
        this.legacyTitle = legacyTitle;
        this.legacyAuthor = legacyAuthor;
    }
    public long getLegacyId() { return legacyId; }
    public String getLegacyTitle() { return legacyTitle; }
    public String getLegacyAuthor() { return legacyAuthor; }
}
