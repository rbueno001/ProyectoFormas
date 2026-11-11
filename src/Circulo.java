public class Circulo extends Figura {
    // Atributos
    private double radio;
    // Métodos
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Círculo:");
        System.out.println("Radio: " + radio);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    // Getters
    public double getRadio() {
        return radio;
    }

    // Setters
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // equals()
    public boolean equals(Circulo circulo) {
        return this.radio == circulo.radio;
    }

    // toString()
    @Override
    public String toString() {
        return "Radio: " + radio + "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() + "\n";
    }

}