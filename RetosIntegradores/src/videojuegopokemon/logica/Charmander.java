package videojuegopokemon.logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander, Este es mi ataque placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Soy Charmander, Este es mi ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander, Este es mi ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander, Este es mi ataque Puño Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander, Este es mi ataque Asacuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander, Este es mi ataque Lanza Llamas");
    }
}
