/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacirculo;

/**
 *
 * @author mati
 */
public class Cuadrado {

    private double lado;

    public Cuadrado(double lad) {
        lado = lad;

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double valor) {
        lado = valor;
    }
    
    public double perimetro() {
        return 4 * lado;
    }

    public double area() {
        return lado * lado;
    }

    public double lado() {
        return 4;
    }
}
