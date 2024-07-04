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
        perguntas.add(new Pergunta("Para começar sua investigação, selecione todas as informações das estações espaciais. Complete a query:\nSELECT * \n___ estacoes;", "FROM"));
        perguntas.add(new Pergunta("Filtre as estações que estão offline. Complete a query:\nSELECT * \nFROM estacoes \n___ status = 'offline';", "WHERE"));
        perguntas.add(new Pergunta("Encontre as estações que foram construídas após o ano 2040. Complete a query:\nSELECT * \nFROM estacoes \n___ ano_construcao > 2040;", "WHERE"));
        perguntas.add(new Pergunta("Liste as estações offline por ordem de última manutenção. Complete a query:\nSELECT * \nFROM estacoes \nWHERE status = 'offline' \n___ data_ultima_manutencao;", "ORDER BY"));
        perguntas.add(new Pergunta("Ordene as estações pelo número de tripulantes em ordem crescente. Complete a query:\nSELECT * \nFROM estacoes \n___ tripulantes \n___;", "ORDER BY ASC"));
        perguntas.add(new Pergunta("Ordene as estações pelo número de tripulantes em ordem decrescente. Complete a query:\nSELECT * \nFROM estacoes \n___ tripulantes \n___;", "ORDER BY DESC"));
        perguntas.add(new Pergunta("Liste as estações offline mais recentes primeiro. Complete a query:\nSELECT * \nFROM estacoes \nWHERE status = 'offline' \n___ data_ultima_manutencao \n___;", "ORDER BY DESC"));
        perguntas.add(new Pergunta("Agora, liste as estações offline mais antigas primeiro. Complete a query:\nSELECT * \nFROM estacoes \nWHERE status = 'offline' \n___ data_ultima_manutencao \n___;", "ORDER BY ASC"));
        perguntas.add(new Pergunta("Encontre as estações que tiveram mais de 5 manutenções no último ano. Complete a query:\nSELECT * \nFROM estacoes \n___ manutencoes_ultimo_ano > 5;", "WHERE"));
        perguntas.add(new Pergunta("Selecione apenas as estações localizadas no setor Alfa. Complete a query:\nSELECT * \n___ estacoes \n___ setor = 'Alfa';", "FROM WHERE"));
        perguntas.add(new Pergunta("Liste as estações com capacidade para mais de 100 tripulantes. Complete a query:\nSELECT * \nFROM estacoes \n___ capacidade_tripulantes > 100;", "WHERE"));
        perguntas.add(new Pergunta("Ordene as estações pelo consumo de energia em ordem crescente. Complete a query:\nSELECT * \nFROM estacoes \n___ consumo_energia \n___;", "ORDER BY ASC"));
        perguntas.add(new Pergunta("Ordene as estações pelo consumo de energia em ordem decrescente. Complete a query:\nSELECT * \nFROM estacoes \n___ consumo_energia \n___;", "ORDER BY DESC"));
        perguntas.add(new Pergunta("Encontre as estações que relatam problemas críticos. Complete a query:\nSELECT * \nFROM estacoes \n___ problemas_criticos = 'sim';", "WHERE"));
        perguntas.add(new Pergunta("Selecione as estações que estão funcionando perfeitamente. Complete a query:\nSELECT * \nFROM estacoes \n___ status = 'online';", "WHERE"));
        // Adição de novas perguntas com INSERT INTO
        perguntas.add(new Pergunta("Insira um novo registro de manutenção em uma estação. Complete a query:\nINSERT INTO \n___ (estacao_id, data, tipo) \nVALUES (3, '2054-07-01', 'Preventiva');", "manutencoes"));
        perguntas.add(new Pergunta("Registre um novo evento de intrusão em uma estação. Complete a query:\nINSERT INTO \n___ (estacao_id, data, descricao) \nVALUES (5, '2054-06-15', 'Intrusão detectada no setor beta');", "eventos"));
        perguntas.add(new Pergunta("Adicione uma nova estação espacial ao banco de dados. Complete a query:\nINSERT INTO \n___ (nome, status, setor, capacidade_tripulantes) \nVALUES ('Estação Gama', 'offline', 'Gama', 150);", "estacoes"));
        perguntas.add(new Pergunta("Insira um novo registro de consumo de energia em uma estação. Complete a query:\nINSERT INTO \n___ (estacao_id, data, consumo) \nVALUES (2, '2054-07-01', 500);", "consumos"));
        perguntas.add(new Pergunta("Registre um novo tripulante em uma estação. Complete a query:\nINSERT INTO \n___ (estacao_id, nome, funcao) \nVALUES (4, 'Carlos Silva', 'Engenheiro');", "tripulantes"));
        // Adição de novas perguntas com UPDATE
        perguntas.add(new Pergunta("Atualize o status de uma estação para 'online'. Complete a query:\nUPDATE \n___ \nSET status = 'online' \nWHERE estacao_id = 2;", "estacoes"));
        perguntas.add(new Pergunta("Modifique a capacidade de tripulantes de uma estação. Complete a query:\nUPDATE \n___ \nSET capacidade_tripulantes = 200 \nWHERE estacao_id = 5;", "estacoes"));
        perguntas.add(new Pergunta("Atualize a data da última manutenção de uma estação. Complete a query:\nUPDATE \n___ \nSET data_ultima_manutencao = '2054-07-01' \nWHERE estacao_id = 3;", "estacoes"));
        perguntas.add(new Pergunta("Altere o setor de uma estação para 'Delta'. Complete a query:\nUPDATE \n___ \nSET setor = 'Delta' \nWHERE estacao_id = 4;", "estacoes"));
        perguntas.add(new Pergunta("Atualize o consumo de energia de uma estação. Complete a query:\nUPDATE \n___ \nSET consumo = 600 \nWHERE estacao_id = 1;", "consumos"));
        // Adição de novas perguntas com DELETE
        perguntas.add(new Pergunta("Delete uma estação que foi desativada. Complete a query:\nDELETE FROM \n___ \nWHERE estacao_id = 5;", "estacoes"));
        perguntas.add(new Pergunta("Remova um registro de manutenção antigo. Complete a query:\nDELETE FROM \n___ \nWHERE manutencao_id = 7;", "manutencoes"));
        perguntas.add(new Pergunta("Delete um evento registrado erroneamente. Complete a query:\nDELETE FROM \n___ \nWHERE evento_id = 10;", "eventos"));
        perguntas.add(new Pergunta("Remova um tripulante que deixou a estação. Complete a query:\nDELETE FROM \n___ \nWHERE tripulante_id = 3;", "tripulantes"));
        perguntas.add(new Pergunta("Delete um registro de consumo de energia incorreto. Complete a query:\nDELETE FROM \n___ \nWHERE consumo_id = 6;", "consumos"));
        // Adição de novas perguntas com LIMIT
        perguntas.add(new Pergunta("Liste as 5 primeiras estações com maior consumo de energia. Complete a query:\nSELECT * \nFROM estacoes \nORDER BY consumo_energia DESC \n___ 5;", "LIMIT"));
        perguntas.add(new Pergunta("Encontre as 3 primeiras estações com maior capacidade de tripulantes. Complete a query:\nSELECT * \nFROM estacoes \nORDER BY capacidade_tripulantes DESC \n___ 3;", "LIMIT"));
        perguntas.add(new Pergunta("Mostre os 10 primeiros registros de eventos. Complete a query:\nSELECT * \nFROM eventos \nORDER BY data DESC \n___ 10;", "LIMIT"));
        perguntas.add(new Pergunta("Selecione os 2 primeiros registros de manutenções. Complete a query:\nSELECT * \nFROM manutencoes \nORDER BY data DESC \n___ 2;", "LIMIT"));
        perguntas.add(new Pergunta("Liste os 4 primeiros registros de consumo de energia. Complete a query:\nSELECT * \nFROM consumos \nORDER BY data DESC \n___ 4;", "LIMIT"));
        // Adição de novas perguntas com MIN
        perguntas.add(new Pergunta("Encontre a estação com o menor consumo de energia. Complete a query:\nSELECT nome \nFROM estacoes \nWHERE consumo_energia = (SELECT ___(consumo_energia) FROM estacoes);", "MIN"));
        perguntas.add(new Pergunta("Qual é a estação com a menor capacidade de tripulantes? Complete a query:\nSELECT nome \nFROM estacoes \nWHERE capacidade_tripulantes = (SELECT ___(capacidade_tripulantes) FROM estacoes);", "MIN"));
        perguntas.add(new Pergunta("Identifique a data mais antiga de manutenção. Complete a query:\nSELECT ___(data) \nFROM manutencoes;", "MIN"));
        perguntas.add(new Pergunta("Qual é o menor valor de consumo registrado? Complete a query:\nSELECT ___(consumo) \nFROM consumos;", "MIN"));
        perguntas.add(new Pergunta("Encontre o menor número de tripulantes em uma estação. Complete a query:\nSELECT ___(tripulantes) \nFROM estacoes;", "MIN"));
        // Adição de novas perguntas com MAX
        perguntas.add(new Pergunta("Encontre a estação com o maior consumo de energia. Complete a query:\nSELECT nome \nFROM estacoes \nWHERE consumo_energia = (SELECT ___(consumo_energia) FROM estacoes);", "MAX"));
        perguntas.add(new Pergunta("Qual é a estação com a maior capacidade de tripulantes? Complete a query:\nSELECT nome \nFROM estacoes \nWHERE capacidade_tripulantes = (SELECT ___(capacidade_tripulantes) FROM estacoes);", "MAX"));
        perguntas.add(new Pergunta("Identifique a data mais recente de manutenção. Complete a query:\nSELECT ___(data) \nFROM manutencoes;", "MAX"));
        perguntas.add(new Pergunta("Qual é o maior valor de consumo registrado? Complete a query:\nSELECT ___(consumo) \nFROM consumos;", "MAX"));
        perguntas.add(new Pergunta("Encontre o maior número de tripulantes em uma estação. Complete a query:\nSELECT ___(tripulantes) \nFROM estacoes;", "MAX"));
        // Adição de novas perguntas com COUNT
        perguntas.add(new Pergunta("Conte o número total de estações. Complete a query:\nSELECT ___(*) \nFROM estacoes;", "COUNT"));
        perguntas.add(new Pergunta("Quantas estações estão offline? Complete a query:\nSELECT ___(*) \nFROM estacoes \nWHERE status = 'offline';", "COUNT"));
        perguntas.add(new Pergunta("Conte o número de manutenções realizadas. Complete a query:\nSELECT ___(*) \nFR"COUNT")OM manutencoes;", );
        perguntas.add(new Pergunta("Quantos eventos de intrusão foram registrados? Complete a query:\nSELECT ___(*) \nFROM eventos \nWHERE descricao LIKE '%intrusão%';", "COUNT"));
        perguntas.add(new Pergunta("Conte o número de tripulantes em uma estação específica. Complete a query:\nSELECT ___(*) \nFROM tripulantes \nWHERE estacao_id = 4;", "COUNT"));
        // Adição de novas perguntas com AVG
        perguntas.add(new Pergunta("Calcule a média de consumo de energia das estações. Complete a query:\nSELECT ___(consumo_energia) \nFROM estacoes;", "AVG"));
        perguntas.add(new Pergunta("Qual é a média de capacidade de tripulantes por estação? Complete a query:\nSELECT ___(capacidade_tripulantes) \nFROM estacoes;", "AVG"));
        perguntas.add(new Pergunta("Calcule a média de manutenções por estação. Complete a query:\nSELECT ___(manutencoes_ultimo_ano) \nFROM estacoes;", "AVG"));
        perguntas.add(new Pergunta("Qual é a média de eventos registrados por estação? Complete a query:\nSELECT ___(eventos_por_estacao) \nFROM (SELECT COUNT(*) as eventos_por_estacao \nFROM eventos \nGROUP BY estacao_id) AS sub;", "AVG"));
        perguntas.add(new Pergunta("Calcule a média de consumo de energia por estação nos últimos 30 dias. Complete a query:\nSELECT ___(consumo) \nFROM consumos \nWHERE data > DATE_SUB(CURDATE(), INTERVAL 30 DAY);", "AVG"));
        // Adição de novas perguntas com SUM
        perguntas.add(new Pergunta("Calcule o consumo total de energia de todas as estações. Complete a query:\nSELECT ___(consumo_energia) \nFROM estacoes;", "SUM"));
        perguntas.add(new Pergunta("Qual é a soma da capacidade de tripulantes de todas as estações? Complete a query:\nSELECT ___(capacidade_tripulantes) \nFROM estacoes;", "SUM"));
        perguntas.add(new Pergunta("Calcule o total de manutenções realizadas em todas as estações. Complete a query:\nSELECT ___(manutencoes_ultimo_ano) \nFROM estacoes;", "SUM"));
        perguntas.add(new Pergunta("Qual é a soma total de eventos registrados? Complete a query:\nSELECT ___(eventos_por_estacao) \nFROM (SELECT COUNT(*) as eventos_por_estacao \nFROM eventos) AS sub;", "SUM"));
        perguntas.add(new Pergunta("Calcule o consumo total de energia das estações nos últimos 30 dias. Complete a query:\nSELECT ___(consumo) \nFROM consumos \nWHERE data > DATE_SUB(CURDATE(), INTERVAL 30 DAY);", "SUM"));
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