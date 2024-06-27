import java.util.ArrayList;
import java.util.List;

/**
 * Classe que armazena todas as perguntas do jogo.
 * @author Samuel Levi Araújo Alves @see <a href="https://www.linkedin.com/in/samuel-levi-alves/">samuel-levi-alves</a>
 * @version 1.0.0
 */
public class BancoDePerguntas {
    private List<Pergunta> perguntas;

    /**
     * Construtor da classe BancoDePerguntas.
     */
    public BancoDePerguntas() {
        this.perguntas = new ArrayList<>();
        carregarPerguntas();
    }

    /**
     * Método que carrega as perguntas no banco de perguntas.
     */
    private void carregarPerguntas() {
        perguntas.add(new Pergunta("Para começar sua investigação, selecione todas as informações das estações espaciais. Complete a query: SELECT * ___ estacoes;", "FROM"));
        perguntas.add(new Pergunta("Filtre as estações que estão offline. Complete a query: SELECT * FROM estacoes ___ status = 'offline';", "WHERE"));
        perguntas.add(new Pergunta("Encontre as estações que foram construídas após o ano 2040. Complete a query: SELECT * FROM estacoes ___ ano_construcao > 2040;", "WHERE"));
        perguntas.add(new Pergunta("Liste as estações offline por ordem de última manutenção. Complete a query: SELECT * FROM estacoes WHERE status = 'offline' ___ data_ultima_manutencao;", "ORDER BY"));
        perguntas.add(new Pergunta("Ordene as estações pelo número de tripulantes em ordem crescente. Complete a query: SELECT * FROM estacoes ___ tripulantes ___;", "ORDER BY ASC"));
        perguntas.add(new Pergunta("Ordene as estações pelo número de tripulantes em ordem decrescente. Complete a query: SELECT * FROM estacoes ___ tripulantes ___;", "ORDER BY DESC"));
        perguntas.add(new Pergunta("Liste as estações offline mais recentes primeiro. Complete a query: SELECT * FROM estacoes WHERE status = 'offline' ORDER BY data_ultima_manutencao ___;", "DESC"));
        perguntas.add(new Pergunta("Agora, liste as estações offline mais antigas primeiro. Complete a query: SELECT * FROM estacoes WHERE status = 'offline' ORDER BY data_ultima_manutencao ___;", "ASC"));
        perguntas.add(new Pergunta("Encontre as estações que tiveram mais de 5 manutenções no último ano. Complete a query: SELECT * FROM estacoes ___ manutencoes_ultimo_ano > 5;", "WHERE"));
        perguntas.add(new Pergunta("Selecione apenas as estações localizadas no setor Alfa. Complete a query: SELECT * ___ estacoes ___ setor = 'Alfa';", "FROM WHERE"));
        perguntas.add(new Pergunta("Liste as estações com capacidade para mais de 100 tripulantes. Complete a query: SELECT * FROM estacoes ___ capacidade_tripulantes > 100;", "WHERE"));
        perguntas.add(new Pergunta("Ordene as estações pelo consumo de energia em ordem crescente. Complete a query: SELECT * FROM estacoes ___ consumo_energia ___;", "ORDER BY ASC"));
        perguntas.add(new Pergunta("Ordene as estações pelo consumo de energia em ordem decrescente. Complete a query: SELECT * FROM estacoes ___ consumo_energia ___;", "ORDER BY DESC"));
        perguntas.add(new Pergunta("Encontre as estações que relatam problemas críticos. Complete a query: SELECT * FROM estacoes ___ problemas_criticos = 'sim';", "WHERE"));
        perguntas.add(new Pergunta("Selecione as estações que estão funcionando perfeitamente. Complete a query: SELECT * FROM estacoes ___ status = 'online';", "WHERE"));
        // Adicione mais perguntas conforme necessário
    }

    /**
     * Obtém a lista de perguntas.
     *
     * @return A lista de perguntas.
     */
    public List<Pergunta> getPerguntas() {
        return perguntas;
    }
}
