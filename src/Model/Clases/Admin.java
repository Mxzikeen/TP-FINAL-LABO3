package Model.Clases;

import java.io.Serializable;
import java.time.LocalDate;

public class Admin extends Usuario implements Serializable {
    private LocalDate fechaDeInicio;
    private Double sueldo;

    public Admin(String nombre, String apellido, String dni, String mail, String contrasena, String nickName, String paisOrigen, LocalDate fechaDeInicio, Double sueldo) {
        super(nombre, apellido, dni, mail,contrasena);
        this.fechaDeInicio = fechaDeInicio;
        this.sueldo = sueldo;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "fechaDeInicio=" + fechaDeInicio +
                ", sueldo=" + sueldo +
                '}';
    }

}
