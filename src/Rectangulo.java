public class Rectangulo extends Figura {
    // Atributos
    private double base;
    private double altura;

    // Métodos
    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Rectángulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    // Getters
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    // Setters
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // equals()
    public boolean equals(Rectangulo rectangulo) {
        return this.base == rectangulo.base &&
                this.altura == rectangulo.altura;
    }

    // toString()
    @Override
    public String toString() {
        return "Base: " + base + "\nAltura: " + altura +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() + "\n";
    }

}