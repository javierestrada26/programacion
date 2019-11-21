/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje;

import java.util.ArrayList;

/**
 *
 * @author JAVIER
 */
public abstract class FigGeometrica {

    public double area;

    public abstract String calcuArea();

}

class Rectangulo extends FigGeometrica {

    public double b, a;

    public Rectangulo(double b, double a) {
        this.b = b;
        this.a = a;
    }
   
    @Override
    public String calcuArea() {
        this.area = b * a;
        String cadenac = "El area del rectangulo es : "+area;
        return cadenac;
    }

}

class Circulo extends FigGeometrica {

    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public String calcuArea() {
        this.area = radio * 3.1416;
        String cadenac = "El area del circulo es : "+area;
        return cadenac;
    }

}

class Cuadrado extends FigGeometrica {

    public double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String calcuArea() {
        this.area = lado * 2;
        String cadenac = "El area del cuadrado es : "+area;
        return cadenac;
    }

}

class test {

    public static ArrayList<FigGeometrica> figuras = new ArrayList<FigGeometrica>();

    public static void main(String[] args) {
        FigGeometrica rectangulo = new Rectangulo(5, 7);
        FigGeometrica circulo = new Circulo(4.12);
        FigGeometrica cuadrado = new Cuadrado(5);
        
        figuras.add(rectangulo);
        figuras.add(circulo);
        figuras.add(cuadrado);

        for (FigGeometrica figura : figuras) {
            System.out.println(figura.calcuArea());
        }

    }
}
