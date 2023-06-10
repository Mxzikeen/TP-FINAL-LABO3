package Model.Clases;

import Model.Interfaces.ComportamientoUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Stack;

public class UsuarioPremium  extends Cliente implements Serializable, ComportamientoUser {

    private String vencimientoDeSuscripcion;

    public UsuarioPremium() {
    }

    public UsuarioPremium(String nombre, String apellido, String dni, String mail, String contrasena, Double saldo, String nickName) {
        super(nombre, apellido, dni, mail, contrasena, saldo, nickName);
        this.vencimientoDeSuscripcion = LocalDate.now().toString();
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
            this.getComprados().add(juego);
        }
    }
    @Override
    public Boolean jugar() {
        return true;
    }

    @Override
    public ArrayList<Juego> listarComprados() {
        return this.getComprados();
    }

}
