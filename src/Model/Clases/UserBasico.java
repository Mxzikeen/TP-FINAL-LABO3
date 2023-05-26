package Model.Clases;

import Model.Clases.Usuario;

import java.util.ArrayList;

public class UserBasico extends Usuario /*implements ComportamientoUser*/{
   private ArrayList<Juego> comprados;

    private Integer saldo;

//    private ArrayList<Mensaje> mensajes;// de momento no lo hagamos ya que no sabemos si va
                                        // hacer clase mensaje{Texto, Remitente, Destinatario, fecha}
    private Integer cantDePartidas = 0;

    public UserBasico(String nombre, String apellido, String dni, String mail,String contrasena, String nickName, String paisOrigen) {
        super(nombre, apellido, dni, mail, contrasena, nickName,paisOrigen);
        comprados = new ArrayList<Juego>();
    }

    public void jugar(){
        cantDePartidas++;
    }



    @Override
    public void darseDeBaja() {
        super.darseDeBaja();
    }

    public ArrayList<Juego> getComprados() {
        return comprados;
    }

    public void setComprados(ArrayList<Juego> comprados) {
        this.comprados = comprados;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getCantDePartidas() {
        return cantDePartidas;
    }

    public void setCantDePartidas(Integer cantDePartidas) {
        this.cantDePartidas = cantDePartidas;
    }
/*
    sobreescribir modificarUser de usuario y metodos de la interfaz

    getters y setters

            toString

     */
}
