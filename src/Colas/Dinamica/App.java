package Colas.Dinamica;

public class App {
    public static void main(String[] args) {
        Cola cola = new Cola();

        for (int i = 0; i < 5; i++) {
            cola.input(i);
        }

        for (int i = 0; i < 6; i++) {
            cola.output();
        }
    }
}
