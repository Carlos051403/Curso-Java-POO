package claaabstracta;

public class Cuadraro extends Figura{

    private double lado;

    public Cuadraro() {
    }

    public Cuadraro(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
