package com.davidsal.patrones.decorator;

public class ReversaDecorador extends TextoDecorador{
    ///////////////////constructor/////////////////////

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    ///////////////////Metodos/////////////////////
    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
