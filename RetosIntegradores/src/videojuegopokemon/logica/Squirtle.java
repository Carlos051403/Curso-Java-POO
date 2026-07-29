package videojuegopokemon.logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle, Este es mi ataque Placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Soy Squirtle, Este es mi ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle, Este es mi ataque Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle, Este es mi ataque Hidro-Bomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle, Este es mi ataque Pistola De Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle, Este es mi ataque Burbujas");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle, Este es mi ataque Hidro-Pulso");
    }
}
