package Listas.Dinamicas;


public class ListaSimpleCircular {
    private NodoSimple start, end, auxiliarIntercambio, auxiliarBusqueda;

    public void input(int dato){
        NodoSimple nodoInput = new NodoSimple(dato);

        if(start == null){
            start = end = nodoInput;
            end.nodoSiguiente = start;
        }
        else if(start.dato > dato){
            auxiliarIntercambio = start;
            start = nodoInput;
            start.nodoSiguiente = auxiliarIntercambio;
        }
        else if(end.dato < dato){
            end.nodoSiguiente = nodoInput;
            end = nodoInput;
            end.nodoSiguiente = start;
        }
        else{
            buscarPosicion(dato);
            auxiliarIntercambio = auxiliarBusqueda.nodoSiguiente;
            nodoInput.nodoSiguiente = auxiliarIntercambio;
            auxiliarBusqueda.nodoSiguiente = nodoInput;
        }
    }

    public void output(int dato){
        if(start == null){
            System.out.println("Underflow");
        }
        else if(start.dato == dato){
            System.out.println(start.dato);
            auxiliarIntercambio = start.nodoSiguiente;
            start = auxiliarIntercambio;
        }
        else{
            buscarPosicion(dato);
            if(auxiliarBusqueda.nodoSiguiente.dato == dato){
                System.out.println(auxiliarBusqueda.nodoSiguiente.dato);

                auxiliarIntercambio = auxiliarBusqueda.nodoSiguiente.nodoSiguiente;
                auxiliarBusqueda.nodoSiguiente = auxiliarIntercambio;

            }
            else{
                System.out.println("El dato no se encuentra en la lista");
            }
        }
    }

    private void buscarPosicion(int dato){
        auxiliarBusqueda = start;

        while (auxiliarBusqueda.nodoSiguiente.dato < dato ) {
            auxiliarBusqueda = auxiliarBusqueda.nodoSiguiente;
        }
    }

    public void mostrar(){
        auxiliarBusqueda = start;

        System.out.println(auxiliarBusqueda.dato);

        while (auxiliarBusqueda.nodoSiguiente.dato != start.dato ) {
            auxiliarBusqueda = auxiliarBusqueda.nodoSiguiente;
            System.out.println(auxiliarBusqueda.dato);
        }
    }


    ListaSimpleCircular(){
        start = end = null;
        auxiliarIntercambio = auxiliarBusqueda = null;
    }
}
