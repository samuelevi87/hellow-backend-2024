import java.util.ArrayList;
import java.util.List;

/**
 * Classe que fornece a narrativa do jogo.
 * @author Samuel Levi Araújo Alves @see <a href="https://www.linkedin.com/in/samuel-levi-alves/">samuel-levi-alves</a>
 * @version 1.0.0
 */
public class Historia {
    private List<String> partesDaHistoria;

    /**
     * Construtor da classe Historia.
     */
    public Historia() {
        this.partesDaHistoria = new ArrayList<>();
        carregarHistoria();
    }

    /**
     * Método que carrega as partes da história.
     */
    private void carregarHistoria() {
        partesDaHistoria.add("\u001B[36mAno 2054. A Terra está em caos. Você, um investigador renomado, foi convocado para descobrir o que levou a humanidade ao colapso. Sua primeira missão é acessar o banco de dados das estações espaciais.\u001B[0m");
        partesDaHistoria.add("\u001B[36mVocê descobriu que algumas estações estão offline. Vamos filtrar esses dados para encontrar mais informações.\u001B[0m");
        partesDaHistoria.add("\u001B[36mPara entender melhor a situação, precisamos ordenar as estações offline pela data de última manutenção.\u001B[0m");
        partesDaHistoria.add("\u001B[36mAgora, vamos listar as estações offline mais recentes primeiro para verificar quais precisam de atenção imediata.\u001B[0m");
        partesDaHistoria.add("\u001B[36mFinalmente, vamos listar as estações offline mais antigas primeiro para verificar o histórico de problemas.\u001B[0m");
        partesDaHistoria.add("\u001B[36mVamos procurar estações construídas após o ano 2040 para entender melhor as novas instalações.\u001B[0m");
        partesDaHistoria.add("\u001B[36mPrecisamos ordenar as estações pelo número de tripulantes em ordem crescente para alocar recursos.\u001B[0m");
        partesDaHistoria.add("\u001B[36mAgora, vamos ordenar as estações pelo número de tripulantes em ordem decrescente para priorizar as maiores.\u001B[0m");
        partesDaHistoria.add("\u001B[36mSelecione as estações localizadas no setor Alfa para uma inspeção detalhada.\u001B[0m");
        partesDaHistoria.add("\u001B[36mVerifique as estações que têm capacidade para mais de 100 tripulantes.\u001B[0m");
        partesDaHistoria.add("\u001B[36mOrdene as estações pelo consumo de energia em ordem crescente para otimizar o uso de recursos.\u001B[0m");
        partesDaHistoria.add("\u001B[36mAgora, ordene as estações pelo consumo de energia em ordem decrescente para identificar as mais críticas.\u001B[0m");
        partesDaHistoria.add("\u001B[36mEncontre as estações que relatam problemas críticos para intervenção imediata.\u001B[0m");
        partesDaHistoria.add("\u001B[36mSelecione as estações que estão funcionando perfeitamente para garantir que nada foi esquecido.\u001B[0m");
        // Adição de novas partes da história
        partesDaHistoria.add("\u001B[36mVocê agora precisa registrar as manutenções das estações. Comece inserindo os novos registros.\u001B[0m");
        partesDaHistoria.add("\u001B[36mUm evento de intrusão foi detectado em uma estação. Registre esse evento para manter o controle.\u001B[0m");
        partesDaHistoria.add("\u001B[36mUma nova estação espacial foi construída. Adicione essa nova estação ao banco de dados.\u001B[0m");
        partesDaHistoria.add("\u001B[36mRegistre o consumo de energia mais recente para uma das estações. Isso ajudará a monitorar os recursos.\u001B[0m");
        partesDaHistoria.add("\u001B[36mUm novo tripulante chegou à estação. Registre o novo tripulante no banco de dados.\u001B[0m");
        // Adição de novas partes da história para UPDATE
        partesDaHistoria.add("\u001B[36mVocê precisa atualizar o status de algumas estações. Comece atualizando o status para 'online'.\u001B[0m");
        partesDaHistoria.add("\u001B[36mModifique a capacidade de tripulantes de uma estação para refletir as novas mudanças.\u001B[0m");
        partesDaHistoria.add("\u001B[36mAtualize a data da última manutenção para manter os registros em dia.\u001B[0m");
        partesDaHistoria.add("\u001B[36mAltere o setor de uma estação para 'Delta' devido a uma reorganização.\u001B[0m");
        partesDaHistoria.add("\u001B[36mAtualize o consumo de energia de uma estação para refletir os novos dados coletados.\u001B[0m");
        // Adição de novas partes da história para DELETE
        partesDaHistoria.add("\u001B[36mAlgumas estações desativadas precisam ser removidas do banco de dados. Comece deletando as estações desativadas.\u001B[0m");
        partesDaHistoria.add("\u001B[36mRemova registros de manutenção antigos que não são mais necessários.\u001B[0m");
        partesDaHistoria.add("\u001B[36mDelete eventos registrados erroneamente para manter a precisão dos dados.\u001B[0m");
        partesDaHistoria.add("\u001B[36mRemova tripulantes que deixaram a estação para atualizar os registros de pessoal.\u001B[0m");
        partesDaHistoria.add("\u001B[36mDelete registros de consumo de energia incorretos para garantir a integridade dos dados.\u001B[0m");
        // Adição de novas partes da história para LIMIT
        partesDaHistoria.add("\u001B[36mVocê precisa listar as estações com maior consumo de energia. Comece limitando os resultados aos 5 primeiros.\u001B[0m");
        partesDaHistoria.add("\u001B[36mEncontre as estações com maior capacidade de tripulantes. Limite os resultados aos 3 primeiros.\u001B[0m");
        partesDaHistoria.add("\u001B[36mMostre os primeiros registros de eventos. Limite os resultados aos 10 primeiros.\u001B[0m");
        partesDaHistoria.add("\u001B[36mSelecione os primeiros registros de manutenções. Limite os resultados aos 2 primeiros.\u001B[0m");
        partesDaHistoria.add("\u001B[36mListe os primeiros registros de consumo de energia. Limite os resultados aos 4 primeiros.\u001B[0m");
        // Adição de novas partes da história para MIN
        partesDaHistoria.add("\u001B[36mEncontre a estação com o menor consumo de energia. Utilize a função MIN.\u001B[0m");
        partesDaHistoria.add("\u001B[36mQual é a estação com a menor capacidade de tripulantes? Utilize a função MIN.\u001B[0m");
        partesDaHistoria.add("\u001B[36mIdentifique a data mais antiga de manutenção. Utilize a função MIN.\u001B[0m");
        partesDaHistoria.add("\u001B[36mQual é o menor valor de consumo registrado? Utilize a função MIN.\u001B[0m");
        partesDaHistoria.add("\u001B[36mEncontre o menor número de tripulantes em uma estação. Utilize a função MIN.\u001B[0m");
        // Adição de novas partes da história para MAX
        partesDaHistoria.add("\u001B[36mEncontre a estação com o maior consumo de energia. Utilize a função MAX.\u001B[0m");
        partesDaHistoria.add("\u001B[36mQual é a estação com a maior capacidade de tripulantes? Utilize a função MAX.\u001B[0m");
        partesDaHistoria.add("\u001B[36mIdentifique a data mais recente de manutenção. Utilize a função MAX.\u001B[0m");
        partesDaHistoria.add("\u001B[36mQual é o maior valor de consumo registrado? Utilize a função MAX.\u001B[0m");
        partesDaHistoria.add("\u001B[36mEncontre o maior número de tripulantes em uma estação. Utilize a função MAX.\u001B[0m");
        // Adição de novas partes da história para COUNT
        partesDaHistoria.add("\u001B[36mConte o número total de estações. Isso ajudará a entender o escopo da operação.\u001B[0m");
        partesDaHistoria.add("\u001B[36mQuantas estações estão offline? Conte para identificar a extensão do problema.\u001B[0m");
        partesDaHistoria.add("\u001B[36mConte o número de manutenções realizadas para avaliar a carga de trabalho.\u001B[0m");
        partesDaHistoria.add("\u001B[36mQuantos eventos de intrusão foram registrados? Conte para avaliar a segurança.\u001B[0m");
        partesDaHistoria.add("\u001B[36mConte o número de tripulantes em uma estação específica para monitorar o pessoal.\u001B[0m");
        // Adição de novas partes da história para AVG
        partesDaHistoria.add("\u001B[36mCalcule a média de consumo de energia das estações para entender o consumo geral.\u001B[0m");
        partesDaHistoria.add("\u001B[36mQual é a média de capacidade de tripulantes por estação? Isso ajudará a planejar a alocação de recursos.\u001B[0m");
        partesDaHistoria.add("\u001B[36mCalcule a média de manutenções por estação para entender a necessidade de manutenção.\u001B[0m");
        partesDaHistoria.add("\u001B[36mQual é a média de eventos registrados por estação? Isso ajudará a avaliar a frequência de eventos.\u001B[0m");
        partesDaHistoria.add("\u001B[36mCalcule a média de consumo de energia por estação nos últimos 30 dias para monitorar a eficiência energética.\u001B[0m");
        // Adição de novas partes da história para SUM
        partesDaHistoria.add("\u001B[36mCalcule o consumo total de energia de todas as estações para entender a demanda total.\u001B[0m");
        partesDaHistoria.add("\u001B[36mQual é a soma da capacidade de tripulantes de todas as estações? Isso ajudará a planejar a capacidade total.\u001B[0m");
        partesDaHistoria.add("\u001B[36mCalcule o total de manutenções realizadas em todas as estações para entender a carga de manutenção.\u001B[0m");
        partesDaHistoria.add("\u001B[36mQual é a soma total de eventos registrados? Isso ajudará a avaliar o impacto dos eventos.\u001B[0m");
        partesDaHistoria.add("\u001B[36mCalcule o consumo total de energia das estações nos últimos 30 dias para monitorar a eficiência energética recente.\u001B[0m");
        // Adicione mais partes da história conforme necessário
    }

    /**
     * Obtém uma parte da história com base no índice fornecido.
     *
     * @param indice O índice da parte da história.
     * @return A parte da história correspondente ao índice.
     */
    public String getParteDaHistoria(int indice) {
        if (indice < partesDaHistoria.size()) {
            return partesDaHistoria.get(indice);
        } else {
            return "\u001B[33mParabéns! Você completou a investigação inicial. Continue explorando para descobrir toda a verdade.\u001B[0m";
        }
    }
}
