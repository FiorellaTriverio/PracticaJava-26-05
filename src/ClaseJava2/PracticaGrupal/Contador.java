package ClaseJava2.PracticaGrupal;

public class Contador {

    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador() {
    }

    public Contador(Contador c){
        this(c.valor);
    }


    public void incrementar(){
        valor++;
    }

    public void decrementar(){
        if(valor>0) valor--;
    }


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
