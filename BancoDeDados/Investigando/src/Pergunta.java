/**
 * Classe que representa cada pergunta do jogo.
 * @author Samuel Levi Araújo Alves @see <a href="https://www.linkedin.com/in/samuel-levi-alves/">samuel-levi-alves</a>
 * @version 1.0.0
 */
public class Pergunta {
    private String enunciado;
    private String respostaCorreta;

    /**
     * Construtor da classe Pergunta.
     *
     * @param enunciado       O enunciado da pergunta.
     * @param respostaCorreta A resposta correta da pergunta.
     */
    public Pergunta(String enunciado, String respostaCorreta) {
        this.enunciado = enunciado;
        this.respostaCorreta = respostaCorreta;
    }

    /**
     * Obtém o enunciado da pergunta.
     *
     * @return O enunciado da pergunta.
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * Obtém a resposta correta da pergunta.
     *
     * @return A resposta correta da pergunta.
     */
    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    /**
     * Verifica se a resposta fornecida está correta.
     *
     * @param resposta A resposta fornecida pelo usuário.
     * @return True se a resposta estiver correta, caso contrário False.
     */
    public boolean estaCorreta(String resposta) {
        return respostaCorreta.equalsIgnoreCase(resposta.trim());
    }
}
