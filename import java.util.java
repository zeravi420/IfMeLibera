import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

 
    public void removerContato(String nome) {
        contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    
    public Contato encontrarContato(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    
    public void imprimirAgenda() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            for (Contato c : contatos) {
                c.imprimirContato();
                System.out.println("------------------");
            }
        }
    }
}