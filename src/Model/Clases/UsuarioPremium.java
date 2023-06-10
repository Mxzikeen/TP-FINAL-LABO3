package Model.Clases;

import Model.Interfaces.ComportamientoUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Stack;

public class UsuarioPremium  extends Cliente implements Serializable, ComportamientoUser {

    private String vencimientoDeSuscripcion;
    private String nickName;
    private Double saldo;
    private ArrayList<Juego> juegosComprados;
    private ArrayList<Mensaje> mensajes;
    private ArrayList<MovimientoEconomico> movimientosEnCuenta;

    public UsuarioPremium(String nombre, String apellido, String dni, String mail, String contrasena, String nickName, Double saldo, ArrayList<Juego> comprados, ArrayList<Mensaje> mensajes, Stack<MovimientoEconomico> extractoDeCuenta) {
    }

    public UsuarioPremium(String nombre, String apellido, String dni, String mail, String contrasena, Double saldo, String nickName, String vencimientoDeSuscripcion, String nickName1, Double saldo1, ArrayList<Juego> juegosComprados, ArrayList<Mensaje> mensajes, ArrayList<MovimientoEconomico> movimientosEnCuenta) {
        super(nombre, apellido, dni, mail, contrasena, saldo, nickName);
        this.vencimientoDeSuscripcion = vencimientoDeSuscripcion;
        this.nickName = nickName1;
        this.saldo = saldo1;
        this.juegosComprados = juegosComprados;
        this.mensajes = mensajes;
        this.movimientosEnCuenta = movimientosEnCuenta;
    }

    public String getVencimientoDeSuscripcion() {
        return vencimientoDeSuscripcion;
    }


    public void setVencimientoDeSuscripcion(String vencimientoDeSuscripcion) {
        this.vencimientoDeSuscripcion = vencimientoDeSuscripcion;
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

}
