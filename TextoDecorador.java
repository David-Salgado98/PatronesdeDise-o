package com.davidsal.patrones.decorator;

abstract public class TextoDecorador implements Formateable {
    ///////////////////Al ser abstracto no esta obligado a implementar los metodos de la clase/////////////////////
    protected Formateable texto;
    ///////////////////cosntructor/////////////////////

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
