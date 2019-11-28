
package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    
    static ArrayList<Poligono>poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        //llenar el poligono 
        llenarPoli();
        mostrarResultados();
    }
    
    public static void llenarPoli(){
        int op;
        char respuesta;
        do{
        do{
            System.out.println("Dijite que poligono desea: ");
            System.out.println("1---Trinagulo");
            System.out.println("2---Rectangulo");
            op = entrada.nextInt();
        }while(op<1 || op>2);
        switch(op){
            
            case 1:
                llenarTriangulo();
                break;
            case 2 :
                llenarRectangulo();
                break;
        }
            System.out.println("\nDesea introducir otro poligono(s/n)");
            respuesta = entrada.next().charAt(0);
        }while(respuesta =='s'|| respuesta=='S');
    }
    
    public static void llenarTriangulo(){
        double lado1, lado2,lado3;
        
        System.out.println("Dijite el lado 1");
        lado1 = entrada.nextDouble();
        System.out.println("Dijite el lado 2");
        lado2 = entrada.nextDouble();
        System.out.println("Dijite el lado 3");
        lado3 = entrada.nextDouble();
        
        Triangulo trinagulo = new Triangulo(lado1,lado2,lado3);
        
        poligono.add(trinagulo);
    }
    
    public static void llenarRectangulo(){
        double lado1, lado2;
        
        System.out.println("Dijite el lado 1");
        lado1 = entrada.nextDouble();
        System.out.println("Dijite el lado 2");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        
        poligono.add(rectangulo);
    }
 
    public static void mostrarResultados(){
        
        for(Poligono poli : poligono){
            
            System.out.println(poli.toString());
            System.out.println("Area"+poli.area());
            System.out.println("");
        }
    }
}
