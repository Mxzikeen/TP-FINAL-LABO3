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
    private Stack<MovimientoEconomico> movimientosEnCuenta;

/*
    public UsuarioPremium(String nombre, String apellido, String dni, String mail, String contrasena, String nickName, String paisOrigen) {
        super(nombre, apellido, dni, mail, contrasena, nickName, paisOrigen);
        this.vencimientoDeSuscripcion= LocalDate.now().plusDays(30).toString();
        this.juegosComprados=new ArrayList<>();
        this.mensajes=new ArrayList<>();
        this.movimientosEnCuenta=new ArrayList<>();
        this.saldo=0.0;
    }
 */

    public UsuarioPremium(String nombre, String apellido, String dni, String mail, String contrasena, String nickName, Double saldo, ArrayList<Juego> juegosComprados, ArrayList<Mensaje> mensajes, Stack<MovimientoEconomico> movimientosEnCuenta) {
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

    public Stack<MovimientoEconomico> getMovimientosEnCuenta() {
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

    public void setMovimientosEnCuenta(Stack<MovimientoEconomico> movimientosEnCuenta) {
        this.movimientosEnCuenta = movimientosEnCuenta;
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
