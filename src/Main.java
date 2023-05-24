import Model.User;
import Model.Usuario;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User usu = new User("Lea", "Rav", "31234567", "lea@.com", "ar");

        usu.toString();
        usu.setPassword();
        usu.toString();
    }
}