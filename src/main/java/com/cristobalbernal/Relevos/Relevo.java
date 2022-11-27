package com.cristobalbernal.Relevos;

public class Relevo {
    private boolean relevoEntregado;

    public Relevo(){
        this.relevoEntregado = false;
    }

    public boolean isEntregado(){
        return relevoEntregado;
    }
    public synchronized void testigoEnLaMano(){
        this.relevoEntregado = true;
    }
    public synchronized void testigoLibre(){
        this.relevoEntregado = false;
    }
}
