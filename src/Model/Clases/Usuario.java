package Model.Clases;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nombre;
    private String apellido;
    private String dni;
    private String mail;
    private String contrasena;
    private static Integer cantUsuarios = 0;
    private Integer id;
    private boolean activo;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni, String mail, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.contrasena = contrasena;
        cantUsuarios++;
        this.id = cantUsuarios;
        activo = true;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", mail='" + mail + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", id=" + id +
                ", activo=" + activo +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void darseDeBaja() {
        activo = false;
    }

}


