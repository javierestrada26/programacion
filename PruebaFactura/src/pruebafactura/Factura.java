package pruebafactura;

public class Factura {

    String numeroPieza;
    String descripcionPieza;
    int cantidadPiezas;
    double precioPieza;
    double montoFactura;

    public Factura(String numeroPieza, String descripcionPieza,
            int cantidadPiezas, double precioPieza) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidadPiezas = cantidadPiezas;
        if (precioPieza > 0.0) {
            this.precioPieza = precioPieza;
        }
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidadPiezas() {
        return cantidadPiezas;
    }

    public void setCantidadPiezas(int cantidadPiezas) {
        this.cantidadPiezas = cantidadPiezas;
    }

    public double getPrecioPieza() {
        return precioPieza;
    }

    public void setPrecioPieza(double precioPieza) {
        this.precioPieza = precioPieza;
    }

    public double obtenerMontoFactura(int cantidadPieza, double precioPieza) {
        this.montoFactura += cantidadPieza * precioPieza;
        return this.montoFactura;
    }
}
