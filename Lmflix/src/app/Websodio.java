package app;

public class Websodio extends Episodio{
    public Websodio(int numero, String nombre, int duracionenMinutos, String url){
        super(numero, nombre, duracionenMinutos);
        this.url = url;
    }

    private String url; 


     @Override //anotacion que indica que el metodo se sobre - escribe(redifinicion)
     public void reproducir() {

         System.out.println("Reproduciendo websodio " + "Nombre: " + this.getNombre() + "  La url es : " + this.url);
            
         }

         public String getUrl() {
             return url;
         }

         public void setUrl(String url) {
             this.url = url;
         }

}
