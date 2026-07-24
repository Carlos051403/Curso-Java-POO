package gestorrepositorio;

public class Backend extends Repositorio {

    private String lenguajeBase;

    public Backend(String nombre, String creador, String visibilidad,
                   int lineasDeCodigo, String lenguajeBase) {
        super(nombre, creador, visibilidad, lineasDeCodigo);
        this.lenguajeBase = lenguajeBase;
    }

    public String getLenguajeBase() {
        return lenguajeBase;
    }

    public void setLenguajeBase(String lenguajeBase) {
        this.lenguajeBase = lenguajeBase;
    }

    @Override
    public double calcularImpacto() {
        return super.calcularImpacto() + 100;
    }
}
