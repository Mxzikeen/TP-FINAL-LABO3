import Model.Clases.Cliente;
import Model.Clases.Steam;
import Model.Clases.Usuario;
import Model.Clases.Validar;

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Admin usu = new Admin("Lea", "Rav", "31234567", "lea@.com", "ar");
       /* String a = "Hosssssla1";
        Map<String, Usuario> myMap = new HashMap<>();
        Usuario u1 = new Usuario("agus", "carnessali", "42782313", "agustin@gmail.com", "Contra123");
        Usuario u2 = new Usuario("facu", "walker", "42722313", "facundo@gmail.com", "hola123");

        myMap.put("42782313", u1);
        myMap.put("42722313", u2);

        System.out.println(Validar.mail("facundo2@gmail.com", myMap));
        // System.out.println(Validar.nickname("AgusCAI", myMap));
        System.out.println(Validar.contrasena(u2.getContrasena()));
        System.out.println(Validar.contrasena(u1.getContrasena()));*/
        Cliente cliente = new Cliente("Agus", "Carnessali", "42782313", "agus@gmail.com", "Agustin1234", 630.0, "AGUSPIOLA");
        Cliente cliente2 = new Cliente("Agus", "Carnessali", "42782314", "agust@gmail.com", "Agustin12345", 630.0, "AGUSTINAPE");

        cliente.darseDeBaja();
        cliente2.darseDeBaja();

        Steam steam = new Steam();
        steam.agregarUsuario(cliente);
        steam.agregarUsuario(cliente2);

        System.out.println(steam.listarClientesDadosDeBaja());
        //System.out.println(steam.buscarClientePorNickname("AGUSPIOLA"));
    }
}