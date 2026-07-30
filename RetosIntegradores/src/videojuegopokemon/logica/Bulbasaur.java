package videojuegopokemon.logica;

import videojuegopokemon.interfaz.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
        this.nombre = "Bulbasaur";
        this.numPokedex = 1;
        this.peso = 6.9;
        this.tipo = "Planta";
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
        System.out.println("Soy, " + this.nombre + " Este es mi ataque mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy, "+ this.nombre + " Este es mi ataque Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy, " + this.nombre + " Este es mi ataque Latigo Cepa");
    }
}
