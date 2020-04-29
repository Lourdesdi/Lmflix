package app;

public class Clasificacion {


    public Clasificacion(String tipo, int edadMinima, String descripcion){
        this.edadMinima = edadMinima;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    private int edadMinima;
    private String descripcion;
    private String tipo;

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    


}