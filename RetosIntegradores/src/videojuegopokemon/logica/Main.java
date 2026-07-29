package videojuegopokemon.logica;

public class Main {
    public static void main (String[] args){

        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAranazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAranazo();
        charmander.atacarLanzallamas();
        bulbasaur.atacarAranazo();
        bulbasaur.atacarDrenaje();
        pikachu.atacarAranazo();
        pikachu.atacarImpactrueno();

    }
}
