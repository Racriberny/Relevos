package com.cristobalbernal.Relevos;

import java.util.Random;

public class Lib {
    public static int numeroAleatorio(int MIN, int MAX){
        Random r = new Random();
        return r.nextInt(MAX - MIN + 1) + MIN;
    }
}
