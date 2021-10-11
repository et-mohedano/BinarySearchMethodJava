/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

/**
 *
 * @author EFRA
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    int busqueda(int[] arr, int dato){
        int primero, ultimo, centro;
        centro = arr.length/2;
        primero = 0;
        ultimo = arr.length-1;
        while(primero<=ultimo){
            if (arr[centro]==dato) {
                return centro;
            }else if (arr[centro]>dato) {
                ultimo = centro-1;
                centro = ultimo/2;
            }else{
                primero = centro+1;
                centro = ((ultimo-primero)/2)+primero;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {3, 5, 9, 11, 15, 20, 22};
        BusquedaBinaria b = new BusquedaBinaria();
        int indice = b.busqueda(arr, 23);
        if (indice>=0) {
            System.out.println(indice);
        }else{
            System.out.println("El número no existe");
        }
    }
    
}
