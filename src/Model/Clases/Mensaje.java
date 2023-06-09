package Model.Clases;

import java.time.LocalDate;

public class Mensaje {
    private String nicknameReceptor;
    private String nicknameEmisor;
    private String mensaje;
    private String fecha;

    public Mensaje(String nicknameReceptor, String nicknameEmisor, String mensaje) {
        this.nicknameReceptor = nicknameReceptor;
        this.nicknameEmisor = nicknameEmisor;
        this.mensaje = mensaje;
        this.fecha = LocalDate.now().toString();
    }

    //region GETTERS
    public String getNicknameReceptor() {
        return nicknameReceptor;
    }

    public String getNicknameEmisor() {
        return nicknameEmisor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getFecha() {
        return fecha;
    }
    //endregion

    //region SETTERS
    public void setNicknameReceptor(String nicknameReceptor) {
        this.nicknameReceptor = nicknameReceptor;
    }

    public void setNicknameEmisor(String nicknameEmisor) {
        this.nicknameEmisor = nicknameEmisor;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    //endregion
}
