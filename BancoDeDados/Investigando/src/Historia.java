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
