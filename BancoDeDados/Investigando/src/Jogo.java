import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Classe que gerencia a lógica principal do jogo.
 * @author Samuel Levi Araújo Alves @see <a href="https://www.linkedin.com/in/samuel-levi-alves/">samuel-levi-alves</a>
 * @version 1.0.0
 */
public class Jogo {
    private BancoDePerguntas bancoDePerguntas;
    private Historia historia;
    private Scanner scanner;

    // Códigos ANSI para cores
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_CYAN = "\u001B[36m";

    /**
     * Construtor da classe Jogo.
     */
    public Jogo() {
        this.bancoDePerguntas = new BancoDePerguntas();
        this.historia = new Historia();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Método que inicia o jogo.
     */
    public void iniciar() {
        System.out.println(ANSI_CYAN + "Bem-vindo ao Jogo de Investigação Futurista!" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Você é um investigador tentando descobrir o que aconteceu com a Terra." + ANSI_RESET);

        int pontuacao = 0;
        List<Pergunta> perguntas = bancoDePerguntas.getPerguntas();
        Collections.shuffle(perguntas); // Embaralha as perguntas

        for (int i = 0; i < perguntas.size(); i++) {
            Pergunta pergunta = perguntas.get(i);
            System.out.println(historia.getParteDaHistoria(i));
            boolean correta = false;

            while (!correta) {
                System.out.println(pergunta.getEnunciado());
                System.out.print("Sua resposta: ");
                String resposta = scanner.nextLine();

                if (pergunta.estaCorreta(resposta)) {
                    System.out.println(ANSI_GREEN + "Correto!\n" + ANSI_RESET);
                    correta = true;
                    pontuacao++;
                } else {
                    System.out.println(ANSI_RED + "Incorreto. Tente novamente.\n" + ANSI_RESET);
                }
            }
        }

        System.out.println(ANSI_YELLOW + "Fim do jogo! Sua pontuação: " + pontuacao + "/" + perguntas.size() + ANSI_RESET);
    }
}
