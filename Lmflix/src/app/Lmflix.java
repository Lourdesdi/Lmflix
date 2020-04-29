package app;

import java.util.ArrayList;
import java.util.List;

public class Lmflix {

private List<Pelicula>peliculas = new ArrayList<>();
private List<Serie>series = new ArrayList<>();


public Serie buscarSerie(String titulo){
    for (Serie s: this.series){
        if (s.getNombre().equals(titulo));
        return s;
    }

    return null;

}
public void inicializarCatalogo() {
    this.inicializarVisaVis();
    this.inicializarTheCrow();
} 
public void inicializarVisaVis() {
    Serie visaVis = new Serie("Vis a Vis", 2018);
    //visaVis.setNombre("Vis a Vis");
    this.series.add(visaVis);

    Actor actor1 = new Actor(34, "Alba Flores");
    //actor1.setNombre("Alba Flores");
    
    Clasificacion clasificacion = new Clasificacion("Mayor 18", 18, "M");
    //clasificacion.setDescripcion("Mayor 18");
    //clasificacion.setEdadMinima(18);
    //clasificacion.setTipo("M");
    
    visaVis.setClasificacion(clasificacion);
    visaVis.setCalificacion(9);
    visaVis.getElenco().add(actor1);

    Genero genero = new Genero("Violencia");
    //genero.nombre = "Violencia";
    visaVis.setGenero(genero);

    Temporada t1 = new Temporada(1);
    //t1.numero = 1;
    visaVis.getTemporada().add(t1);
    Episodio epi = new Episodio(1, "Mosquita Muerta", 74); // solo la cargamos una vez esta variable con EPISODIO, despues solo epi
    //epi.numero = 1;
    //epi.nombre = "Mosquita Muerta";
    //epi.duracionMinutos = 74;
    t1.getEpisodio().add(epi);

    epi = new Episodio(2,"Cosiendo a Campanita", 71);
    //epi.numero = 2;
    //epi.nombre = "Cosiendo a Campanita";
    //epi.duracionMinutos = 71;
    t1.getEpisodio().add(epi);

    //creamos websodios
    Websodio webi = new Websodio(20, "Maca se corta", 45, "http.://macasecortalamano.com");
    //webi.nombre = "Maca se corta";
    //webi.numero = 20;
    //webi.duracionMinutos = 45;
    //webi.url = "http.://macasecortalamano.com";
    webi.setDescripcion(" Maca se corta la mano");
    t1.getEpisodio().add(webi);
    // seguimos con las temporadas y series se coloco aca por que websodio convenimos sea como un episodio

    Temporada t2 = new Temporada(2);
    visaVis.getTemporada().add(t2);
    //t2.numero = 2;
    
    epi = new Episodio(1,"A un mono dos pistolas", 76 );
    //epi.numero = 1;
    //epi.nombre = "A un mono dos pistolas";
    //epi.duracionMinutos = 76;
    t2.getEpisodio().add(epi);
    epi = new Episodio(2,"Hogar dulce hogar", 66);
    //epi.numero = 2;
    //epi.nombre = "Hogar dulce hogar";
    //epi.duracionMinutos = 66;  
    t2.getEpisodio().add(epi);
}
public void inicializarTheCrow() {
    Serie theCrown = new Serie("The Crown",2020);
    //theCrown.setNombre("The Crown");
    this.series.add(theCrown);
    Actor actor2 = new Actor(37, "Claire Foy");
    //actor2.setNombre("Claire Foy");
    
    Clasificacion clasificacion = new Clasificacion("Mayor 16", 16, "M16");
    clasificacion.setDescripcion("Mayor 16");
    clasificacion.setEdadMinima(16);
    clasificacion.setTipo("M16");
    
    theCrown.setClasificacion(clasificacion);
    theCrown.setCalificacion(10);
    theCrown.getElenco().add(actor2);

    Genero genero = new Genero("Drama");
    //genero.nombre = "Drama";
    theCrown.setGenero(genero);

    Temporada t1 = new  Temporada(1);
    //t1.numero = 1;
    theCrown.getTemporada().add(t1);
    
    Episodio epi = new Episodio(1,"Wolferton Splas", 56);
    
    //epi.numero = 1;
    //epi.nombre = "Wolferton Splas";
    //epi.duracionMinutos = 56;
    epi.setDescripcion("La joven princesa ISABEL se casa con FELIPE");
    t1.getEpisodio().add(epi);

    epi = new Episodio(2, "Hyde park correr", 61);
    //epi.numero = 2;
    //epi.nombre = "Hyde park correr";
    //epi.duracionMinutos = 61;
    epi.setDescripcion("El rey Jorge esta muy enfermo para viajar y viaja la princesa");
    t1.getEpisodio().add(epi);

    Temporada t2 = new Temporada(2);
    //t2.numero = 2;
    theCrown.getTemporada().add(t2);

    epi = new Episodio(1,"Desventura", 56);
    //epi.numero = 1;
    //epi.nombre = "Desventura";
    //epi.duracionMinutos = 56;
    //epi.descripcion = "ISABEL, hace un descubrimiento angustiante";
    t2.getEpisodio().add(epi);

    epi = new Episodio(2,"Compania de hombres",54);
    //epi.numero = 2;
    //epi.nombre = "Compania de hombres";
    //epi.duracionMinutos = 54;
    //epi.descripcion = "FELIPE revive momentos dolorosos";
    t2.getEpisodio().add(epi);

    

 }
//getters y setters
 public List<Pelicula> getPeliculas() {
     return peliculas;
 }
 public void setPeliculas(List<Pelicula> peliculas) {
     this.peliculas = peliculas;
 }
 public List<Serie> getSeries() {
     return series;
 }
 public void setSeries(List<Serie> series) {
     this.series = series;
 }

 

}