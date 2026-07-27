package motordefacturacion;

public class Main {
    public static void main (String[] args){

        Plan[] planes = new Plan[3];
        planes[0] = new PlanEstandar("carlos5@hotmail.com", 12.50);
        planes[1] = new PlanFamiliar("familiareyes@hotmail.com", 18.50, 4);
        planes[2] = new PlanFamiliar("pareja@gmail.com", 18.50, 2);

        for(int i = 0; i < planes.length; i++){

            Plan planActual = planes[i];

            System.out.println("Recibo -> Cliente: " + planActual.getCorreo() +
                    " | Total a facturar: " + planActual.calculoDeCosto());
        }

    }
}
