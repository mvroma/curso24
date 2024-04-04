package com.softtek.modelo;

public class Alumno {
    public String NombreCompleto;
    private int[] Parciales;

    public Alumno(String NombreCompleto, int numParciales) {
        this.NombreCompleto = NombreCompleto;
        this.Parciales = new int[numParciales];
    }

    private double calcularPromedio() {
        int sum = 0;
        for (int i = 0; i < this.Parciales.length; i++) {
            sum += this.Parciales[i];
        }
        return (double) sum / this.Parciales.length;
    }

    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de " + NombreCompleto + ":");
        for (int i = 0; i < Parciales.length; i++) {
            System.out.println("Parcial " + (i + 1) + ": " + Parciales[i]);
        }
    }
    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public int[] getParciales() {
        return Parciales;
    }
    public void setParciales(int[] parciales) {
        if (parciales.length == this.Parciales.length) {
            for (int i = 0; i < parciales.length; i++) {
                this.Parciales[i] = parciales[i];
            }
        } else {
            System.out.println("Inválido número de parciales");
        }
    }
}



