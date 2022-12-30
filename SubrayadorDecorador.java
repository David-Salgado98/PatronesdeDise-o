package com.davidsal.patrones.decorator;

public class SubrayadorDecorador extends TextoDecorador{
    ///////////////////Constructor/////////////////////

    public SubrayadorDecorador(Formateable texto) {
        super(texto);
    }

    ///////////////////metodos/////////////////////
    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder sb = new StringBuilder(texto.darFormato());
        sb.append("\n");
        for (int i = 0; i < largo; i++) {
            sb.append("_");
        }
        return sb.toString();
    }
}
