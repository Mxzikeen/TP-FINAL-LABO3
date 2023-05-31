package Model.Enums;

public enum EJuegos {
    ACCION("ACCION"),
    AVENTURA("AVENTURA"),
    DEROL("DE ROL"),
    SIMULACION("SIMULACION"),
    DEPORTES("DEPORTES"),
    ESTRATEGIA("ESTRATEGIA");

    private String nombreCategoria;
    private EJuegos( String nombreCategoria){
        this.nombreCategoria=nombreCategoria;
    }

    public String getCategoria(){
        return nombreCategoria;
    }
}
