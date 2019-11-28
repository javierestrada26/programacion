package ejercicio1;

/**
 *
 * @author JAVIER
 */
public class Triangulo extends Poligono {

    protected double lado1;
    protected double lado2;
    protected double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +super.toString()+ "º\nlado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
    
    @Override
    public double area(){
        double p = (lado1+lado2)/2;
        return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));
    }
}
