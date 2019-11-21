
package pruebafactura;

import java.util.Scanner;
public class PruebaFactura {

    
    public static void main(String[] args) {
       String numeroPieza = null;
       String descripcionPieza = null;
       int cantidadPieza = 0;
       double precioPieza=0.0;
       Factura fact = new Factura(numeroPieza, descripcionPieza, cantidadPieza,
               precioPieza);
       char respuesta;
       Scanner entrada = new Scanner(System.in);
        System.out.println("------Bienvenido-----");
        
        do{
            System.out.println("Ingrese el número de pieza: ");
            numeroPieza = entrada.next();
            System.out.println("Ingrese la descripción de la pieza");
            descripcionPieza = entrada.next();
            System.out.println("Ingrese la cantidad de piezas ");
            cantidadPieza = entrada.nextInt();
            System.out.println("Ingrese el precio de la pieza");
            precioPieza = entrada.nextDouble();
            fact.obtenerMontoFactura(cantidadPieza,precioPieza);
            System.out.println("¿Desea ingresar otro producto?");
            respuesta = entrada.next().charAt(0);
        }while(respuesta == 's' || respuesta == 'S');
        System.out.println("El precio total a pagar es de : " +fact.montoFactura);
    }
}
    

