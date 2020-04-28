package app;

import java.util.ArrayList;
import java.util.List;

public class Lmflix {

public List<Pelicula>peliculas = new ArrayList<>();
public List<Serie>series = new ArrayList<>();


public Serie buscarSerie(String titulo){
    for (Serie s: this.series){
        if (s.nombre.equals(titulo));
        return s;
    }

    return null;

}
public void inicializarCatalogo() {
    this.inicializarVisaVis();
    this.inicializarTheCrow();
} 
public void inicializarVisaVis() {
    Serie visaVis = new Serie();
    visaVis.nombre = "Vis a Vis";
    this.series.add(visaVis);

    Actor actor1 = new Actor();
    actor1.nombre = "Alba Flores";
    
    Clasificacion clasificacion = new Clasificacion();
    clasificacion.descripcion = "Mayor 18";
    clasificacion.edadMinima = 18;
    clasificacion.tipo = "M";
    
    visaVis.clasificacion = clasificacion;
    visaVis.calificacion = 9;
    visaVis.elenco.add(actor1);

    Genero genero = new Genero();
    genero.nombre = "Violencia";
    visaVis.genero = genero;

    Temporada t1 = new Temporada();
    t1.numero = 1;
    visaVis.temporada.add(t1);
    Episodio epi = new Episodio(); // solo la cargamos una vez esta variable con EPISODIO, despues solo epi
    epi.numero = 1;
    epi.nombre = "Mosquita Muerta";
    epi.duracionMinutos = 74;
    t1.episodio.add(epi);

    epi = new Episodio();
    epi.numero = 2;
    epi.nombre = "Cosiendo a Campanita";
    epi.duracionMinutos = 71;
    t1.episodio.add(epi);

    //creamos websodios
    Websodio webi = new Websodio();
    webi.nombre = "Maca se corta";
    webi.numero = 20;
    webi.duracionMinutos = 45;
    webi.descripcion = " Maca se corta la mano";
    webi.url = "http.://macasecortalamano.com";
    t1.episodio.add(webi);
    // seguimos con las temporadas y series se coloco aca por que websodio convenimos sea como un episodio

    Temporada t2 = new Temporada();
    visaVis.temporada.add(t2);
    t2.numero = 2;
    
    epi = new Episodio();
    epi.numero = 1;
    epi.nombre = "A un mono dos pistolas";
    epi.duracionMinutos = 76;
    t2.episodio.add(epi);
    epi = new Episodio();
    epi.numero = 2;
    epi.nombre = "Hogar dulce hogar";
    epi.duracionMinutos = 66;  
    t2.episodio.add(epi);
}
public void inicializarTheCrow() {
    Serie theCrown = new Serie();
    theCrown.nombre = "The Crown";
    this.series.add(theCrown);
    Actor actor2 = new Actor();
    actor2.nombre = "Claire Foy";
    
    Clasificacion clasificacion = new Clasificacion();
    clasificacion.descripcion = "Mayor 16";
    clasificacion.edadMinima = 16;
    clasificacion.tipo = "M16";
    
    theCrown.clasificacion = clasificacion;
    theCrown.calificacion = 10;
    theCrown.elenco.add(actor2);

    Genero genero = new Genero();
    genero.nombre = "Drama";
    theCrown.genero = genero;

    Temporada t1 = new  Temporada();
    t1.numero = 1;
    theCrown.temporada.add(t1);
    
    Episodio epi = new Episodio();
    
    epi.numero = 1;
    epi.nombre = "Wolferton Splas";
    epi.duracionMinutos = 56;
    epi.descripcion = "La joven princesa ISABEL se casa con FELIPE";
    t1.episodio.add(epi);

    epi = new Episodio();
    epi.numero = 2;
    epi.nombre = "Hyde park correr";
    epi.duracionMinutos = 61;
    epi.descripcion = "El rey Jorge esta muy enfermo para viajar y viaja la princesa";
    t1.episodio.add(epi);

    Temporada t2 = new Temporada();
    t2.numero = 2;
    theCrown.temporada.add(t2);

    epi = new Episodio();
    epi.numero = 1;
    epi.nombre = "Desventura";
    epi.duracionMinutos = 56;
    epi.descripcion = "ISABEL, hace un descubrimiento angustiante";
    t2.episodio.add(epi);

    epi = new Episodio();
    epi.numero = 2;
    epi.nombre = "Compania de hombres";
    epi.duracionMinutos = 54;
    epi.descripcion = "FELIPE revive momentos dolorosos";
    t2.episodio.add(epi);

    

 }

 

}