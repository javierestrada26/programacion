/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frecuenciacardiaca;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre : ");
        String nombre = entrada.next();
        System.out.print("Ingrese su apellido : ");
        String apellido = entrada.next();
        System.out.print("Ingrese su año de nacimiento : ");
        int anio = entrada.nextInt();
        System.out.print("Ingrese su mes de nacimiento : "
                + "(completo-palabras): ");
        String mes = entrada.next();
        System.out.print("Ingrese su dia de : ");
        int dia = entrada.nextInt();
        FrecuenciasCardiacas mediador = new FrecuenciasCardiacas(nombre,
                apellido, mes, anio, dia);
        System.out.println("----------------------Información del Cliente------"
                + "--------------");
        System.out.println("Nombre del paciente: " + mediador.getNombre() + " "
                + "" + mediador.getApellido()
                + "\nFecha de nacimiento: " + mediador.getDia() + "-" 
                + mediador.getMes()
                + "-" + mediador.getAnio()
                + "\nEdad: " + mediador.getAnios() + " Años"
                + "\nFrecuencia Cardiaca: " + mediador.getFrecuenciaCardiaca()
                + "\nRango de Frecuencia Esperada: " + 
                mediador.getRangoFrecuencia());
    }
}
