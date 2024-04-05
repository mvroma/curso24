package com.softtek.presentacion;
import com.softtek.modelo.Alumno;

public class AlumnoPresentacion {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Pepe Sanz");
        int [] parciales = {8, 9, 8};
        alumno1.setParciales(parciales);
        alumno1.mostrarNotas();
        System.out.println(alumno1.calculaMedia());
    }
}
