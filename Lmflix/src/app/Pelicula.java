package app;

public class Pelicula extends Contenido {

    public Pelicula(int duracionenMinutos){
        this.duracionenMinutos = duracionenMinutos;
    }
    private Director director;
    private int duracionenMinutos;

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getDuracionenMinutos() {
        return duracionenMinutos;
    }

    public void setDuracionenMinutos(int duracionenMinutos) {
        this.duracionenMinutos = duracionenMinutos;
    }

}