package claaabstracta;

public abstract class Figura {

    protected double x; // pos en x
    protected  double y; // pos en y

    /*En una clase abstracta pueden existir constructores que solo
     seran utilizados por sus clases hijas, ya que una clase abstracta no se
     pueden crear objetos atraves de ellas si no que se utilizan solo como plantillas
     para otras clases*/

    // se coloca como protected su MODIFICADOR DE ACCESO para que sus hijas puedan verlo
    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /* aca no se abre llaves en los metodos abstractos para que
            sus hijas la declaren como quieran  es decir hagan sus propias implementaciones*/
    public abstract double calcularArea();
}
