/*
 * Circulo.java
 */
package practicacirculo;

public class Circulo {

    private double radio;
    private double angulo;

    public Circulo(double rad, double ang) {  // Constructor
        radio = rad;
        angulo = ang;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double valor) {
        radio = valor;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double diametro() {
        return 2 * radio;
    }

    public double perimetro() {
        return 2 * radio * Math.PI;
    }

    /*public double areaSector() { //formula incorrecta angulo/360 * radio *PIcuadrado
     angulo = 365;
     return (angulo/360) * radio * Math.pow(Math.PI, 2);
        
     } */
    public double areaSector() { //formula correcta angulo/360 * radioCuadro *PI
        return (angulo / 360) * Math.PI * radio * radio;

    }
}
