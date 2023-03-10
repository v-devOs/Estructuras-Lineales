package Listas.Dinamicas;

public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();

        // lista.input(5);
        for (int i = 0; i < 5; i++) {
            lista.input(i);
        }

        for (int i = 10; i > 5; i--) {
            lista.input(i);
        }

        for (int i = 0; i < 10; i++) {
            lista.output(i);
        }
        
        // lista.output(4);
        // lista.output(6);
        // lista.output(0);
        // lista.output(5);



        
    }
}

// Pruebas listas Dinamicas
// Lista lista = new Lista();

        // for (int i = 0; i < 5; i++) {
        //     lista.input(i);
        // }

        // for (int i = 10; i > 5; i--) {
        //     lista.input(i);
        // }

        // for (int i = 0; i < 10; i++) {
        //     lista.output(i);
        // }

        // lista.output(4);
        // lista.output(6);
        // lista.output(0);
