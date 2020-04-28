package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    public List<Temporada>temporada = new ArrayList<>(); // crea una lista de temporadas 
    
    public Temporada getTemporada(int nro){ 

        for (Temporada tempo : this.temporada){
            if (tempo.numero == nro){
                return tempo;
                //recorrer episodios (lista)
         //si el nro de episodio del ciclo es igual a "nro"
         //devolver ese episodio
            }
        }
        return null;

    }
}