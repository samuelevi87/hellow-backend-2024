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
            System.out.println("Você decidiu não entrar na floresta e foi para casa. Você esta seguro!");
        }
    }

    private static void dentroDaFloresta() {
        System.out.println("Você entrou na floresta e se depara com um caminho dividido. Você vai para a esquerda ou direita? (direita/esquerda)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("esquerda")) {
            caminhoEsquerda();
        } else {
            caminhoDireita();

        }
    }

    private static void caminhoEsquerda() {
        System.out.println("Você segue pela céu e encontra um lago tranquilo. Deseja nadar ou continuar caminhando? (nadar/continuar)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("nadar")) {
            System.out.println("Você decide nadar no lago. Porém lembra que não sabe nadar. Você foi encontrado uma semana depois morto no fundo do lago.");
        } else {
            System.out.println("Você continua caminhando e eventualmente encontra uma chave.");
            finalMisterioso();
        }
    }

    private static void caminhoDireita() {
        System.out.println("Você toma o caminho da direita e encontra um bolsonaro de calçinha! Você corre ou tenta subir em uma árvore? (correr/subir)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("correr")) {
            System.out.println("Você tenta correr,mas o bolsonaro de calçinha é mais rapido. Fim da aventura!");
        } else {
            System.out.println("Você sobe rapidamente em uma árvore e fica seguro enquanto o bolsonaro...... você morreu, fim da aventura!");
        }
    }

    private static void finalMisterioso() {
        System.out.println("Você explora a área ao redor do lago e descobre uma pequena cabana trancada. Usar a chave encontrada? (sim/não)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("sim")) {
            System.out.println("Você usa a chave para abrir a cabana e encontra uma caixa com um pc novo! Parabéns , fim da aventura com sucesso!");
        } else {
            System.out.println("Você decide deixar o mistério para trás e retorna para casa. Fim da aventura!");
        }
    }
}
