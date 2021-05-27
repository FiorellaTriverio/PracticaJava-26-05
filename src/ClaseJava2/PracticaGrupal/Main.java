package ClaseJava2.PracticaGrupal;

import ClaseJava1.PracticaIndividual.StringUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Fecha fecha = new Fecha();

        System.out.println(fecha.getDia());
        System.out.println(fecha.getMes());
        System.out.println(fecha.getAnio());

        System.out.println(StringUtil.ltrim("     holaa   jjjjjj"));
        System.out.println(StringUtil.rtrim("     holaa   jjjjj    "));
        System.out.println(StringUtil.trim("     holaa   "));

        System.out.println(StringUtil.indexOfN("John|Paul|George|Ringo",'|',2));

        Fraccion f1 = new Fraccion(250,8);
        Fraccion f2 = new Fraccion(58, 22);
        System.out.println("Suma: " + f1.sumar(f2));

        f1 = new Fraccion(250,8);
        f2 = new Fraccion(58, 22);
        System.out.println("Resta: " + f2.restar(f1));

        f1 = new Fraccion(250,8);
        f2 = new Fraccion(58, 22);
        System.out.println("Multiplicar: " + f2.multiplicar(f1));

        f1 = new Fraccion(250,8);
        f2 = new Fraccion(58, 22);
        System.out.println("Dividir: " + f1.dividir(f2));



    }


}
