package com.cristobalbernal.Relevos;

import java.util.Random;

public class Atleta implements Runnable{
    private final String nombre;
    private final Relevo relevo;
    private int tiempoCorriendo;

    public Atleta(String nombre, Relevo relevo) {
        this.nombre = nombre;
        this.relevo = relevo;
    }


    @Override
    public void run() {
        if (!relevo.isEntregado()){
            relevo.testigoEnLaMano();
            System.out.println(nombre + " ha empezado a correr!!!!");
            tiempoCorriendo = Lib.numeroAleatorio(CONFIG.TIEMPO_MIN,CONFIG.TIEMPO_MAX);
            try {
                Thread.sleep(tiempoCorriendo);
            } catch (InterruptedException ie) {
                throw new RuntimeException(ie);
            }
            System.out.println(nombre + " ya ha entregado el relevo!!!");
            relevo.testigoLibre();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Relevo getRelevo() {
        return relevo;
    }

    public int getTiempoCorriendo() {
        return tiempoCorriendo;
    }
}
