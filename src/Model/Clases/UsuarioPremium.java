package Model.Clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class UsuarioPremium  extends Usuario implements Serializable {

    private String vencimientoDeSuscripcion;
    private String nickName;
    private Double saldo;
    private ArrayList<Juego> juegosComprados;
    //private ArrayList<Mensaje> mensajes;
    //private ArrayList<Movimientos> movimientosEnCuenta;


    public UsuarioPremium(String nombre, String apellido, String dni, String mail, String contrasena, String nickName, String paisOrigen) {
        super(nombre, apellido, dni, mail, contrasena, nickName, paisOrigen);
    }

    public String getVencimientoDeSuscripcion() {
        return vencimientoDeSuscripcion;
    }

    @Override
    public String getNickName() {
        return nickName;
    }

    public Double getSaldo() {
        return saldo;
    }

    public ArrayList<Juego> getJuegosComprados() {
        return juegosComprados;
    }

    public void setVencimientoDeSuscripcion(String vencimientoDeSuscripcion) {
        this.vencimientoDeSuscripcion = vencimientoDeSuscripcion;
    }

    @Override
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setJuegosComprados(ArrayList<Juego> juegosComprados) {
        this.juegosComprados = juegosComprados;
    }
}
