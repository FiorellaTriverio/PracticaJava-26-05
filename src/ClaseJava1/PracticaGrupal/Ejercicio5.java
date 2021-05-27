package ClaseJava1.PracticaGrupal;

import java.util.Scanner;

public class Ejercicio5 {

    /**
     *Desarrollar un programa para mostrar por consola los primeros n números naturales
     *que tienen al menos m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.
     *
     * Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa deberá mostrar por consola
     * los primeros 5 números naturales que tienen, al menos, 2 dígitos 3.
     * En este caso la salida será: 33, 133, 233, 303, 313.
     *
     * Según cómo decidas encarar la solución de este ejercicio, es probable que necesites utilizar
     * recursos que aún no hemos estudiado. El desafío consiste en googlear cómo utilizar dichos recursos y ¡utilizarlos!
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, d, cont =0, numAux = 0, num = 1, contadorDigitos;

        System.out.println("Ingresa los valores para n, m y d:");
        n=sc.nextInt();
        m=sc.nextInt();
        d=sc.nextInt();

        while (cont < n){
            numAux = num;
            contadorDigitos = 0;

            while(numAux > 0){
                if(numAux%10 == d){
                    contadorDigitos++;
                }
                numAux/=10;
            }

            if(contadorDigitos >= m){
                System.out.println(num);
                cont++;
            }
            num++;
        }
    }

    /**
     * Otra solución pero con String y char
     */
    /*public static void main(String[] args){

        int n, m, d;

        System.out.println("Ingrese valor n, m y d: ");
        Scanner entradaEscaner = new Scanner (System.in);
        n = entradaEscaner.nextInt();
        m = entradaEscaner.nextInt();
        d = entradaEscaner.nextInt();

        int numero = 0;

        while(n>0){

            if(esValido(m ,d, numero)){
                System.out.println(numero);
                n--;
            }

            numero++;
        }

        entradaEscaner.close();

    }

    public static boolean esValido(int cantDigitos, int digito, int numero){

        String numero_str = String.valueOf(numero);
        char[] digitos_numero = numero_str.toCharArray();

        int cont = 0;

        for(int i = 0; i < digitos_numero.length; i++) {
            if(Character.getNumericValue(digitos_numero[i]) == digito) cont++;
        }

        if(cont==cantDigitos) return true;

        return false;
    }*/

}
