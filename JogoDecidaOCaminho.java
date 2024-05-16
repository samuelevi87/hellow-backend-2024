import java.util.Scanner;

/**
 * Jogo de aventura interativo que ensina o uso de if-else em Java.
 * @author Samuel Levi Araújo Alves
 * @see <a href="https://www.linkedin.com/in/samuel-levi-alves/">samuel-levi-alves</a>
 * @version 1.0.0
 */
public class JogoDecidaOCaminho {

    /**
     * Scanner para ler a entrada do usuário.
     */
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Método principal que inicia o jogo.
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao jogo Decida o Caminho!");
        iniciarAventura();
    }

    /**
     * Inicia a aventura, perguntando ao jogador se ele deseja entrar na floresta.
     */
    private static void iniciarAventura() {
        System.out.println("Você está na entrada de uma floresta misteriosa. Deseja entrar? (sim/não)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("sim")) {
            dentroDaFloresta();
        } else {
            System.out.println("Você decidiu não entrar na floresta. Fim da aventura!");
        }
    }

    /**
     * Apresenta a bifurcação na floresta e direciona o jogador para o caminho escolhido.
     */
    private static void dentroDaFloresta() {
        System.out.println("Você entrou na floresta e se depara com um caminho dividido. Você vai para a esquerda ou direita? (esquerda/direita)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("esquerda")) {
            caminhoEsquerda();
        } else {
            caminhoDireita();
        }
    }

    /**
     * Apresenta o caminho da esquerda, onde o jogador encontra um lago.
     */
    private static void caminhoEsquerda() {
        System.out.println("Você segue pela esquerda e encontra um lago tranquilo. Deseja nadar ou continuar caminhando? (nadar/continuar)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("nadar")) {
            System.out.println("Você decide nadar no lago. Enquanto nada, encontra uma chave misteriosa no fundo do lago.");
            finalMisterioso();
        } else {
            System.out.println("Você continua caminhando e eventualmente sai da floresta. Fim da aventura!");
        }
    }

    /**
     * Apresenta o caminho da direita, onde o jogador encontra um urso.
     */
    private static void caminhoDireita() {
        System.out.println("Você toma o caminho da direita e encontra um urso! Você corre ou tenta subir em uma árvore? (correr/subir)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("correr")) {
            System.out.println("Você tenta correr, mas o urso é mais rápido. Fim da aventura!");
        } else {
            System.out.println("Você sobe rapidamente em uma árvore e fica seguro enquanto o urso vai embora. Fim da aventura!");
        }
    }

    /**
     * Apresenta o final misterioso para quem encontrou a chave no lago.
     */
    private static void finalMisterioso() {
        System.out.println("Você explora a área ao redor do lago e descobre uma pequena cabana trancada. Usar a chave encontrada? (sim/não)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("sim")) {
            System.out.println("Você usa a chave para abrir a cabana e encontra um tesouro escondido! Parabéns, fim da aventura com sucesso!");
        } else {
            System.out.println("Você decide deixar o mistério para trás e retorna para casa. Fim da aventura!");
        }
    }
}
