package concesionaria;

public class Vehiculo {

    int matricula;
    String marca;
    String modelo;
    int añoFabricacion;
    Double precioBase;

    public Vehiculo() {
    }

    public Vehiculo(int matricula, String marca, String modelo, int añoFabricacion,
                    Double precioBase) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.precioBase = precioBase;
    }

    public void mostrarDatos(){
        System.out.println("Datos Generales: ");
        System.out.println("Matricula: " + matricula + " marca: " + marca +
                " modelo: " + modelo + " " + añoFabricacion +
                " Precio: " + precioBase + " €");
    }
}
