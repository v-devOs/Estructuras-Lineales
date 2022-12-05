package Listas.Dinamicas;

public class ListaDobleCircular {
    private NodoDoble start, end, auxiliarIntercambio, auxiliarBusqueda;

    public void input(int dato){
        NodoDoble nodoInput = new NodoDoble(dato);

        if(start == null && end == null){

            start = end = nodoInput;
            start.nodoAnterior = end;
            end.nodoSiguiente = start;
        }
        else if(start.dato > dato){
            auxiliarIntercambio = start;
            start = nodoInput;
            start.nodoSiguiente = auxiliarIntercambio;
            start.nodoAnterior = end;
        }
        else if(end.dato < dato){
            auxiliarIntercambio = end;
            end = nodoInput;
            end.nodoAnterior = auxiliarIntercambio;
            auxiliarIntercambio.nodoSiguiente = end;
            end.nodoSiguiente = start;
        }
        else{
            buscarPosicion(dato);
            auxiliarIntercambio = auxiliarBusqueda.nodoSiguiente;
            auxiliarIntercambio.nodoAnterior = nodoInput;
            nodoInput.nodoAnterior = auxiliarBusqueda;
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
            auxiliarIntercambio.nodoAnterior = end;
            start = auxiliarIntercambio;
        }
        else if(end.dato == dato){
            System.out.println(end.dato);
            auxiliarIntercambio = end.nodoAnterior;
            auxiliarIntercambio.nodoSiguiente = start;
            end = auxiliarIntercambio;
        }
        else{
            buscarPosicion(dato);
            if(auxiliarBusqueda.nodoSiguiente.dato == dato){
                System.out.println(auxiliarBusqueda.nodoSiguiente.dato);

                auxiliarIntercambio = auxiliarBusqueda.nodoSiguiente.nodoSiguiente;
                auxiliarIntercambio.nodoAnterior = auxiliarBusqueda;
                auxiliarBusqueda.nodoSiguiente = auxiliarIntercambio;
            }
            else{
                System.out.println("El elemento no se encuentra en la lista");
            }
        }
    }

    private void buscarPosicion(int dato){

        auxiliarBusqueda = start;

        while (auxiliarBusqueda.nodoSiguiente.dato < dato) {
            auxiliarBusqueda = auxiliarBusqueda.nodoSiguiente;
        }
    }

    public void mostrar(){
        
        auxiliarBusqueda = start;

        System.out.println(auxiliarBusqueda.dato);
        while (auxiliarBusqueda.nodoSiguiente.dato != start.dato) {
            auxiliarBusqueda = auxiliarBusqueda.nodoSiguiente;
            System.out.println(auxiliarBusqueda.dato);
        }
            
    }

    ListaDobleCircular(){
        start = end = null;
        auxiliarBusqueda = auxiliarIntercambio = null;
    }

}
