package agendaDeEnderecos;

import java.util.List;

public class main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Rua A", "Cidade X", "Estado A", "12345-678");
        Endereco endereco2 = new Endereco("Rua B", "Cidade Y", "Estado B", "98765-432");

        // Criar instâncias de Contato com os Endereços
        Contato contato1 = new Contato("Eric Santos", "123-456-7890", "Eric@email.com", endereco1);
        Contato contato2 = new Contato("Grazy Santos", "987-654-3210", "grazy@email.com", endereco2);

        // Criar uma instância da AgendaDeEnderecos
        AgendaDeEnderecos agenda = new AgendaDeEnderecos();

        // Inserir os contatos na agenda
        agenda.inserirContato(contato1);
        agenda.inserirContato(contato2);

        // Listar todos os contatos na agenda
        List<Contato> contatosNaAgenda = agenda.listarTodosContatos();
        for (Contato contato : contatosNaAgenda) {
            System.out.println(contato);
            System.out.println("------------------------");
        }

        // Buscar um contato por nome
        Contato contatoEncontrado = agenda.buscarContatoPorNome("Eric Santos");
        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado:\n" + contatoEncontrado);
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Remover um contato
        agenda.removerContato(contato2);
        // Contar o número de contatos na agenda
        int numeroDeContatos = agenda.contarContatos();
        System.out.println("Número total de contatos na agenda: " + numeroDeContatos);
    }

    }


