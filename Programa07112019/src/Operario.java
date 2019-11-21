
public class Operario extends Empleado {

    public Operario(String nombre, double horasLab, double costoHoras, double Bononavi) {
        super(nombre, horasLab, costoHoras, Bononavi);
    }

    @Override
    public String toString() {
        return "Operario{" + '}';
    }

}
