package com.davidsal.patrones.decorator;

public class MayusculaDecorador extends TextoDecorador{

    ///////////////////Constructor/////////////////////

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    ///////////////////Metodos/////////////////////
    @Override
    public String darFormato() {
        return texto.darFormato();
    }


}
