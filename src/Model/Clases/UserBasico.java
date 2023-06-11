package Model.Clases;

import Model.Interfaces.ComportamientoUser;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Stack;

public class UserBasico extends Cliente implements Serializable , ComportamientoUser {
    private Integer cantDePartidas = 0;

    public UserBasico() {
    }

    public UserBasico(String nombre, String apellido, String dni, String mail, String contrasena, Double saldo, String nickName) {
        super(nombre, apellido, dni, mail, contrasena, saldo, nickName);
        this.cantDePartidas = 0;
    }

    public UserBasico(String nombre, String apellido, String dni, String mail, String contrasena, Double saldo, String nickName, ArrayList<Juego> comprados, ArrayList<Mensaje> mensajes, ArrayList<MovimientoEconomico> extractoDeCuenta) {
        super(nombre, apellido, dni, mail, contrasena, saldo, nickName, comprados, mensajes, extractoDeCuenta);
        this.cantDePartidas = 0;
    }

    public Integer getCantDePartidas() {
        return cantDePartidas;
    }

    public void setCantDePartidas(Integer cantDePartidas) {
        this.cantDePartidas = cantDePartidas;
    }

    @Override
    public void comprar(Pedido nuevo) {
        for (Juego juego: nuevo.getJuegos()){
            this.getComprados().add(juego);
        }
    }

    public Boolean jugar(){
        Boolean jugar=true;
        if (cantDePartidas<5){
            cantDePartidas++;
        }else {
            JOptionPane.showMessageDialog(null,"Limite de partidas diarias superado, regrese mañana o hagase premium");
            jugar=false;
        }
        return jugar;
    }


}
