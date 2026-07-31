package openwebinars.ejercicios.diseniodeclases;

public class Muestra {

    public static final int DEFAULT_SIZE = 10;

    private int[] numeros;
    private int cantidadNumeros;

    //Sobrecarga de constructores genero 3 diferentes bajo el mismo nombre
    // 1. En este se crea por defecto de 10
    public Muestra() {
        numeros = new int [DEFAULT_SIZE];
        cantidadNumeros = 0;
    }

    //2. Le asigno el tamano al array
    public Muestra (int tam) {
        numeros = new int[tam];
        cantidadNumeros = 0;
    }

    //3. clone para clonar un arrays que ya existe
    public Muestra (int[] array) {
        numeros = array.clone();
        cantidadNumeros = numeros.length;
    }

    public void agregarNumero (int n) {
        numeros[cantidadNumeros] = n;
        cantidadNumeros++;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int getCantidadNumeros() {
        return cantidadNumeros;
    }
}
