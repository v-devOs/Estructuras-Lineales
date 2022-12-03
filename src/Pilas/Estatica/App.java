package Pilas.Estatica;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PilaEstatica pila;

        System.out.print("Digite el tamaño de la pila: ");
        int lenght = input.nextInt();
        pila = new PilaEstatica(lenght);


        for (int i = 0; i < 5; i++) {
            pila.input(i);
        }
        for (int i = 0; i < 6; i++) {
            pila.output();
        }

        input.close();
    }
}

