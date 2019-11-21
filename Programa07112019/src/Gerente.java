
public class Gerente extends Empleado {

    public String Departamento;

    public String Secretaria;

    private double bonoAdic;

    public Gerente(String Departamento, String Secretaria, double bonoAdic, String nombre, double horasLab, double costoHoras, double Bononavi) {
        super(nombre, horasLab, costoHoras, Bononavi);
        this.Departamento = Departamento;
        this.Secretaria = Secretaria;
        this.bonoAdic = bonoAdic;
    }

    public void calcularSueldo() {
        super.calcularSueldo();
        this.setSueldo(this.getSueldo() + this.bonoAdic);
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "Departamento=" + Departamento
                + ", Secretaria=" + Secretaria + ", bonoAdic=" + bonoAdic + '}';
    }

}
