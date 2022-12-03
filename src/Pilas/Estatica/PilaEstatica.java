package Pilas.Estatica;

public class PilaEstatica {
    private int pila[];
    private int totalDatos, tope;

    public void input(int dato){

        if(totalDatos == pila.length){
            System.out.println("Overflow");
        }
        else if(totalDatos == 0){
            tope = 0;
            totalDatos++;
            pila[tope] = dato;
        }
        else{
            tope++;
            totalDatos++;
            pila[tope] = dato;
        }
    }
    
    public void output(){

        if(totalDatos == 0){
            System.out.println("Underflow");
        }
        else{
            System.out.println(pila[tope]);
            tope--;
            totalDatos--;
        }
    }

    PilaEstatica(int lenght){
        pila = new int[lenght];
        totalDatos = 0;
    }
}
