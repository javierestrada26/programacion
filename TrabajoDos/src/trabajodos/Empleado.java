package trabajodos;

/**
 *
 * @author JAVIER
 */
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

    public double getHorasLab() {
        return horasLab;
    }

    public void setHorasLab(double horasLab) {
        this.horasLab = horasLab;
    }

    public double getCostoHoras() {
        return costoHoras;
    }

    public void setCostoHoras(double costoHoras) {
        this.costoHoras = costoHoras;
    }

    public double getBononavi() {
        return Bononavi;
    }

    public void setBononavi(double Bononavi) {
        this.Bononavi = Bononavi;
    }

}

class Gerente extends Empleado {

    public String departamento;

    public String Secretaria;

    private double bonoAdic;

    public Gerente(String departamento, String Secretaria, double bonoAdic, String nombre, double horasLab, double costoHoras, double Bononavi) {
        super(nombre, horasLab, costoHoras, Bononavi);
        this.departamento = departamento;
        this.Secretaria = Secretaria;
        this.bonoAdic = bonoAdic;
    }

    public void calcularSueldo() {
        super.calcularSueldo();
        this.setSueldo(this.getSueldo() + this.bonoAdic);
    }

    @Override
    public String toString() {
        return String.format("Gerente: \n\t"
                + "Nombre: %s\n\t"
                + "Secretaria: %s\n\t"
                + "Departamento: %s\n\t"
                + "Horas Laboradas: %.2f\n\t"
                + "Costo por horas: %.2f\n\t"
                + "Bono General: %.2f\n\t"
                + "Bono Adicional: %.2f\n", this.getNombre(), Secretaria,
                departamento, this.getHorasLab(), this.getCostoHoras(),
                this.getBononavi(), bonoAdic);
    }

}

class Operario extends Empleado {

    private double horasExtras;
    private double costoHorasExtras;

    public Operario(String nombre, double horasLab,
            double horasExtras, double costoHoras,
            double Bononavi) {
        super(nombre, horasLab, costoHoras, Bononavi);
        this.horasExtras = horasExtras;
        this.costoHorasExtras = costoHoras * 2;

    }

    public void calcularSueldo() {
        super.calcularSueldo();
        this.setSueldo(this.getSueldo() + (this.costoHorasExtras));
    }

    @Override
    public String toString() {
        return String.format("Operario: \n\t"
                + "Nombre: %s\n\t"
                + "Horas Laboradas: %.2f\n\t"
                + "Horas extras: %.2f\n\t"
                + "Costo por horas: %.2f\n\t"
                + "Costo por horas extra: %.2f\n\t"
                + "Bono General: %.2f\n\t",
                this.getNombre(), this.getHorasLab(), this.horasExtras,
                this.getCostoHoras(), this.costoHorasExtras,
                this.getBononavi());
    }

}

class test {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("A", "B", 500, "Jose", 2, 3, 1);
        gerente1.calcularSueldo();
        Operario operario1 = new Operario("Andres", 8, 2, 6, 200);
        System.out.println(gerente1);
        System.out.println(operario1);
    }
}
