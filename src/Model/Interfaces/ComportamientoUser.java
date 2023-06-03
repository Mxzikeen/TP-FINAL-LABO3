package Model.Interfaces;

import Model.Clases.Juego;
import Model.Clases.Pedido;

import java.util.ArrayList;

public interface ComportamientoUser {
     void comprar(Pedido nuevo);
     Boolean jugar();
     //void cambiarCuenta(); esto talvez seria mejor que lo maneje el Steammaster ya que sino cada User deberia importar el otro
     ArrayList<Juego> listarComprados ();
     void CargarSaldo(Double aCargar);
     //void enviarMensaje(); esto tambien deberia hacerlo la contenedora

}
