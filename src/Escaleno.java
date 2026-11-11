public class Escaleno extends Triangulo {

    // Métodos
    // Constructor
    public Escaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);

        if (!esValido() || lado1 == lado2 ||
                lado1 == lado3 || lado2 == lado3) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Triángulo escaleno:");
        System.out.println("Lado 1: " + getLado1());
        System.out.println("Lado 2: " + getLado2());
        System.out.println("Lado 3: " + getLado3());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    // toString()
    @Override
    public String toString() {
        return "Triángulo escaleno:" +
                "\nLado 1: " + getLado1() +
                "\nLado 2: " + getLado2() +
                "\nLado 3: " + getLado3() +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() + "\n";
    }

    // Setters
    @Override
    public void setLado1(double lado1) {
        if (lado1 <= 0 || lado1 == getLado2() ||
                lado1 == getLado3() ||
                lado1 + getLado2() <= getLado3() ||
                lado1 + getLado3() <= getLado2() ||
                getLado2() + getLado3() <= lado1) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }

        super.setLado1(lado1);
    }

    @Override
    public void setLado2(double lado2) {
        if (lado2 <= 0 || lado2 == getLado1() ||
                lado2 == getLado3() ||
                getLado1() + lado2 <= getLado3() ||
                lado2 + getLado3() <= getLado1() ||
                getLado1() + getLado3() <= lado2) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }

        super.setLado2(lado2);
    }

    @Override
    public void setLado3(double lado3) {
        if (lado3 <= 0 || lado3 == getLado1() ||
                lado3 == getLado2() ||
                getLado1() + getLado2() <= lado3 ||
                getLado1() + lado3 <= getLado2() ||
                getLado2() + lado3 <= getLado1()) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }

        super.setLado3(lado3);
    }

}
