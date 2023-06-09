package Model.Interfaces;

import Model.Clases.Juego;
import Model.Clases.Mensaje;
import Model.Clases.MovimientoEconomico;
import Model.Clases.Pedido;

import java.util.ArrayList;

public interface ComportamientoUser {
     void comprar(Pedido nuevo);
     Boolean jugar();
     ArrayList<Juego> listarComprados ();
     //void CargarSaldo(Double aCargar);
     //void enviarMensaje(); esto tambien deberia hacerlo la contenedora
     //void agregarMovimientoEconomico(MovimientoEconomico nuevo);
     //public void agregarMensaje(Mensaje nuevo);
}
