package PracticaGrupal;

import java.util.Scanner;

public class Ejercicio1 {

    /**
     * Desarrollar un programa para mostrar los primeros n números pares,
     * siendo n un valor que el usuario ingresará por consola.
     *  Recordá que un número es par cuando es divisible por 2.
     */


    public static void main(String[] args){

        System.out.println("Ingrese valor: ");

        int n;

        Scanner entradaEscaner = new Scanner (System.in);

        n = entradaEscaner.nextInt();

        for(int i=0; i<n; i++){
            if(i%2==0) System.out.println(i);
        }

        entradaEscaner.close();

    }

}
