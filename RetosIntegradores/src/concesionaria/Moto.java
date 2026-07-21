package concesionaria;

public class Moto extends Vehiculo {

    int cilindrada;
    boolean cascoIncluido;

    public Moto(int matricula, String marca, String modelo, int añoFabricacion,
                Double precioBase, int cilindrada, boolean cascoIncluido) {
        super(matricula, marca, modelo, añoFabricacion, precioBase);
        this.cilindrada = cilindrada;
        this.cascoIncluido = cascoIncluido;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isCascoIncluido() {
        return cascoIncluido;
    }

    public void setCascoIncluido(boolean cascoIncluido) {
        this.cascoIncluido = cascoIncluido;
    }

    public void acelerar(){
        System.out.println("Acelerando moto de " + this.cilindrada + "cc");
    }
}
