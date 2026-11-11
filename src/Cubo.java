public class Cubo extends Solido {

    // Atributos
    private double lado;

    // Métodos
    // Constructor
    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolumen() {
        return lado * lado * lado;
    }

    @Override
    public double calcularArea() {
        return 6 * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 12 * lado;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Cubo:");
        System.out.println("Lado: " + lado);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }

    // Getters
    public double getLado() {
        return lado;
    }

    // Setters
    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado debe ser mayor que cero.");
        }

        this.lado = lado;
    }

    // toString()
    @Override
    public String toString() {
        return "Cubo:" +
                "\nLado: " + lado +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() +
                "\nVolumen: " + calcularVolumen() + "\n";
    }



}
