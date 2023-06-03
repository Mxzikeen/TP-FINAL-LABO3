package Model.Clases;

import java.time.LocalDate;

public class Mensaje {
    private Integer idEmisor;
    private Integer idReceptor;
    private String mensaje;
    private String fecha;

    public Mensaje(Integer idEmisor, Integer idReceptor, String mensaje) {
        this.idEmisor = idEmisor;
        this.idReceptor = idReceptor;
        this.mensaje = mensaje;
        this.fecha = LocalDate.now().toString();
    }

    //region GETTERS
    public Integer getIdEmisor() {
        return idEmisor;
    }

    public Integer getIdReceptor() {
        return idReceptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getFecha() {
        return fecha;
    }
    //endregion

    //region SETTERS
    public void setIdEmisor(Integer idEmisor) {
        this.idEmisor = idEmisor;
    }

    public void setIdReceptor(Integer idReceptor) {
        this.idReceptor = idReceptor;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    //endregion
}
