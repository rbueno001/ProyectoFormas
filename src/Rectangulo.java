public class Rectangulo extends Figura {
    // Atributos
    private double base;
    private double altura;

    // Métodos
    // Constructor
    public Rectangulo(double base, double altura) {
        if (base <= 0 || !Double.isFinite(base)) {
            throw new IllegalArgumentException("La base debe ser mayor que cero.");
        }

        if (altura <= 0 || !Double.isFinite(altura)) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero.");
        }

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
        if (base <= 0 || !Double.isFinite(base)) {
            throw new IllegalArgumentException("La base debe ser mayor que cero.");
        }

        this.base = base;
    }

    public void setAltura(double altura) {
        if (altura <= 0 || !Double.isFinite(altura)) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero.");
        }

        this.altura = altura;
    }

    // equals()
    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }

        Rectangulo rectangulo = (Rectangulo) objeto;

        return Double.compare(this.base, rectangulo.base) == 0 &&
                Double.compare(this.altura, rectangulo.altura) == 0;
    }

    @Override
    public int hashCode() {
        int resultado = Double.hashCode(base);
        resultado = 31 * resultado + Double.hashCode(altura);
        return resultado;
    }

    // toString()
    @Override
    public String toString() {
        return "Base: " + base +
                "\nAltura: " + altura +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() + "\n";
    }
}
