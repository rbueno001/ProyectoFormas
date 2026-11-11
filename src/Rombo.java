public class Rombo extends Figura {
    // Atributos
    private double lado;
    private double diagonalMayor;
    private double diagonalMenor;

    // Métodos
    // Constructor
    public Rombo(double lado, double diagonalMayor, double diagonalMenor) {
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Rombo:");
        System.out.println("Lado: " + lado);
        System.out.println("Diagonal mayor: " + diagonalMayor);
        System.out.println("Diagonal menor: " + diagonalMenor);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    // Getters
    public double getLado() {
        return lado;
    }
    public double getDiagonalMayor() {
        return diagonalMayor;
    }
    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    // Setters
    public void setLado(double lado) {
        this.lado = lado;
    }
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    // equals()
    public boolean equals(Rombo rombo) {
        return this.lado == rombo.lado &&
                this.diagonalMayor == rombo.diagonalMayor &&
                this.diagonalMenor == rombo.diagonalMenor;
    }

    // toString()
    @Override
    public String toString() {
        return "Lado: " + lado +
                "\nDiagonal mayor: " + diagonalMayor +
                "\nDiagonal menor: " + diagonalMenor +
                "\nPerímetro: " + calcularPerimetro() +
                "\nÁrea: " + calcularArea() + "\n";
    }

}
