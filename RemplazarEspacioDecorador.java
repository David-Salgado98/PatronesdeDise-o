package com.davidsal.patrones.decorator;

public class RemplazarEspacioDecorador extends TextoDecorador{

    ///////////////////Construdctor/////////////////////

    public RemplazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    ///////////////////Metodos/////////////////////

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}
