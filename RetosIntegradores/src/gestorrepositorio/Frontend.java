package gestorrepositorio;

public class Frontend extends Repositorio{

    private boolean usaFramework;

    public Frontend(String nombre, String creador, String visibilidad,
                    int lineasDeCodigo, boolean usaFramework) {
        super(nombre, creador, visibilidad, lineasDeCodigo);
        this.usaFramework = usaFramework;
    }

    public boolean isUsaFramework() {
        return usaFramework;
    }

    public void setUsaFramework(boolean usaFramework) {
        this.usaFramework = usaFramework;
    }

    @Override
    public double calcularImpacto(){

        Double calculoTotal = super.calcularImpacto();
        if (this.usaFramework == true){
            calculoTotal += 50;
            System.out.println("El programa usa Framework");
        }
        else {
            System.out.println("El programa No usa Framework");
        }
        return calculoTotal;
    }
}
