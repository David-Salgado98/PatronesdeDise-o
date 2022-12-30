package com.davidsal.patrones.decorator;

public class Texto implements Formateable {
    private String texto;

    ///////////////////Constructor/////////////////////

    public Texto(String texto) {
        this.texto = texto;
    }


    ///////////////////Get and Set/////////////////////


    public String getTexto() {
        return texto;
    }

    ///////////////////MEtodos/////////////////////
    @Override
    public String darFormato() {
        return getTexto();
    }
}
