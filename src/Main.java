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

        System.out.println();

        Equilatero prueba = new Equilatero(5);
        prueba.setLado1(8);
        prueba.imprimirInformacion();

        System.out.println();

        Isosceles pruebaIsosceles = new Isosceles(5, 6);
        pruebaIsosceles.setLado1(8);
        pruebaIsosceles.imprimirInformacion();

        System.out.println();

        Escaleno pruebaEscaleno = new Escaleno(3, 4, 5);
        pruebaEscaleno.setLado1(6);
        pruebaEscaleno.imprimirInformacion();

        System.out.println();

        Escaleno pruebaInvalida = new Escaleno(3, 4, 5);

        try {
            pruebaInvalida.setLado1(9);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        pruebaInvalida.imprimirInformacion();


        System.out.println();

        System.out.println("Prueba de equals():");

        Circulo circulo2 = new Circulo(5);
        Circulo circulo3 = new Circulo(8);

        System.out.println("Círculos iguales: " + circulo1.equals(circulo2));
        System.out.println("Círculos diferentes: " + circulo1.equals(circulo3));

        System.out.println();

        System.out.println("Prueba de toString():");
        System.out.println(circulo1.toString());


        System.out.println();

        System.out.println("Prueba de equals() en las demás figuras:");

        System.out.println("Rectángulos iguales: " +
                rectangulo1.equals(new Rectangulo(5, 3)));

        System.out.println("Cuadrados iguales: " +
                cuadrado1.equals(new Cuadrado(5)));

        System.out.println("Rombos iguales: " +
                rombo1.equals(new Rombo(5, 8, 6)));

        System.out.println("Triángulos iguales: " +
                triangulo1.equals(new Triangulo(3, 4, 5)));

        System.out.println("Equiláteros iguales: " +
                equilatero1.equals(new Equilatero(8)));

        System.out.println("Isósceles iguales: " +
                isosceles1.equals(new Isosceles(5, 6)));

        System.out.println("Escalenos iguales: " +
                escaleno1.equals(new Escaleno(3, 4, 5)));


        System.out.println();

        System.out.println("Prueba de equals() entre clases diferentes:");

        Rectangulo rectanguloCuadrado = new Rectangulo(5, 5);

        System.out.println("Rectángulo comparado con cuadrado: " +
                rectanguloCuadrado.equals(cuadrado1));

        System.out.println("Cuadrado comparado con rectángulo: " +
                cuadrado1.equals(rectanguloCuadrado));


        System.out.println();

        System.out.println("Prueba de toString() en las demás figuras:");

        System.out.println("Rectángulo:");
        System.out.println(rectangulo1.toString());

        System.out.println("Cuadrado:");
        System.out.println(cuadrado1.toString());

        System.out.println("Rombo:");
        System.out.println(rombo1.toString());

        System.out.println("Triángulo:");
        System.out.println(triangulo1.toString());

        System.out.println(equilatero1.toString());

        System.out.println(isosceles1.toString());

        System.out.println(escaleno1.toString());

    }
}
