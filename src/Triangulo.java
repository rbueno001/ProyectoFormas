public class Triangulo extends Figura {

    // Atributos
    private double lado1;
    private double lado2;
    private double lado3;

    // Métodos
    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        actualizarLados(lado1, lado2, lado3);
    }

    private boolean validarLados(double lado1, double lado2, double lado3) {
        return Double.isFinite(lado1) &&
                Double.isFinite(lado2) &&
                Double.isFinite(lado3) &&
                lado1 > 0 &&
                lado2 > 0 &&
                lado3 > 0 &&
                lado1 < lado2 + lado3 &&
                lado2 < lado1 + lado3 &&
                lado3 < lado1 + lado2;
    }

    protected void actualizarLados(double lado1, double lado2, double lado3) {
        if (!validarLados(lado1, lado2, lado3)) {
            throw new IllegalArgumentException("Esto no es un triángulo válido, inténtalo de nuevo.");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2;

        return Math.sqrt(semiperimetro *
                (semiperimetro - lado1) *
                (semiperimetro - lado2) *
                (semiperimetro - lado3));
    }

    public boolean esValido() {
        return validarLados(lado1, lado2, lado3);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Triángulo:");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    // Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    // Setters
    public void setLado1(double lado1) {
        actualizarLados(lado1, lado2, lado3);
    }

    public void setLado2(double lado2) {
        actualizarLados(lado1, lado2, lado3);
    }

    public void setLado3(double lado3) {
        actualizarLados(lado1, lado2, lado3);
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

        Triangulo triangulo = (Triangulo) objeto;

        return Double.compare(this.lado1, triangulo.lado1) == 0 &&
                Double.compare(this.lado2, triangulo.lado2) == 0 &&
                Double.compare(this.lado3, triangulo.lado3) == 0;
    }

    @Override
    public int hashCode() {
        int resultado = Double.hashCode(lado1);
        resultado = 31 * resultado + Double.hashCode(lado2);
        resultado = 31 * resultado + Double.hashCode(lado3);
        return resultado;
    }

    // toString()
    @Override
    public String toString() {
        return "Lado 1: " + lado1 +
                "\nLado 2: " + lado2 +
                "\nLado 3: " + lado3 +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() + "\n";
    }
}
