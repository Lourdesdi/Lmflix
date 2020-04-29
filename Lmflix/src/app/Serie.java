package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {


    public Serie(String nombre, int anio){ //constructor
        this.nombre = nombre;
        this.anio = anio;
    }
    private String nombre;
    private int anio;
    private List<Temporada>temporada = new ArrayList<>(); // crea una lista de temporadas 
    
    public Temporada getTemporada(int nro){ 

        for (Temporada tempo : this.temporada){
            if (tempo.getNumero() == nro) {
                return tempo;
                //recorrer episodios (lista)
         //si el nro de episodio del ciclo es igual a "nro"
         //devolver ese episodio
            }
        }
        return null;

    }
    //getters y setters
    public List<Temporada> getTemporada() {
        return temporada;
    }
    public void setTemporada(List<Temporada> temporada) {
        this.temporada = temporada;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
}