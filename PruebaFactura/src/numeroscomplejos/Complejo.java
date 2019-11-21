package numeroscomplejos;

public class Complejo {

    //Atributos de clase
    private double parteReal;
    private double parteImaginaria;

    //Constructores
    public Complejo() {
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }

    public Complejo(double real, double imaginaria) {
        this.parteReal = real;
        this.parteImaginaria = imaginaria;
    }

    //Accesadores
    public double getParteReal() {
        return parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }
    //MÃ©todos
    //Suma: (a,b)+(c,d)=(a+c,b+d)

    public void suma(Complejo otro) {
        this.parteReal = this.getParteReal() + otro.getParteReal();
        this.parteImaginaria += otro.getParteImaginaria();
    }

    //Resta: (a,b)-(c,d)=(a-c,b-d)
    public void resta(Complejo otro) {
        this.parteReal -= otro.getParteReal();
        this.parteImaginaria -= otro.getParteImaginaria();
    }

    //Producto: (a,b)*(c,d)=(ac-bd,ad+bc)
    public void producto(Complejo otro) {
        double parteReal = ((this.parteReal * otro.getParteReal()) - (this.parteImaginaria * otro.getParteImaginaria()));
        double parteImaginaria = ((this.parteReal * otro.parteImaginaria) + (this.parteImaginaria * otro.parteReal));

        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    //Cociente: (a,b)/(c,d)=((ac+bd)/(c2+d2),(bc-ad)/(c2+d2))
    public void cociente(Complejo otro) {
        double parteReal = (((this.parteReal * otro.parteReal) + (this.parteImaginaria * otro.parteImaginaria))
                / ((Math.pow(otro.parteReal, 2) + (Math.pow(otro.parteImaginaria, 2)))));
        double parteImaginaria = (((this.parteImaginaria * otro.parteReal) - (this.parteReal * otro.parteImaginaria))
                / ((Math.pow(otro.parteReal, 2) + (Math.pow(otro.parteImaginaria, 2)))));

        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    @Override
    public String toString() {
        return "(" + parteReal + ","
                + parteImaginaria + ")";
    }

    public static void main(String[] args) {

        Complejo n1 = new Complejo(9, 5);
        Complejo n2 = new Complejo(7, 8);

        System.out.print("Operación de SUMA de los números complejos: " + n1
                + " - " + n2 + " = ");
        n1.suma(n2);
        System.out.println(n1 + "\n");

        System.out.print("Operación de RESTA de los números complejos: " + n1 + " + " + n2 + " = ");
        n1.resta(n2);
        System.out.println(n1 + "\n");

        System.out.println("Operación de PRODUCTO de los números complejos: (" + n1.getParteReal() + "+(" + n1.getParteImaginaria() + "i)) "
                + "* (" + n2.getParteReal() + "+(" + n2.getParteImaginaria() + "i))");
        n1.producto(n2);
        System.out.println(n1 + "\n");

        System.out.println("Operación de COCIENTE de los números complejos: (" + n1.getParteReal() + "+(" + n1.getParteImaginaria() + "i)) "
                + "* (" + n2.getParteReal() + "+(" + n2.getParteImaginaria() + "i))");
        n1.cociente(n2);
        System.out.println(n1 + "\n");
    }
}
