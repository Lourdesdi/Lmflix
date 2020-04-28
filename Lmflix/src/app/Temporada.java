package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
public int numero; // numero de episodio

public List<Episodio>episodio = new ArrayList<>(); //creo una lista de episodios

public List<Websodio> websodios = new ArrayList<>(); 

public Episodio getEpisodio( int nro){
    for (Episodio epi : this.episodio){
        if (epi.numero == nro){
            return epi;
        }
    }

    return null;
} 


     public Websodio getWebisode(int nro){
         for(Websodio epi : this.websodios){
             if(epi.numero == nro){

                 return epi;

             }

         } 
         return null;
     }
}