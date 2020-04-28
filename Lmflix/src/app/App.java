package app;

public class App {
    public static void main(String[] args) throws Exception {
        Lmflix miLmflix = new Lmflix();

        System.out.println("Iniciando Catalogo");

        miLmflix.inicializarCatalogo();

        Serie bb = miLmflix.buscarSerie("Vis a Vis");

        Temporada laMejorTemporada = bb.getTemporada(1);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(20);

        elTop.reproducir();
        
    
    }
}
        