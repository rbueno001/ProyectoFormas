public class Cubo extends Solido {
    // Atributos
    private Cuadrado cuadrado;

    // Métodos
    // Constructor
    public Cubo(double lado) {
        this.cuadrado = new Cuadrado(lado);
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(cuadrado.getBase(), 3);
    }

    @Override
    public double calcularArea() {
        return 6 * cuadrado.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        return 12 * cuadrado.getBase();
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Cubo:");
        System.out.println("Lado: " + cuadrado.getBase());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }

    // Getters
    public double getLado() {
        return cuadrado.getBase();
    }

    // Setters
    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado debe ser mayor que cero.");
        }

        cuadrado.setBase(lado);
    }

    // toString()
    @Override
    public String toString() {
        return "Cubo:" +
                "\nLado: " + cuadrado.getBase() +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() +
                "\nVolumen: " + calcularVolumen() + "\n";
    }
}
