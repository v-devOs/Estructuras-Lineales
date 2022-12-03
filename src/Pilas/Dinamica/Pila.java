package Pilas.Dinamica;

public class Pila {
    private Nodo tope;
    private Nodo nodoAux;

    public void input(int dato){
        Nodo nodoInput = new Nodo(dato);

        if(tope == null){
            tope = nodoInput;
        }
        else{
            nodoAux = tope;
            tope = nodoInput;
            tope.nodoSiguiente = nodoAux;
        }

        System.out.println("Se inserto"+ nodoInput.dato);
    }

    public void output(){
        if(!sePuedeOutput()){
            System.out.println("Underflow");
        }
        else{
            nodoAux = tope;
            tope = tope.nodoSiguiente;
            System.out.println(nodoAux.dato);
        }
    }

    private boolean sePuedeOutput(){
        
        if(tope == null){ return false;}
        else{return true;}
    }


    Pila(){
        tope = null;
        nodoAux = null;
    }
}
