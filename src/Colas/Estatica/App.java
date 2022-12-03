package Colas.Estatica;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ColaEstatica cola;
        int lenght;

        System.out.print("Digite el tamaño de la cola: ");
        lenght = input.nextInt();
        cola = new ColaEstatica(lenght);

        for (int i = 0; i < 7; i++) {
            cola.input(i);
        }

        for (int i = 0; i < 7; i++) {
            cola.output();
        }

        input.close();
    }
}
