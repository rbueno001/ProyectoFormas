public class Equilatero extends Triangulo {

    // Métodos
    // Constructor
    public Equilatero(double lado) {
        super(lado, lado, lado);
        if (!esValido()) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }
    }


    @Override
    public void imprimirInformacion() {
        System.out.println("Triángulo equilátero:");
        System.out.println("Lado: " + getLado1());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    // toString()
    @Override
    public String toString() {
        return "Triángulo equilátero:" +
                "\nLado: " + getLado1() +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() + "\n";
    }

    // Setters

    @Override
    public void setLado1(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }

        super.setLado1(lado);
        super.setLado2(lado);
        super.setLado3(lado);
    }


    @Override
    public void setLado2(double lado) {
        setLado1(lado);
    }

    @Override
    public void setLado3(double lado) {
        setLado1(lado);
    }

}
