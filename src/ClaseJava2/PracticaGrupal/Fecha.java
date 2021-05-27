package ClaseJava2.PracticaGrupal;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha() {
        Calendar cal = Calendar.getInstance();
        this.dia = cal.get(Calendar.DAY_OF_MONTH);
        this.mes = cal.get(Calendar.MONTH)+1;
        this.anio = cal.get(Calendar.YEAR);
    }

    public boolean fechaCorrecta(){

        boolean diaCorrecto, mesCorrecto, anioCorrecto;

        anioCorrecto = anio > 0;
        mesCorrecto = mes>0 && mes<=12;
        diaCorrecto = dia>0 && dia<=31;

        return diaCorrecto && mesCorrecto && anioCorrecto;
    }

    public boolean isFechaCorrecta(Fecha f){
        if(f.dia < 0 || f.dia > 31){
            return false;
        }
        if(f.mes < 0 || f.mes > 12){
            return false;
        }
        return f.anio >= 0;
    }

    public void diaSiguiente(){

        dia++;
        if(dia>31) {
            dia = 1;
            mes++;
        }
        if(mes>12) {
            mes = 1;
            anio++;
        }

    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
