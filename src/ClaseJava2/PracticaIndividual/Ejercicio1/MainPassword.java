package ClaseJava2.PracticaIndividual.Ejercicio1;

public class MainPassword {

    public static void main(String[] args) throws Exception {

        Password pass = new PasswordSimple();
        try {
            pass.setValue("123aaaaaaaaaaaaaa");
        }catch (Exception e){
            System.out.println("Exception password simple 1");
        }

        try {
            pass.setValue("123");
        }catch (Exception e){
            System.out.println("Exception password simple 2");
        }


        pass = new PasswordIntermedia();
        try {
            pass.setValue("123aaaQQa");
        }catch (Exception e){
            System.out.println("Exception password intermedia 1");
        }
        try {
            pass.setValue("123aaa");
        }catch (Exception e){
            System.out.println("Exception password intermedia 2");
        }


        pass = new PasswordFuerte();
        try {
            pass.setValue("123aa@@++aAA*-5feaAA");
        }catch (Exception e){
            System.out.println("Exception password fuerte 1");
        }

        try {
            pass.setValue("123aaaAAAA");
        }catch (Exception e){
            System.out.println("Exception password fuerte 2");
        }


    }


}
