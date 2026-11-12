public class Rombo extends Figura {
    // Atributos
    private double lado;
    private double diagonalMayor;
    private double diagonalMenor;

    // Métodos
    // Constructor
    public Rombo(double lado, double diagonalMayor, double diagonalMenor) {
        validarDimensiones(lado, diagonalMayor, diagonalMenor);

        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    private void validarDimensiones(double lado, double diagonalMayor, double diagonalMenor) {
        if (!Double.isFinite(lado) ||
                !Double.isFinite(diagonalMayor) ||
                !Double.isFinite(diagonalMenor) ||
                lado <= 0 ||
                diagonalMayor <= 0 ||
                diagonalMenor <= 0 ||
                diagonalMayor < diagonalMenor ||
                Math.abs(lado - Math.hypot(diagonalMayor / 2, diagonalMenor / 2)) > 0.000001) {
            throw new IllegalArgumentException("Las dimensiones del rombo no son válidas.");
        }
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
        validarDimensiones(lado, diagonalMayor, diagonalMenor);
        this.lado = lado;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        validarDimensiones(lado, diagonalMayor, diagonalMenor);
        this.diagonalMayor = diagonalMayor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        validarDimensiones(lado, diagonalMayor, diagonalMenor);
        this.diagonalMenor = diagonalMenor;
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

        Rombo rombo = (Rombo) objeto;

        return Double.compare(this.lado, rombo.lado) == 0 &&
                Double.compare(this.diagonalMayor, rombo.diagonalMayor) == 0 &&
                Double.compare(this.diagonalMenor, rombo.diagonalMenor) == 0;
    }

    @Override
    public int hashCode() {
        int resultado = Double.hashCode(lado);
        resultado = 31 * resultado + Double.hashCode(diagonalMayor);
        resultado = 31 * resultado + Double.hashCode(diagonalMenor);
        return resultado;
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
