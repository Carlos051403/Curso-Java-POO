package videojuegopokemon.logica;

public abstract class Pokemon {

    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporadaQueAparece;
    protected String tipo;

    protected abstract void atacarPlacaje();
    protected abstract void atacarAranazo();
    protected abstract void atacarMordisco();

}
