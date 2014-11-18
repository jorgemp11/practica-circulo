package practicacirculo;

public class Main {

    public static void main(String[] args) {

        Circulo c1 = new Circulo(10.0, 90.0);
      
        System.out.println("CIRCULO RADIO 10");

        System.out.println("Area: " + c1.area());

        System.out.println("Diámetro: " + c1.diametro());

        System.out.println("Perímetro: " + c1.perimetro());

        System.out.println("AreaSector: " + c1.areaSector());

        Circulo c2 = new Circulo(20.0, 90.0);

        System.out.println("\nCIRCULO RADIO 20");
        
        System.out.println("Area: " + c2.area());

        System.out.println("Diámetro: " + c2.diametro());

        System.out.println("Perímetro: " + c2.perimetro());

        System.out.println("AreaSector: " + c2.areaSector());

        Cuadrado c3 = new Cuadrado(15);

        System.out.println("\nCUADRADO LADO 15");
        
        System.out.println("Perímetro: " + c3.perimetro());

        System.out.println("Area: " + c3.area());

        System.out.println("Número de lados: " + c3.lado());
    }
}