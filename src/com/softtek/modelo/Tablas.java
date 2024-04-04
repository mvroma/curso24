package com.softtek.modelo;

public class Tablas {
    private int tabla;

    public String multiplicacion() {
        String text = "";
        for (int i = 0; i <= 10; i++) {
            text+= tabla+" x "+ i + " = " + tabla*i + "\n";
        }
        return text;
    }

    public Tablas(int tabla) {
        this.tabla = tabla;
    }
}

