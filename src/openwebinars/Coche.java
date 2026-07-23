package openwebinars;

import java.util.Objects;

public class Coche {

    private String marca;
    private String modelo;
    private int año;
    private double velocidadActual;
    private double litrosEnDeposito;

    //Constructor Vacio
    public Coche(){

    }

    //Esto se llama constructor amplio o con parametros
    public Coche(String marca, String modelo, int año, double velocidadActual, double litrosEnDeposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadActual = velocidadActual;
        this.litrosEnDeposito = litrosEnDeposito;
    }

    //Constructores que se usan entre ellos
    public Coche(String marca, String modelo){
        this(marca, modelo, 2020,0,0);
    }

    public void arrancar(){

        if (this.litrosEnDeposito > 0)
            System.out.println("El coche %s %s %d ha arrancado".formatted(marca, modelo, año));
        else
            System.out.println("El coche no puede arrancar porque tiene el deposito vacío");
    }

    // Incrementaremos el déposito del coche con el número de litros indicado
    public double repostar (double cantidad){
        this.litrosEnDeposito += cantidad;
        return  litrosEnDeposito;
    }

    public double acelerar (double incrementoVelocidad){
        this.velocidadActual += incrementoVelocidad;
        return velocidadActual;
    }

    public double viajar (double kilometros) {

        //Comprobammos que el coche puede hacer el viaje
        if (kilometros * 0.07 <= litrosEnDeposito) {
            double tiempoEnHoras = kilometros / velocidadActual;
            double tiempoEnSegundo = tiempoEnHoras * 60 * 60;
            this.litrosEnDeposito -= kilometros * 0.07;
            System.out.println("Tras el viaje, el depósito ha quedado con %.2f litros"
                    .formatted(litrosEnDeposito));
        } else {
            System.out.println("Para poder hacer ese viaje debes repostar");
            return 0;
        }
        return kilometros;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return año == coche.año && Double.compare(velocidadActual, coche.velocidadActual) == 0 && Double.compare(litrosEnDeposito, coche.litrosEnDeposito) == 0 && Objects.equals(marca, coche.marca) && Objects.equals(modelo, coche.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, año, velocidadActual, litrosEnDeposito);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", velocidadActual=" + velocidadActual +
                ", litrosEnDeposito=" + litrosEnDeposito +
                '}';
    }
}
