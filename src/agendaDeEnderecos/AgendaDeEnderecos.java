package agendaDeEnderecos;
import java.util.ArrayList;
import java.util.List;

public class AgendaDeEnderecos {
    private List<Contato> contatos;

    public AgendaDeEnderecos() {
        contatos = new ArrayList<>();
    }

    public void inserirContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public List<Contato> listarTodosContatos() {
        return contatos;
    }
    public int contarContatos() {
        return contatos.size();
    }
}
