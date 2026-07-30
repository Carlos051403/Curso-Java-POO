package videojuegopokemon.logica;

public class Main {
    public static void main (String[] args){

        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        Pokemon[] equipoPokemon = {squirtle, charmander, bulbasaur, pikachu};

        for (Pokemon pokemon : equipoPokemon) {

            pokemon.atacarAranazo();
        }

    }
}
