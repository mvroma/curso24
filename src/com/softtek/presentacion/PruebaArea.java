package com.softtek.presentacion;
import com.softtek.modelo.Area;

public class PruebaArea {
    public static void main(String[] args) {
        double radioCirculo = 5.0;
        double baseRectangulo = 4.0;
        double alturaRectangulo = 6.0;

        double areaCirculo = Area.AreaCirculo(radioCirculo);
        System.out.println("Área del círculo con radio " + radioCirculo + ": " + areaCirculo);

        double areaRectangulo = Area.AreaRectangulo(baseRectangulo, alturaRectangulo);
        System.out.println("Área del rectángulo con base " + baseRectangulo + " y altura " + alturaRectangulo + ": " + areaRectangulo);

    }
}
