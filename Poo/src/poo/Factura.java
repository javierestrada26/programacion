/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author JAVIER
 */
public class Factura {

    public String fecha;
    public String nombre;
    public int cedula;
    public String direccion;
    public double monto;
    public double iva;
    public double descuento;
    public double factura;
    public String cadena;
    public double descuento1;

    public double valor;

    public Factura() {
    }

    public Factura(String fecha, int cedula, String direccion, String nombre, double monto, double iva, double descuento) {
        this.descuento = descuento;
        this.cedula = cedula;
        this.fecha = fecha;
        this.direccion = direccion;
        this.nombre = nombre;
        this.monto = monto;
        this.iva = iva;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String toString() {
        return String.format("Fecha:%s", fecha);// AQUI LE TENGO QUE AGREGAR LOS DEMAS  S ES PARA STRING ,D PARA ENTEROS Y .2F PARA DECIMALES
    }

    public double facturar() {
        if (monto > 1000) {
            descuento1 = (descuento * 5) / 100;
            factura = (monto * iva) / 100;
            factura = factura - descuento1 + monto;
        } else {
            factura = (monto * iva) / 100;
            factura = factura - descuento + monto;
        }
        return factura;
    }

    public String descontar() {
        if (descuento > monto) {
            cadena = String.format("%s", "Error, el descuento es mayor al"
                    + " monto, imposible realizar la compra.");

        } else {
            cadena = String.format("%s",
                    "La compra se ha realizado con exito.");
        }
        return cadena;
    }
}

class PruebaFactura {

    public static void main(String[] args) {
        Factura fact1 = new Factura();
        Factura fact2 = new Factura("110/2014/201", 1104417173, "CATA", "JAVIE", 100.00, 12.36, 20.03);

        System.out.println(fact2);
        System.out.println(fact2.facturar());
    }
}
