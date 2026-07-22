package ecommerce;

public class Main {
    public static void main (String[] args){

        Envio vector [] = new Envio[3];
        vector[0] = new Envio("Se0", 12.00, "Transito");
        vector[1] = new EnvioEstandar("Se1", 3.80, "Preparando");
        vector[2] = new EnvioExpress("Se2", 5.40, "Enviado", true);

    for (int i = 0; i < vector.length; i++){

        // 1. Agarramos el paquete que ya existe en el vector y le pedimos su costo
        Double precioFinal = vector[i].calcularCosto();

        // 2. Imprimimos el resultado para verlo en la consola
        System.out.println("El paquete en la posición " + i + " tiene un costo de: $" + precioFinal);
    }

    }
}
