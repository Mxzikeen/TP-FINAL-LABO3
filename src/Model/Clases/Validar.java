package Model.Clases;

import Model.Enums.EJuegos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Validar {
    public static Boolean contrasena(String contra) {
        Boolean mayus = false;
        Boolean num = false;
        Boolean cant = false;
        Boolean validado = false;

        for (int i = 0; i < contra.length(); i++) {
            if (Character.isUpperCase(contra.charAt(i))) {
                mayus = true;
            }
            if (Character.isDigit(contra.charAt(i))) {
                num = true;
            }

        }
        if(contra.length()>7){
            cant=true;
        }
        if (mayus && num && cant) {
            validado = true;
        }

        //soy mateo, me parecio estas dos sacarlas del for ya que son validaciones que se hacen
        //una sola vez, no me parece eficiente que cada vez que itere el bucle for consulte el respectivo if
        //ya que son validaciones  a hacer una sola vez
        //tambien me pareceria correcto recorrer con un while ya que si teniendo una sola mayus y una sola minus
        //la da como valida, en caso de que la primera sea mayus y la segunda minus, me parece innecesario seguir
        //recorreindo el string

        return validado;
    }

    public static Boolean mail(String mail, Map<String, Usuario> mapa) {
        Boolean aux = false;
        Boolean auxmail = false;
        Boolean validado = false;
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
        return validado;
    }

   public static Boolean nickname(String nickname, HashMap<String,Cliente> mapa) {
        Boolean aux = true;
        for (Map.Entry<String, Cliente> mapaAux : mapa.entrySet()) {
            if (mapaAux.getValue().getNickName().equals(nickname)) {
                aux = false;
            }
        }
        return aux;
    }

    public static Boolean dni(String DNI,HashMap<String,Cliente> map) {
        Boolean aux = true;
        if(map.containsKey(DNI)){
            aux=false;
        }

        return aux;
    }


   // public static Boolean nombreDeJuego(String nombreJuego, EJuegos categoria, ArrayList<Juego> juegos){
    //    Boolean existe=false;
    //    return existe;
    //}

}
