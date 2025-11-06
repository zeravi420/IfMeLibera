import java.util.ArrayList;
import java.util.List;
public class principial {
    public static void main(String[] args) {
        canal [] lista = {
            new canal(2,"noticias"),
            new canal(7, "musica"),
            new canal(3, "filmes"),
            new canal(10, "esportes")
        };

        Televisao tv = new Televisao(0);

        tv.LigadaDesligada();
    }
}
