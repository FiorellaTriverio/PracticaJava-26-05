package PracticaGrupal;

import java.util.Scanner;

public class Ejercicio3 {

    /**
     * Desarrollar un programa para informar si un número n es primo o no,
     * siendo n un valor que el usuario ingresará por consola.
     * Recordá que un número es primo cuando sólo es divisible por sí mismo y por 1.
     */

    public static void main(String[] args){

        System.out.println("Ingrese valor: ");

        int n;
        Scanner entrada = new Scanner(System.in);

        n = entrada.nextInt();


        int cont =0;

        for(int i=1; i<=n; i++){
            if(n%i==0) {
                cont++;
            }
        }

        if(cont<=2 && n!=1) {
            System.out.println("Es primo");
        }else System.out.println("No es primo");

    }

}
