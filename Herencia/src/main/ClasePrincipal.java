
package main;

import operaciones.ClaseHija_GT;
import operaciones.ClaseHija_OP;
public class ClasePrincipal {
    public static void main(String[] args) {
        ClaseHija_OP mediador_multi = new ClaseHija_OP();
        mediador_multi.PedirDatosOP();
        mediador_multi.Multi();
        System.out.println("El sueldo de operario es de : ");
        mediador_multi.MostrarResultado();
        
        ClaseHija_GT mediador_asig = new ClaseHija_GT();
        mediador_asig.PedirDatosGt();
        mediador_asig.Asig();
        System.out.println("El sueldo gerente es de : ");
        mediador_asig.MostrarResultado();
    }
}
