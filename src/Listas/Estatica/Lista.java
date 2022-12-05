package Listas.Estatica;

public class Lista {
    private int lista[];
    private int start, end, totalDatos;

    public void input(int dato){
        int posicion;

        if(totalDatos == lista.length){
            System.out.println("Overflow");
        }
        else if(totalDatos == 0) {
            start = end = 0;
            lista[start] = dato;
            totalDatos++;
        }
        else if(lista[start] > dato){
            realizarCorrmientos();
            lista[start] = dato;
            end++;
            totalDatos++;
        }
        else if(lista[end] < dato){
            end++;
            lista[end] = dato;
            totalDatos++;
        }
        else{
            posicion = buscarPosicion(dato) + 1;
            realizarCorrmientos((totalDatos - posicion));
            lista[posicion] = dato;
            totalDatos++;
            end++;
        }
    }

    private void realizarCorrmientos(){
        int index = totalDatos - 1;

        while(index >= 0){
            lista[index + 1] = lista[index];
            index--;
        }
    }
    
    private int buscarPosicion(int dato){
        int index = 0;

        while(index < totalDatos && lista[index + 1] < dato){
            index++;
        }

        return index;
    }

    private void realizarCorrmientos(int corrimientosRealizar){
        int index = totalDatos - 1;
        int corrmientosRealizados = 0;

        while (corrmientosRealizados <= corrimientosRealizar) {
            lista[index + 1] = lista[index];
            corrmientosRealizados++;
            index--;
        }

    }

    public void output(int dato){
        int posicion, corrimientosRealizar;
        if(totalDatos == 0){
            System.out.println("Underflow");
        }
        else if(lista[start] == dato){
            System.out.println(lista[start]);
            start++;
        }
        else if(lista[end] == dato){
            System.out.println(lista[end]);
            end--;
        }
        else{
            posicion = buscarPosicion(dato) + 1;

            if(lista[posicion] == dato){

                System.out.println(lista[posicion]);
    
                corrimientosRealizar = totalDatos - (posicion + 1);
                realizarCorrmientosOutput(corrimientosRealizar, posicion);
                totalDatos--;
                end--;
            }
            else{
                System.out.println("El dato " + dato + " no se encuentra en la lista");
            }
        }
    }

    private void realizarCorrmientosOutput(int corrimientosRealizar, int posicion){
        int index = posicion;
        int corrmientosRealizados = 0, indexCambiar = index + 1;

        while (corrmientosRealizados <= corrimientosRealizar) {
            if(indexCambiar < totalDatos){
                lista[index] = lista[indexCambiar];
            }
            index++;
            indexCambiar = index;
            corrmientosRealizados++;
        }
    }

    public void mostrar(){

        for (int i = 0; i < totalDatos; i++) {
            System.out.println(lista[i]);
        }
    }

    Lista(int length){
        lista = new int[length];
        totalDatos = 0;
    }
}
