package app;

public class Episodio {

    public Episodio(int numero, String nombre, int duracionenMinutos){
        this.numero = numero;
        this.nombre = nombre;
        this.duracionenMinutos = duracionenMinutos;
    }
    private int numero;
    private String nombre;
    private int duracionenMinutos;
    private String descripcion;


    
    public void reproducir(){
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre );
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionenMinutos() {
        return duracionenMinutos;
    }

    public void setDuracionenMinutos(int duracionenMinutos) {
        this.duracionenMinutos = duracionenMinutos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}