package frecuenciacardiaca;

/**
 *
 * @author JAVIER
 */
public class FrecuenciasCardiacas {

    String nombre;
    String apellido;
    String mes;
    int anio;
    int dia;
    double frecuencia;
    int edad;

    public FrecuenciasCardiacas(String nombre, String apellido, String mes, 
            int anio, int dia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mes = mes;
        this.anio = anio;
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getAnios() {
        edad = 2019 - getAnio();
        return edad;
    }
    public double getFrecuenciaCardiaca() {

        return frecuencia = 220 - getAnios();
    }
    public String getRangoFrecuencia() {
        double inferior = frecuencia * 0.50;
        double superior = frecuencia * 0.85;
        return "Rango esperado entre " + inferior + " y " + superior;
    }

}
