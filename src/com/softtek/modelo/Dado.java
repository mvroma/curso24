package com.softtek.modelo;

import java.util.Random;

public class Dado {
    private int numeroDado;
    private Random numeroGenerado = new Random();

    public Dado() {
    }

    public String numero1() {
        return "*";
    }

    public String numero2() {
        return "*\n*";
    }

    public String numero3() {
        return "*\n*\n*";
    }

    public String numero4() {
        return "* *\n* *";
    }

    public String numero5() {
        return "* *\n*\n* *";
    }

    public String numero6() {
        return "* * *\n * * *";
    }

    public String lanzar() {
        int randomNumber = numeroGenerado.nextInt(6) + 1;
        String diceNumber;

        switch (randomNumber) {

            case 1:
                diceNumber = numero1();
                break;
            case 2:
                diceNumber = numero2();
                break;
            case 3:
                diceNumber = numero3();
                break;
            case 4:
                diceNumber = numero4();
                break;
            case 5:
                diceNumber = numero5();
                break;
            case 6:
                diceNumber = numero6();
                break;
            default:
                diceNumber = "Introduce un número válido";
        }
        return diceNumber;
    }
}