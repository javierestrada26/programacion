
public class Empleado {

    private String nombre;

    public double sueldo;

    private double horasLab;

    private double costoHoras;

    private double Bononavi;

    public Empleado(String nombre,
            double horasLab, double costoHoras, double Bononavi) {
        this.nombre = nombre;
        this.horasLab = horasLab;
        this.costoHoras = costoHoras;
        this.Bononavi = Bononavi;
        this.calcularSueldo();
        this.sueldo = this.getSueldo();
    }

    public Empleado() {
    }

    public void calcularSueldo() {
        this.sueldo = (this.costoHoras * this.horasLab) + this.Bononavi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo
                + ", horasLab=" + horasLab + ", costoHoras=" + costoHoras
                + ", Bononavi=" + Bononavi + '}';
    }
}
