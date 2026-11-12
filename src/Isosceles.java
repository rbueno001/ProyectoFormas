public class Isosceles extends Triangulo {

    // Métodos
    // Constructor
    public Isosceles(double ladoIgual, double base) {
        super(ladoIgual, ladoIgual, base);

        if (ladoIgual == base) {
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
        if (lado == getLado3()) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }

        actualizarLados(lado, lado, getLado3());
    }

    @Override
    public void setLado2(double lado) {
        setLado1(lado);
    }

    @Override
    public void setLado3(double base) {
        if (base == getLado1()) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }

        actualizarLados(getLado1(), getLado2(), base);
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
