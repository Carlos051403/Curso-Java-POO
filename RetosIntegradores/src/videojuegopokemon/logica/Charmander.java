package videojuegopokemon.logica;

import videojuegopokemon.interfaz.IFuego;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
        this.nombre = "Charmander";
        this.numPokedex = 4;
        this.peso = 8.5;
        this.tipo = "Fuego";
        this.temporadaQueAparece = 1;
        this.sexo = "Macho";
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Puño Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Asacuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Lanza Llamas");
    }
}
