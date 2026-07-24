package gestorrepositorio;

public class Main {
    public static void main (String[] args) {

        Repositorio[] repositorios = new Repositorio [4];
        repositorios[0] = new Backend("repoBackend", "Carlos", "Private", 50, "Java");
        repositorios[1] = new Backend("Backend", "Eduardo", "publico", 150, "C++");
        repositorios[2] = new Frontend("Frontend", "Luisa", "private", 125, true);
        repositorios[3] = new Frontend("RepositorioFrontend", "Fran", "Publico", 180, false);

        for (int i = 0; i < repositorios.length; i++) {

            Repositorio repoActual = repositorios[i];

            System.out.println("ficha de Datos en el índice " + i + " : " + repoActual);
            System.out.println("Impacto calculado: " + repoActual.calcularImpacto());
            System.out.println("---------------------------------------------------");
        }

        Repositorio repoPrueba = new Backend("Backend", "Eduardo", "publico", 150, "C++");

        for (int i = 0; i < repositorios.length; i++) {

            if(repoPrueba.equals(repositorios[i])){
                System.out.println("¡Alerta! Repositorio duplicado encontrado en la posición: " + i);
            }
        }

    }
}
