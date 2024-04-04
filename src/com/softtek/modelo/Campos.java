package com.softtek.modelo;

public class Campos {


    private int x = 0;

    public Campos() {
    }

    public Campos(int x) {
        this.x = x;
    }

    public void incrementar () {
        x++;
    }

    public void mostrar() {
        System.out.println("El resultado es: " + x);
    }
}

