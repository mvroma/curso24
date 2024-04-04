package com.softtek.modelo;

public class Area {
    public static double AreaCirculo(double radio) {
        return Math.PI * radio *radio;
    }

    public static double AreaRectangulo(double base, double altura) {
        return base * altura;
    }
}
