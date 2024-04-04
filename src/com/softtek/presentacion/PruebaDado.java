package com.softtek.presentacion;
import com.softtek.modelo.Dado;
import java.util.Objects;
import java.util.Scanner;

public class PruebaDado {

    public static void main(String[] args) {
        Dado dados = new Dado();
        Scanner sc = new Scanner(System.in);
        String siguiente = "s";
        do {
            System.out.println(dados.lanzar());

            System.out.println("¿Quieres volver a lanzar? Por favor, responde s/n");
            siguiente = sc.nextLine();
        }while (!Objects.equals(siguiente, "n"));
    }
}


