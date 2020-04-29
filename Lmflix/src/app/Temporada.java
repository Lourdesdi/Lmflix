package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

public Temporada(int  numero){
    this.numero = numero;
    }
    private int numero; // numero de episodio

    private List<Episodio>episodio = new ArrayList<>(); //creo una lista de episodios

    private List<Websodio> websodios = new ArrayList<>(); 

    public Episodio getEpisodio( int nro){
        for (Episodio epi : this.episodio){
            if (epi.getNumero() == nro){
            return epi;
        }
    }

    return null;
} 


     public Websodio getWebisode(int nro){
         for(Websodio epi : this.websodios){
             if(epi.getNumero() == nro){

                 return epi;

             }

         } 
         return null;
     }
//getters y setters
     public int getNumero() {
         return numero;
     }
     public void setNumero(int numero) {
         this.numero = numero;
     }
     public List<Episodio> getEpisodio() {
         return episodio;
     }
     public void setEpisodio(List<Episodio> episodio) {
         this.episodio = episodio;
     }
     public List<Websodio> getWebsodios() {
         return websodios;
     }
     public void setWebsodios(List<Websodio> websodios) {
         this.websodios = websodios;
     }
}