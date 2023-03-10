package Colas.Dinamica;

public class Cola {
    private Nodo inicio, end;
    private Nodo nodoAux;

    public void input(int dato){
        Nodo nodoInput = new Nodo(dato);

        if(inicio == null){
            end = inicio = nodoInput;
        }
        else{
            end.nodoSiguiente = nodoInput;
            end = end.nodoSiguiente;
            // buscarPosicion();
            // nodoAux.nodoSiguiente = nodoInput;
        }
    }

    // private void buscarPosicion(){
    //     nodoAux = inicio;

    //     while(nodoAux.nodoSiguiente != null){
    //         nodoAux = nodoAux.nodoSiguiente;
    //     }
    // }

    public void output(){
        if(inicio == null){
            System.out.println("Underflow");
        }
        else{
            nodoAux = inicio;
            inicio = inicio.nodoSiguiente;
            System.out.println(nodoAux.dato);
        }
    }

    Cola(){
        inicio = null;
        nodoAux = null;
        end = null;
    }
}
