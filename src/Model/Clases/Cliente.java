package Model.Clases;

import java.util.ArrayList;

public class Cliente extends Usuario{

    private Double saldo;
    private String nickName;
    private ArrayList<Juego> comprados;
    private ArrayList<Mensaje> mensajes;
    private ArrayList<MovimientoEconomico> extractoDeCuenta;

    public Cliente() {
        this.comprados = new ArrayList<>();
        this.mensajes = new ArrayList<>();
        this.extractoDeCuenta = new ArrayList<>();
    }

    public Cliente(String nombre, String apellido, String dni, String mail, String contrasena, Double saldo, String nickName) {
        super(nombre, apellido, dni, mail, contrasena);
        this.saldo = saldo;
        this.nickName = nickName;
        this.comprados = new ArrayList<>();
        this.mensajes = new ArrayList<>();
        this.extractoDeCuenta = new ArrayList<>();
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getNickName() {
        return nickName;
    }

    public ArrayList<Juego> getComprados() {
        return comprados;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public ArrayList<MovimientoEconomico> getExtractoDeCuenta() {
        return extractoDeCuenta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setComprados(ArrayList<Juego> comprados) {
        this.comprados = comprados;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public void setExtractoDeCuenta(ArrayList<MovimientoEconomico> extractoDeCuenta) {
        this.extractoDeCuenta = extractoDeCuenta;
    }

    public void CargarSaldo(Double aCargar) {
        this.saldo+=aCargar;
    }

    public void agregarMovimientoEconomico(MovimientoEconomico nuevo){
        this.extractoDeCuenta.add(nuevo);
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "saldo=" + saldo +
                ", nickName='" + nickName + '\'' +
                ", comprados=" + comprados +
                ", mensajes=" + mensajes +
                ", extractoDeCuenta=" + extractoDeCuenta +
                '}';
    }
}
