package ClaseJava2.PracticaGrupal;

public class CuentaCorriente {

    private String titular;
    private String nombre;
    private Double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String titular, String nombre, Double saldo) {
        this.titular = titular;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente c){
        this.titular = c.titular;
        this.nombre = c.nombre;
        this.saldo = c.saldo;
    }

    public void ingreso(Double n){

        if(n>0) setSaldo(saldo+n);
    }

    public void egreso(Double n){
        if(n==saldo) setSaldo(saldo-n);
    }

    /**
     * CHEQUEAR
     */
    public void reintegro(Double n){
        if(n<=saldo && n>0) setSaldo(saldo-n);
    }


    public void transferencia(CuentaCorriente c, Double n){
        if(n>0 && n<=saldo) {
            c.ingreso(n);
            reintegro(n);
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
