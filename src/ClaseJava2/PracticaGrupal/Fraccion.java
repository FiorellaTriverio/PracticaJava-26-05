package ClaseJava2.PracticaGrupal;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fraccion sumar(Fraccion f) {
        Fraccion aux = new Fraccion();

        aux.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
        aux.denominador = this.denominador * f.denominador;

        aux.simplificar();

        return aux;
    }


    public Fraccion restar(Fraccion f) {
        Fraccion aux = new Fraccion();

        aux.numerador = this.numerador * f.denominador - this.denominador * f.numerador;
        aux.denominador = this.denominador * f.denominador;

        aux.simplificar();

        return aux;
    }


    public Fraccion multiplicar(Fraccion f) {
        Fraccion aux = new Fraccion();

        aux.numerador = this.numerador * f.numerador;
        aux.denominador = this.denominador * f.denominador;

        aux.simplificar();

        return aux;
    }


    public Fraccion dividir(Fraccion f) {
        Fraccion aux = new Fraccion();

        aux.numerador = this.numerador * f.denominador;
        aux.denominador = this.denominador * f.numerador;

        aux.simplificar();
        return aux;
    }



    public void simplificar() {
        int i=2;

        while( i<=numerador && i<=denominador )
        {
            if( numerador%i==0 && denominador%i==0 )
            {
                numerador = numerador/i;
                denominador = denominador/i;
            }
            else
            {
                i++;
            }
        }

    }


    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

}
