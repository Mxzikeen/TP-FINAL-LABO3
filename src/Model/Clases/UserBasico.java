package Model.Clases;

import Model.Interfaces.ComportamientoUser;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Stack;

public class UserBasico extends Usuario implements Serializable , ComportamientoUser {

    private Double saldo;
    private String nickName;
    private ArrayList<Juego> comprados;
    private ArrayList<Mensaje> mensajes;
    private Stack<MovimientoEconomico> extractoDeCuenta;
    private Integer cantDePartidas = 0;

    public UserBasico(String nombre, String apellido, String dni, String mail, String contrasena, Double saldo, String nickName, ArrayList<Juego> juegosComprados, ArrayList<Mensaje> mensajes, ArrayList<MovimientoEconomico> movimientosEnCuenta, int i) {
        super(nombre, apellido, dni, mail, contrasena);
        this.nickName=nickName;
        this.comprados = new ArrayList<Juego>();
        this.mensajes=new ArrayList<>();
        this.extractoDeCuenta=new Stack<>();
        this.saldo=0.0;
        this.cantDePartidas=0;
    }

    public UserBasico(String nombre, String apellido, String dni, String mail, String contrasena, Double saldo, String nickName, ArrayList<Juego> comprados, ArrayList<Mensaje> mensajes, Stack<MovimientoEconomico> extractoDeCuenta) {
        super(nombre, apellido, dni, mail, contrasena);
        this.saldo = saldo;
        this.nickName = nickName;
        this.comprados = comprados;
        this.mensajes = mensajes;
        this.extractoDeCuenta = extractoDeCuenta;
        this.cantDePartidas = 0;
    }

    public ArrayList<Juego> getComprados() {
        return comprados;
    }

    public void setComprados(ArrayList<Juego> comprados) {
        this.comprados = comprados;
    }

    public Double getSaldo() {
        return saldo;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Stack<MovimientoEconomico> getExtractoDeCuenta() {
        return extractoDeCuenta;
    }

    public void setExtractoDeCuenta(Stack<MovimientoEconomico> extractoDeCuenta) {
        this.extractoDeCuenta = extractoDeCuenta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getCantDePartidas() {
        return cantDePartidas;
    }

    public void setCantDePartidas(Integer cantDePartidas) {
        this.cantDePartidas = cantDePartidas;
    }

    public void agregarMovimientoEconomico(MovimientoEconomico nuevo){
        this.extractoDeCuenta.push(nuevo);
    }

    public void agregarMensaje(Mensaje nuevo){
        this.mensajes.add(nuevo);
    }

    @Override
    public void comprar(Pedido nuevo) {
        for (Juego juego: nuevo.getJuegos()){
            this.comprados.add(juego);
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

    @Override
    public ArrayList<Juego> listarComprados() {
        return this.comprados;
    }


}
