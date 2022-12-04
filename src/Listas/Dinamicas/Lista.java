package Listas.Dinamicas;

public class Lista {
    private NodoSimple start, end, nodoAuxiliarBusqueda, nodoAuxiliarIntercambio;

    public void input(int dato){
        NodoSimple nodoInput = new NodoSimple(dato);

        if(start == null && end == null){
            start = end = nodoInput;
        }
        else if(start.dato > nodoInput.dato){
            nodoAuxiliarBusqueda = start;
            start = nodoInput;
            start.nodoSiguiente = nodoAuxiliarBusqueda;
        }
        else if(end.dato < nodoInput.dato){
            end.nodoSiguiente = nodoInput;
            end = end.nodoSiguiente;
        }
        else{
            buscarPosicion(dato);
            nodoAuxiliarIntercambio = nodoAuxiliarBusqueda.nodoSiguiente;
            nodoAuxiliarBusqueda.nodoSiguiente = nodoInput;
            nodoAuxiliarBusqueda.nodoSiguiente.nodoSiguiente = nodoAuxiliarIntercambio;
        }
    }

    public void output(int dato){
        if(start == null && end == null){
            System.out.println("Underflow");
        }
        else if(start.dato == dato){
            System.out.println(start.dato);
            nodoAuxiliarBusqueda = start.nodoSiguiente;
            start = nodoAuxiliarBusqueda;
        }
        else{
            buscarPosicion(dato);

            if(nodoAuxiliarBusqueda.nodoSiguiente.dato == dato){
                System.out.println(nodoAuxiliarBusqueda.nodoSiguiente.dato);
                nodoAuxiliarIntercambio = nodoAuxiliarBusqueda.nodoSiguiente.nodoSiguiente;
                nodoAuxiliarBusqueda.nodoSiguiente = nodoAuxiliarIntercambio;
            }
            else{
                System.out.println("El dato no se encuentra en la lista");
            }
        }
    }

    private void buscarPosicion(int dato){
        nodoAuxiliarBusqueda = start;

        while(nodoAuxiliarBusqueda.nodoSiguiente != null && nodoAuxiliarBusqueda.nodoSiguiente.dato < dato){
            nodoAuxiliarBusqueda = nodoAuxiliarBusqueda.nodoSiguiente;
        }
    }


    Lista(){
        start = end = nodoAuxiliarBusqueda = null;
    }
}
