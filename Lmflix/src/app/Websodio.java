package app;

public class Websodio extends Episodio{

    public String url; 


     @Override //anotacion que indica que el metodo se sobre - escribe(redifinicion)
     public void reproducir() {

         System.out.println("Reproduciendo websodio " + "Nombre: " + this.nombre + "  La url es : " + this.url);
            
         }

}
