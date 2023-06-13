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

    public boolean isActivo() {
        return activo;
    }



    /*
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
                }
                if (comprobadoCant && comprobadoMay && comprobadoNum) {
                    comprobado = true;
                    contrasena = contra;
                }

                if (!comprobadoCant) {
                    //Joption
                    System.out.println("La contraseña requiere al menos 8 caracteres");
                }
                if (!comprobadoMay) {
                    //Joption
                    System.out.print("La contraseña requiere al menos 1 letra mayuscula");
                }
                if (!comprobadoNum) {
                    //Joption
                    System.out.print("La contraseña requiere al menos 1 numero");
                }
                comprobadoNum = false;
                comprobadoMay = false;
                comprobadoCant = false;

            }

            return comprobado;
        }
    */
    public void darseDeBaja() {
        activo = false;
    }

}


