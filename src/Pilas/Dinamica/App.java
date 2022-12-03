package Pilas.Dinamica;

public class App {
    public static void main(String[] args) throws Exception {
        Pila pila = new Pila();

        for (int i = 0; i < 5 ; i++) {
            pila.input(i);
        }

        for (int i = 0; i < 6 ; i++) {
            pila.output();
        }
    }
}
