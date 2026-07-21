package concesionaria;

public class Auto extends Vehiculo{

    int cantidadPuertas;
    String tipoCombustible;

    public Auto(int matricula, String marca, String modelo, int añoFabricacion, Double precioBase, int cantidadPuertas, String tipoCombustible) {
        super(matricula, marca, modelo, añoFabricacion, precioBase);
        this.cantidadPuertas = cantidadPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public void encenderMotor(boolean tieneCombustible) {

        if (tieneCombustible == true) {
            System.out.println("Encendiendo Auto de " + tipoCombustible);
        } else {
            System.out.println("No enciende, Auto sin gasolina");
        }

    }
}
