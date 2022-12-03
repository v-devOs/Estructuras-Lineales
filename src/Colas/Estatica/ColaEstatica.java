package Colas.Estatica;


public class ColaEstatica {
    private int cola[];
    private int start, end , totalDatos;

    public void input(int dato){

        if(totalDatos == cola.length){
            System.out.println("Overflow");
        }
        else if(totalDatos == 0){
            start = end = 0;
            cola[start] = dato;
            totalDatos++;
        }
        else{
            end++;
            cola[end] = dato;
            totalDatos++;
        }
    }

    public void output(){
        if(totalDatos == 0){
            System.out.println("Underflow");
        }
        else{
            System.out.println(cola[start]);
            start++;
            totalDatos--;
        }
    }

    ColaEstatica(int lenght){
        cola = new int[lenght];
        totalDatos = 0;
    }
}
