
package ejercicio1;


public abstract class Poligono {
    protected int nlados;

    public Poligono(int nlados) {
        this.nlados = nlados;
    }

    public int getNlados() {
        return nlados;
    }
    
    @Override
    public String toString(){
        return "Numero de lados: " +nlados;
    }
    
    public abstract double area();
}
