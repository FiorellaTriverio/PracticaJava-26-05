import java.util.Scanner;

public class Ejercicio2 {

    /**
     * Desarrollar un programa para mostrar los primeros n múltiplos de m,
     * siendo n y m valores que el usuario ingresará por consola.
     * Recordá que un número a es múltiplo de b si a es divisible por b.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        System.out.println("Ingresa el número para calcular sus múltiplos:");
        m = sc.nextInt();
        System.out.println("Ingresa la cantidad de múltiplos a calcular:");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(m*i);
        }
    }

}
