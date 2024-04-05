package com.softtek.modelo;

public class Alumno {
    private String nombreCompleto;
    private int[] parciales;

    public Alumno(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new int[3];
    }

    public void setParciales(int[] parciales){
        if(parciales.length == this.parciales.length){
            this.parciales = parciales;
        }else {
            System.out.println("Inválido numero de parciales");
        }
    }
    public double calculaMedia(){
        int sum = 0;
        for (int parcial : parciales){
            sum+= parcial;
        }
        return (double) sum / parciales.length;
    }
    public void mostrarNotas() {
        System.out.println(nombreCompleto + ". Su nota es: ");
        for (int parcial : parciales) {
            System.out.println(parcial + " ");
        }
        System.out.println();
    }

}



