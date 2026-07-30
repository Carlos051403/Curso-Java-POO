package videojuegopokemon.logica;

import videojuegopokemon.interfaz.IElectrico;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
        this.nombre = "Pikachu";
        this.peso = 6.0;
        this.numPokedex = 25;
        this.tipo = "Electrico";
        this.temporadaQueAparece = 1;
        this.sexo = "Macho";
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy, "+ this.nombre + " Este es mi ataque Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy, "+ this.nombre + " Este es mi ataque ImpacTrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Puño de Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque RayoCarga");
    }
}
