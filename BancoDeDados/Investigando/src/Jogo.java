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
        System.out.println("Bem-vindo ao Jogo de Investigação Futurista!");
        System.out.println("Você é um investigador tentando descobrir o que aconteceu com a Terra.");

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
                    System.out.println("Correto!\n");
                    correta = true;
                    pontuacao++;
                } else {
                    System.out.println("Incorreto. Tente novamente.\n");
                }
            }
        }

        System.out.println("Fim do jogo! Sua pontuação: " + pontuacao + "/" + perguntas.size());
    }
}
