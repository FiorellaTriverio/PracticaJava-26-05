import java.util.Scanner;

public class Ejercicio4 {

    /**
     * Desarrollar un programa para mostrar por consola los primeros n números primos,
     * siendo n un valor que el usuario ingresará por consola.
     */


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
