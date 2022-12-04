package Listas.Dinamicas;

public class NodoDoble {
    int dato;
    NodoDoble nodoSiguiente, nodoAnterior;

    NodoDoble(int dato){
        this.dato = dato;
        nodoSiguiente = nodoAnterior = null;
    }
}
