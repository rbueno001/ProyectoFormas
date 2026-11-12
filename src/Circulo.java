public class Circulo extends Figura {
    // Atributos
    private double radio;

    // Métodos
    // Constructor
    public Circulo(double radio) {
        setRadio(radio);
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
        if (radio <= 0 || !Double.isFinite(radio)) {
            throw new IllegalArgumentException("El radio debe ser mayor que cero.");
        }

        this.radio = radio;
    }

    // equals()
    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (!(objeto instanceof Circulo)) {
            return false;
        }

        Circulo circulo = (Circulo) objeto;
        return Double.compare(this.radio, circulo.radio) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radio);
    }

    // toString()
    @Override
    public String toString() {
        return "Radio: " + radio +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() + "\n";
    }
}
