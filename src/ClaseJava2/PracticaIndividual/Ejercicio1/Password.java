package ClaseJava2.PracticaIndividual.Ejercicio1;

import java.util.regex.Pattern;

public class Password {

    private String value;
    private String regex;

    public Password(String value, String regex) {
        this.value = value;
        this.regex = regex;
    }

    public Password(String regex){
        this.regex = regex;
    }

    public Password(){
    }

    public void setValue(String pwd) throws Exception {

        if (Pattern.matches(regex, pwd)) this.value = pwd;
        else throw new Exception("Contraseña inválida, revisar condiciones");

    }

    public void setPwd(String pwd){
        this.value = pwd;
    }

    public String getValue() {
        return value;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}