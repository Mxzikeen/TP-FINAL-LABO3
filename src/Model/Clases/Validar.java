package Model.Clases;

import java.io.Serializable;
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
            if (contra.length() > 7) {
                cant = true;
            }
            if (mayus && num && cant) {
                validado = true;
            }
        }
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

    public static Boolean nickname(String nickname, Map<String, Usuario> mapa) {
        Boolean aux = true;
        for (Map.Entry<String, Usuario> mapaAux : mapa.entrySet()) {
            if (mapaAux.getValue().getNickName().equals(nickname)) {
                aux = false;
            }
        }
        return aux;
    }
    //public static Boolean nombreDeJuego(String nombreJuego,)

}
