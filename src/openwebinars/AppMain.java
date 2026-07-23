package openwebinars;

public class AppMain {
    public static void main (String[] args){

        /*Coche coche = new Coche("Ford", "Focus", 2020);
        coche.arrancar();

        //Tambien se puede instanciar un objeto con la palabra var en vez de Coche
        var coche2 = new Coche("Seat", "Ibiza", 2022);*/

        Coche coche3 = new Coche ("Ford", "Focus", 2022, 0, 0);
        coche3.arrancar();

        Coche coche4 = new Coche("Renault", "Megane");
        coche4.arrancar();
        coche4.repostar(20);
        coche4.arrancar();
        coche4.viajar(100);

        System.out.println(coche4);
    }
}
