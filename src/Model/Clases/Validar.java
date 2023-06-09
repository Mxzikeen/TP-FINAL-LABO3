package Model.Clases;

import Model.Enums.EJuegos;

import java.io.Serializable;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class Validar {
    public static ArrayList<Boolean> contrasena(String contra) {

        Boolean validado = false;//es el 0
        Boolean mayus = false;//es el 1
        Boolean num = false;//es el 2
        Boolean cant = false;//es el 3

        ArrayList<Boolean> validacionesContra = new ArrayList<>();

        for (int i = 0; i < contra.length(); i++) {
            if (Character.isUpperCase(contra.charAt(i))) {
                mayus = true;
            }
            if (Character.isDigit(contra.charAt(i))) {
                num = true;
            }

        }
        if (contra.length() > 7) {
            cant = true;
        }
        if (mayus && num && cant) {
            validado = true;
        }

        validacionesContra.add(validado);
        validacionesContra.add(mayus);
        validacionesContra.add(num);
        validacionesContra.add(cant);

        //soy mateo, me parecio estas dos sacarlas del for ya que son validaciones que se hacen
        //una sola vez, no me parece eficiente que cada vez que itere el bucle for consulte el respectivo if
        //ya que son validaciones  a hacer una sola vez
        //tambien me pareceria correcto recorrer con un while ya que si teniendo una sola mayus y una sola minus
        //la da como valida, en caso de que la primera sea mayus y la segunda minus, me parece innecesario seguir
        //recorreindo el string

        return validacionesContra;
    }

    public static ArrayList<Boolean> mailAdmin(String mail, LinkedList<Admin> list) {
        Boolean validado = false;//es la 0
        Boolean aux = false;//es la 1
        Boolean auxmail = false;//es la 2
        ArrayList<Boolean> verificacionesMail = new ArrayList<>();

        if (mail.contains("@") && mail.contains(".")) {
            aux = true;
        }
        for (Admin admin : list) {
            if (admin.getMail().equals(mail)) {
                auxmail = true;
            }
        }

        if (aux && !auxmail) {
            validado = true;
        }

        verificacionesMail.add(validado);
        verificacionesMail.add(aux);
        verificacionesMail.add(auxmail);

        return verificacionesMail;
    }

    //hacer la que busca si el nombre de juego esta ya guardado
    public static Boolean juegoYaExiste(String nombreJuego, ArrayList<Juego> arrayList) {
        Boolean validado = false;
        for (Juego juego : arrayList) {
            if (juego.getNombre().equals(nombreJuego)) {
                validado = true;
            }
        }
        return validado;
    }

    public static ArrayList<Boolean> mail(String mail, Map<String, Usuario> mapa) {

        Boolean validado = false;//es la 0
        Boolean aux = false;//es la 1
        Boolean auxmail = false;//es la 2
        ArrayList<Boolean> verificacionesMail = new ArrayList<>();

        if (mail.contains("@") && mail.contains(".")) {
            aux = true;
        }
        for (Map.Entry<String, Usuario> mapaAux : mapa.entrySet()) {
            if (mapaAux.getValue().getMail().equals(mail)) {
                auxmail = true;
            }
        }

        if (aux && !auxmail) {
            validado = true;
        }

        verificacionesMail.add(validado);
        verificacionesMail.add(aux);
        verificacionesMail.add(auxmail);

        return verificacionesMail;
    }

    public static Boolean nickname(String nickname, HashMap<String, Cliente> mapa) {
        Boolean aux = true;
        for (Map.Entry<String, Cliente> mapaAux : mapa.entrySet()) {
            if (mapaAux.getValue().getNickName().equals(nickname)) {
                aux = false;
            }
        }
        return aux;
    }

    public static Boolean dni(String DNI, HashMap<String, Cliente> map) {
        Boolean aux = true;
        if (map.containsKey(DNI)) {
            aux = false;
        }

        return aux;
    }

}
