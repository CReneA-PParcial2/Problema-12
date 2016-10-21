/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg12;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*CALCULO Y LA MUESTRA DE LOS NUMEROS EN CELDAS PARES
        EN UN ARREGLO DE 10 CELDAS
        */
        int []arreglo = new int[10];
        arreglo = llenarArreglo(arreglo);
        mostrarResultado(arreglo);
    }
    
    //
    public static int[] llenarArreglo(int[]a){
        Scanner entradaArreglo = new Scanner(System.in);
        int i = 0;
        while (i<a.length){
            System.out.println("Introduce el numero que deseas almacenar");
            a[i] = entradaArreglo.nextInt();
            i++;
        }
        return a;
    }
    public static void mostrarResultado(int[]a){
        int x=0, y=0;
        for (int i=1; i<a.length; i+=2){
            x = a[i] + x;
            y++;
        }
        x = (x/y);
        System.out.println("El promedio de los numeros almacenados en las celdas es: " + x);
    }
}
