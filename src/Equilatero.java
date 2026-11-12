public class Equilatero extends Triangulo {

    // Métodos
    // Constructor
    public Equilatero(double lado) {
        super(lado, lado, lado);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Triángulo equilátero:");
        System.out.println("Lado: " + getLado1());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    // Setters
    @Override
    public void setLado1(double lado) {
        actualizarLados(lado, lado, lado);
    }

    @Override
    public void setLado2(double lado) {
        actualizarLados(lado, lado, lado);
    }

    @Override
    public void setLado3(double lado) {
        actualizarLados(lado, lado, lado);
    }

    // toString()
    @Override
    public String toString() {
        return "Triángulo equilátero:" +
                "\nLado: " + getLado1() +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() + "\n";
    }
}
