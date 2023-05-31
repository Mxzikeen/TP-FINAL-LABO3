package Model.Clases;

import Model.Enums.EJuegos;

import java.io.Serializable;
import java.util.*;

public class Steam implements Serializable {
    ArrayList<Juego> juegos;
    HashMap<String,Usuario> usuariosCliente;
    LinkedList<Admin> usuariosAdmins;
    //ArrayListDePedidos


    public Steam(Steam steam) {
        this.juegos=steam.juegos;
        this.usuariosCliente=steam.usuariosCliente;
        this.usuariosAdmins=steam.usuariosAdmins;
    }

    public Steam() {
        juegos=new ArrayList<>();
        usuariosCliente=new HashMap<>();
        usuariosAdmins=new LinkedList<>();
    }

    //region Manejo de Juegos
    public void agregarJuego(Juego nuevo){
        juegos.add(nuevo);
    }

    public ArrayList<Juego> listarTodosLosJuegos(){
        return this.juegos;
    }

    public ArrayList<Juego> listarJuegosPorCategoria(EJuegos categoria){
        ArrayList<Juego> juegosDeCategoria=new ArrayList<>();
        for (Juego juego: juegos){
            if (juego.getCategoria().equals(categoria.getCategoria())){
                juegosDeCategoria.add(juego);
            }
        }
        return juegosDeCategoria;
    }

    public ArrayList<Juego> listarTop5(){
        Collections.sort(this.juegos);
        return this.juegos;
    }

    public Boolean darDeBajaJuego(Integer id){
        Boolean eliminado=false;
        Integer i=0;
        while(eliminado==false && i<this.juegos.size()){
            if(this.juegos.get(i).getIdJuego()==id){
                this.juegos.get(i).setActivo(false);
                eliminado=true;
            }else {
                i++;
            }
        }
        return eliminado;
    }

    //endregion

    //region Manejo de User
    public void agregarUsuario(Usuario nuevo){
        this.usuariosCliente.put(nuevo.getDni(),nuevo);
    }

    public Boolean darDeBajaUsuario(String dni){
        Boolean eliminado=false;
        if(this.usuariosCliente.remove(dni)!=null){
            eliminado=true;
        }
        return eliminado;
    }

    public ArrayList<UserBasico> listarClientesBasicos(){
        ArrayList<UserBasico> listadoUsersBasicos=new ArrayList<>();
        for (Map.Entry<String,Usuario> entry: usuariosCliente.entrySet()){
            if(entry.getValue() instanceof UserBasico){
                listadoUsersBasicos.add((UserBasico) entry.getValue());
            }
        }
        return listadoUsersBasicos;
    }

    public ArrayList<Usuario> listarClientes(){
        ArrayList<Usuario> listadoUsuarios=new ArrayList<>(usuariosCliente.values());
        return listadoUsuarios;
    }



    //endRegion



    //region Getters Y Setters Para Serializacion

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    public HashMap<String, Usuario> getUsuariosCliente() {
        return usuariosCliente;
    }

    public void setUsuariosCliente(HashMap<String, Usuario> usuariosCliente) {
        this.usuariosCliente = usuariosCliente;
    }

    public LinkedList<Admin> getUsuariosAdmins() {
        return usuariosAdmins;
    }

    public void setUsuariosAdmins(LinkedList<Admin> usuariosAdmins) {
        this.usuariosAdmins = usuariosAdmins;
    }

    //endRegion


}
