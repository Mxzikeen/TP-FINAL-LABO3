package Model.Clases;

import Model.Interfaces.ComportamientoUser;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;

public class UserBasico extends Cliente implements Serializable , ComportamientoUser {
    private Integer cantDePartidas;

    public UserBasico(String nombre, String apellido, String dni, String mail, String contrasena, Double saldo, String nickName, ArrayList<Juego> juegosComprados, ArrayList<Mensaje> mensajes, ArrayList<MovimientoEconomico> movimientosEnCuenta, int i) {
    }

    public UserBasico(String nombre, String apellido, String dni, String mail, String contrasena, Double saldo, String nickName, Integer cantDePartidas) {
        super(nombre, apellido, dni, mail, contrasena, saldo, nickName);
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

    @Override
    public ArrayList<Juego> listarComprados() {
        return null;
    }


}
