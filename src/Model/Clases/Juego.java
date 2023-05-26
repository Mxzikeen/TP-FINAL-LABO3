package Model.Clases;

import java.util.Objects;

public class Juego {
    private String nombre;
    private String categoria;
    private Double precio;
    private Integer valoracion;
    private Integer cantValoraciones;
    private Boolean activo;

    public Juego() {
    }

    public Juego(String nombre, String categoria, Double precio, Integer valoracion, Integer cantValoraciones, Boolean activo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.valoracion = valoracion;
        this.cantValoraciones = cantValoraciones;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getValoracion() {
        return valoracion;
    }

    public void setValoracion(Integer valoracion) {
        this.valoracion = valoracion;
    }

    public Integer getCantValoraciones() {
        return cantValoraciones;
    }

    public void setCantValoraciones(Integer cantValoraciones) {
        this.cantValoraciones = cantValoraciones;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", valoracion=" + valoracion +
                ", cantValoraciones=" + cantValoraciones +
                ", activo=" + activo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Juego juego = (Juego) o;
        return Objects.equals(nombre, juego.nombre) && Objects.equals(categoria, juego.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, categoria);
    }
}
