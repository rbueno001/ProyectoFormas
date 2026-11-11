public class Cuadrado extends Rectangulo {
    // Métodos
    // Constructor
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Cuadrado:");
        System.out.println("Lado: " + getBase());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    // toString()
    @Override
    public String toString() {
        return "Lado: " + getBase() +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() + "\n";
    }

    // Setters
    @Override
    public void setBase(double lado) {
        super.setBase(lado);
        super.setAltura(lado);
    }

    @Override
    public void setAltura(double lado) {
        super.setBase(lado);
        super.setAltura(lado);
    }

}
