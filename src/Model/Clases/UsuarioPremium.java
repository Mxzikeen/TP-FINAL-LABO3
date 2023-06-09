package Model.Clases;

import Model.Interfaces.ComportamientoUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Stack;

public class UsuarioPremium  extends Usuario implements Serializable, ComportamientoUser {

    private String vencimientoDeSuscripcion;
    private String nickName;
    private Double saldo;
    private ArrayList<Juego> juegosComprados;
    private ArrayList<Mensaje> mensajes;
    private ArrayList<MovimientoEconomico> movimientosEnCuenta;

    public UsuarioPremium(String nombre, String apellido, String dni, String mail, String contrasena, String nickName, Double saldo, ArrayList<Juego> juegosComprados, ArrayList<Mensaje> mensajes, ArrayList<MovimientoEconomico> movimientosEnCuenta) {
        super(nombre, apellido, dni, mail, contrasena);
        this.vencimientoDeSuscripcion= LocalDate.now().plusDays(30).toString();
        this.nickName = nickName;
        this.saldo = saldo;
        this.juegosComprados = juegosComprados;
        this.mensajes = mensajes;
        this.movimientosEnCuenta = movimientosEnCuenta;
    }

    public String getVencimientoDeSuscripcion() {
        return vencimientoDeSuscripcion;
    }

    public String getNickName() {
        return nickName;
    }

    public Double getSaldo() {
        return saldo;
    }

    public ArrayList<Juego> getJuegosComprados() {
        return juegosComprados;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public ArrayList<MovimientoEconomico> getMovimientosEnCuenta() {
        return movimientosEnCuenta;
    }

    public void setVencimientoDeSuscripcion(String vencimientoDeSuscripcion) {
        this.vencimientoDeSuscripcion = vencimientoDeSuscripcion;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setJuegosComprados(ArrayList<Juego> juegosComprados) {
        this.juegosComprados = juegosComprados;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public void setMovimientosEnCuenta(ArrayList<MovimientoEconomico> movimientosEnCuenta) {
        this.movimientosEnCuenta = movimientosEnCuenta;
    }

    public void pagarSuscripcion(){
        LocalDate fecha=LocalDate.parse(this.vencimientoDeSuscripcion);
        fecha.plusDays(30);
        this.vencimientoDeSuscripcion=fecha.toString();
    }

    @Override
    public void comprar(Pedido nuevo) {
        for (Juego juego: nuevo.getJuegos()){
            this.juegosComprados.add(juego);
        }
    }
    @Override
    public Boolean jugar() {
        return true;
    }

    @Override
    public ArrayList<Juego> listarComprados() {
        return juegosComprados;
    }

    @Override
    public void CargarSaldo(Double aCargar) {
        this.saldo+=aCargar;
    }
}
