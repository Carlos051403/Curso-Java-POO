package gestorrepositorio;

import java.util.Objects;

public class Repositorio {

    protected String nombre;
    protected String creador;
    protected  String visibilidad;
    protected int lineasDeCodigo;

    public Repositorio() {
    }

    public Repositorio(String nombre, String creador, String visibilidad, int lineasDeCodigo) {
        this.nombre = nombre;
        this.creador = creador;
        this.visibilidad = visibilidad;
        this.lineasDeCodigo = lineasDeCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    public int getLineasDeCodigo() {
        return lineasDeCodigo;
    }

    public void setLineasDeCodigo(int lineasDeCodigo) {
        this.lineasDeCodigo = lineasDeCodigo;
    }

    public double calcularImpacto() {
        return (this.lineasDeCodigo / 2.0);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Repositorio that = (Repositorio) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(creador, that.creador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, creador);
    }

    @Override
    public String toString() {
        return "Repositorio{" +
                "nombre='" + nombre + '\'' +
                ", creador='" + creador + '\'' +
                ", visibilidad='" + visibilidad + '\'' +
                ", lineasDeCodigo=" + lineasDeCodigo +
                '}';
    }
}
