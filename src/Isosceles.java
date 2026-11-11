public class Isosceles extends Triangulo {

    // Métodos
    // Constructor
    public Isosceles(double ladoIgual, double base) {
        super(ladoIgual, ladoIgual, base);

        if (!esValido() || ladoIgual == base) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Triángulo isósceles:");
        System.out.println("Lados iguales: " + getLado1());
        System.out.println("Base: " + getLado3());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    // Setters
    @Override
    public void setLado1(double lado) {
        if (lado <= 0 || lado == getLado3() ||
                lado + lado <= getLado3()) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }

        super.setLado1(lado);
        super.setLado2(lado);
    }

    @Override
    public void setLado2(double lado) {
        setLado1(lado);
    }

    @Override
    public void setLado3(double base) {
        if (base <= 0 || base == getLado1() ||
                base >= getLado1() + getLado2()) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }

        super.setLado3(base);
    }

    // toString()
    @Override
    public String toString() {
        return "Triángulo isósceles:" +
                "\nLados iguales: " + getLado1() +
                "\nBase: " + getLado3() +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() + "\n";
    }
}
