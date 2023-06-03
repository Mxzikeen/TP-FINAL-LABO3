package Model.Clases;

import java.time.LocalDate;

public class MovimientoEconomico {
    private String fecha;
    private tipoDeMovimiento tipo;
    private Integer magnitud;

    public enum tipoDeMovimiento{
        INGRESO,
        SALIDA;
    }

    public MovimientoEconomico(tipoDeMovimiento tipo, Integer magnitud) {
        this.fecha = LocalDate.now().toString();
        this.tipo = tipo;
        this.magnitud = magnitud;
    }

    //region GETTERS
    public String getFecha() {
        return fecha;
    }

    public tipoDeMovimiento getTipo() {
        return tipo;
    }

    public Integer getMagnitud() {
        return magnitud;
    }
    //endregion

    //region SETTERS

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTipo(tipoDeMovimiento tipo) {
        this.tipo = tipo;
    }

    public void setMagnitud(Integer magnitud) {
        this.magnitud = magnitud;
    }
    //endregion
}
