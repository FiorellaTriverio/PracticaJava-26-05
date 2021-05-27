package ClaseJava2.PracticaIndividual.Ejercicio1;

import java.util.regex.Pattern;

public class PasswordSimple extends Password{

    @Override
    public void setValue(String pwd) throws Exception {

        String regex = "^(?=.*[0-9])(?=\\S+$).{8,}$";
        /*
        (?=.*[0-9]) un dígito debe aparecer al menos una vez
        (?=\\S+$) no se permiten espacios en blanco en toda la cadena
        .{8,} Al menos 8 carácteres
        */

        if (Pattern.matches(regex, pwd)) super.setPwd(pwd);
        else throw new Exception("Contraseña simple inválida, revisar condiciones");

    }



}
