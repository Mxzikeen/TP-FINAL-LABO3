package Model;

import java.util.ArrayList;

public class UserBasico extends Usuario /*implements ComportamientoUser*/{

    private String nickName;

 //   private ArrayList<Juego> comprados;

    private Integer saldo;

//    private ArrayList<Mensaje> mensajes;// de momento no lo hagamos ya que no sabemos si va
                                        // hacer clase mensaje{Texto, Remitente, Destinatario, fecha}
    private Integer cantDePartidas = 0;

    public UserBasico(String nombre, String apellido, String dni, String mail,  String paisOrigen, String nickName) {
        super(nombre, apellido, dni, mail, paisOrigen);
        this.nickName = nickName;
   //     comprados = new ArrayList<Juego>();
    }

    public void jugar(){
        cantDePartidas++;
    }

    /*
    sobreescribir modificarUser de usuario y metodos de la interfaz

    getters y setters

            toString

     */
}
