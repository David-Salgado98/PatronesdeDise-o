package com.davidsal.patrones.decorator;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andres");
        MayusculaDecorador may = new MayusculaDecorador(texto);
        ReversaDecorador rev = new ReversaDecorador(may);
        SubrayadorDecorador sub = new SubrayadorDecorador(rev);
        ///////////////////podemos hacer esto por que es recursivo el metodo/////////////////////
        System.out.println(sub.darFormato());

    }
}
