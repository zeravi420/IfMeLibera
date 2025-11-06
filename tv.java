import java.util.ArrayList;
import java.util.List;

public class Televisao {
    private boolean ligada;
    private int volume;
    private int canalAtual;
    private final int numeroTV;
    private final List<String> canais;

    public Televisao(int numeroTV) {
        this.numeroTV = numeroTV;
        this.ligada = false;
        this.volume = 10;
        this.canalAtual = 0;
        this.canais = new ArrayList<>();
        inicializarCanais();
    }

    private void inicializarCanais() {
        canais.add("Globo");
        canais.add("SBT");
        canais.add("Band");
        canais.add("DYSNEY");
    }
    public boolean isligada(){
        return this.ligada;
    }
    public void LigadaDesligada(){
        this.ligada =!this.ligada;
        if (isligada()){
            System.out.println("A TV está ligada!!");
        }else{
            System.out.println("A TV está desligada!!");
        }
    }
    public void mensagemTVDesligada(){
        System.out.println("A TV está desligada, ligue-a primeiro.");
    }
     
}
