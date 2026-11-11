public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(5);
        Rectangulo rectangulo1 = new Rectangulo(5, 3);
        Cuadrado cuadrado1 = new Cuadrado(5);
        Rombo rombo1 = new Rombo(5, 8, 6);
        Triangulo triangulo1 = new Triangulo(3, 4, 5);
        Equilatero equilatero1 = new Equilatero(8);
        Isosceles isosceles1 = new Isosceles(5, 6);
        Escaleno escaleno1 = new Escaleno(3, 4, 5);

        circulo1.imprimirInformacion();

        System.out.println();
        rectangulo1.imprimirInformacion();

        System.out.println();
        cuadrado1.imprimirInformacion();

        System.out.println();
        rombo1.imprimirInformacion();

        System.out.println();
        triangulo1.imprimirInformacion();

        System.out.println();
        equilatero1.imprimirInformacion();

        equilatero1.setLado2(8);

        System.out.println();
        equilatero1.imprimirInformacion();

        System.out.println();
        isosceles1.imprimirInformacion();

        System.out.println();

        try {
            Isosceles isosceles2 = new Isosceles(5, 10);
            isosceles2.imprimirInformacion();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        escaleno1.imprimirInformacion();

        System.out.println();

        try {
            Escaleno escaleno2 = new Escaleno(5, 5, 6);
            escaleno2.imprimirInformacion();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
