package Listas.Estatica;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lista lista;
        int length;

        System.out.print("Digite el tamaño de la lista: ");
        length = input.nextInt();

        lista = new Lista(length);

        for (int i = 0; i < 5; i++) {
            lista.input(i);
        }

        for (int i = 10; i > 5; i--) {
            lista.input(i);
        }

        // for (int i = 0; i < 10; i++) {
        //     lista.output(i);
        // }
        lista.output(4);
        lista.output(6);
        lista.output(5);
        // lista.mostrar();

        input.close();
    }
}
