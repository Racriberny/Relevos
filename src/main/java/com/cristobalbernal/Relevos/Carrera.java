package com.cristobalbernal.Relevos;

public class Carrera {
    public void execute() throws InterruptedException {
        Atleta[] atletas = new Atleta[CONFIG.NUMERO_ATLETAS];
        Thread[] hilos = new Thread[CONFIG.NUMERO_ATLETAS];
        Relevo relevo = new Relevo();
        long horaDeComienzo;
        long horaDeFinalizado;
        for (int i = 0; i <CONFIG.NUMERO_ATLETAS ; i++) {
            atletas[i] = new Atleta("Ataleta " + (i+1),relevo);
            hilos[i] = new Thread(atletas[i]);
        }
        horaDeComienzo = System.currentTimeMillis();

        System.out.println("Aqui empieza la carrera!!");
        for (int i = 0; i <CONFIG.NUMERO_ATLETAS ; i++) {
            hilos[i].start();
            hilos[i].join();
        }
        System.out.println("Ya no quedam mas atletas en la carrera!!!!!!");

        System.out.println("Resultado!!!!");

        horaDeFinalizado = System.currentTimeMillis();

        long tiempoTotal = horaDeComienzo - horaDeFinalizado;

        System.out.println("Tiempo total " + tiempoTotal);

        System.out.println("Ahora cada corredor:");
        for (int i = 0; i <CONFIG.NUMERO_ATLETAS ; i++) {
            System.out.println(atletas[i].getNombre() + " ha corrido " + atletas[i].getTiempoCorriendo());
        }

    }
}
