package Model;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public abstract class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private String mail;
    private String contrasena;
    private String paisOrigen;
    private static Integer cantUsuarios = 0;
    private Integer id;
    private boolean activo;

    public Usuario(String nombre, String apellido, String dni, String mail, String paisOrigen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.paisOrigen = paisOrigen.toLowerCase(Locale.ROOT);

        cantUsuarios++;
        this.id = cantUsuarios;
        activo = false;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", mail='" + mail + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", id=" + id +
                '}';
    }

    public void darseDeBaja(){
        activo = false;
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

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public boolean setPassword() {
        boolean comprobado = false;
        boolean comprobadoNum = false;
        boolean comprobadoCant = false;
        boolean comprobadoMay = false;

        Scanner in = new Scanner(System.in);
        String contra = "";

        System.out.println("Introducir una contraseña con almenos 8 caracteres \nAl menos uno debe ser un numero y una letra mayuscula");

        while (!comprobado) {
            contra = in.nextLine();
            for (int i = 0; i < contra.length(); i++) {
                if (contra.charAt(i) >= 48 && contra.charAt(i) <= 57) {
                    comprobadoNum = true;
                }

                if (contra.charAt(i) >= 65 && contra.charAt(i) <= 90) {
                    comprobadoMay = true;
                }
            }

            if (contra.length() >= 8) {
                comprobadoCant = true;
            } else {
                comprobadoCant = false;
            }
            if (comprobadoCant && comprobadoMay && comprobadoNum) {
                comprobado = true;
                contrasena = contra;
            }

            if (!comprobadoCant) {
                System.out.println("La contraseña requiere al menos 8 caracteres");
            }
            if (!comprobadoMay) {
                System.out.print("La contraseña requiere al menos 1 letra mayuscula");
            }
            if (!comprobadoNum) {
                System.out.print("La contraseña requiere al menos 1 numero");
            }
        }

        return  comprobado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return activo == usuario.activo && Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido) && Objects.equals(dni, usuario.dni) && Objects.equals(mail, usuario.mail) && Objects.equals(contrasena, usuario.contrasena) && Objects.equals(paisOrigen, usuario.paisOrigen) && Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, dni, mail, contrasena, paisOrigen, id, activo);
    }

    /*
    Metodos:

    ModificarUser ----> en la clase contenedora

     */
}
