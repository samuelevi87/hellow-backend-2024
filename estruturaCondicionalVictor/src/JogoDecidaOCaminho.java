import java.util.Scanner;

public class JogoDecidaOCaminho {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao jogo Decida o Caminho!");
        iniciarAventura();
    }

    private static void iniciarAventura() {
        System.out.println("Você está na entrada de uma floresta misteriosa. Deseja entrar? (sim/não)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("sim")) {
            dentroDaFloresta();
        } else {
            System.out.println("Você decidiu não entrar na floresta. Fim da aventura!");
        }
    }

    private static void              dentroDaFloresta() {
        System.out.println("Você entrou na floresta e se depara com um caminho dividido. Você vai para a esquerda ou direita? (esquerda/direita)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("esquerda")) {
            caminhoEsquerda();
        } else {
            caminhoDireita();
        }
    }

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

    private static void caminhoDireita() {
        System.out.println("Você toma o caminho da direita e encontra um urso! Você corre ou tenta subir em uma árvore? (correr/subir)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("correr")) {
            System.out.println("Você tenta correr, mas o urso é mais rápido. Fim da aventura!");
        } else {
            System.out.println("Você sobe rapidamente em uma árvore e fica seguro enquanto o urso vai embora. Fim da aventura!");
        }
    }

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
