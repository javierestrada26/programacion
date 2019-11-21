
package operaciones;
import java.util.Scanner;

public class ClasePadre {
    protected int valor1,valor2,resultado;
    Scanner entrada = new Scanner (System.in);
    
    //Este método pide los valores al usuario 
    public void PedirDatosOP(){
        System.out.print("Dame el NUMERO de horas : ");
        valor1 = entrada.nextInt();
        
        System.out.println("Dame EL PRECIO POR HORA : ");
        valor2 = entrada.nextInt();
    }
    public void PedirDatosGt(){
        System.out.println("Sueldo de Gerente");
        valor1 = entrada.nextInt();
    }
    
    //Eate método muestra el resultado
    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
