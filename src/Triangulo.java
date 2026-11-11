public class Triangulo extends Figura {
    // Atributos
    private double lado1;
    private double lado2;
    private double lado3;

    // Métodos
    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
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
        return lado1 > 0 && lado2 > 0 && lado3 > 0 &&
                lado1 < lado2 + lado3 &&
                lado2 < lado1 + lado3 &&
                lado3 < lado1 + lado2;
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
        this.lado1 = lado1;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // equals()
    public boolean equals(Triangulo triangulo) {
        return this.lado1 == triangulo.lado1 &&
                this.lado2 == triangulo.lado2 &&
                this.lado3 == triangulo.lado3;
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
