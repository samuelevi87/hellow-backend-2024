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

    private static void dentroDaFloresta() {
        System.out.println("Você entrou na floresta e se depara com um caminho dividido. Você vai para a esquerda ou direita? (esquerda/direita)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("esquerda")) {
            caminhoEsquerda();
        } else {
            caminhoDireita();
        }
    }

    private static void caminhoEsquerda() {
        System.out.println("Você segue pela esquerda e encontra um lago tranquilo. Deseja nadar ou continuar caminhando? (nadar/mergulhar)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("nadar")) {
            System.out.println("Você decide nadar no lago. Enquanto nada, encontra uma chave misteriosa no fundo do lago.");
            finalMisterioso();
        } else {
            System.out.println("Você mergulha no lago e encontra jóias!");
            monstro();
        }
    }
    private static void monstro() {
        System.out.println("Um monstro aparece e lhe pede as jóias de volta, deseja devolver? (devolver/fugir)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("devolver")) {
            System.out.println("Você devolve as jóias e o monstro poupa sua vida, fim de jogo.");
        } else {
            System.out.println("O monstro percebe sua tramóia e te ataca!");
            combate();
        }
    }
    private static void combate() {
        System.out.println("O monstro está indo em sua direção, oque farás? (contra-ataque/desviar)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("contra-ataque")) {
            System.out.println("você tira 2 de Hp do monstro!");
            cara();
        } else {
            System.out.println("o monstro está de costas!");
            ataqueSurpresa();
        }
    }
    private static void cara() {
        System.out.println("Voce está cara-cara com o monstro e ele te dá uma rabada, aproveitar e fugir? (fugir/atacar)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("fugir")) {
            System.out.println("Voce foge e sobrevive, parabéns!");
        } else {
            System.out.println("Você tenta atacar mas o monstro de devora, que azarado!");
        }
    }
    private static void ataqueSurpresa() {
        System.out.println("Ele está de costas! (ataqueSurpresa/fugir)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("ataquesurpresa")) {
            System.out.println("Você esmaga o cranio do monstro e o mata, Parabéns, você está rico!!!");
        } else {
            System.out.println("você foge como um desesperado, haha!");
        }
    }


    private static void caminhoDireita() {
        System.out.println("Você toma o caminho da direita e encontra um urso! Você luta ou tenta correr? (lutar/subir)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("lutar")) {
            System.out.println("você dá um soco no rosto do urso e arranca um de seus dentes!");
            lutaurso();
        } else {
            System.out.println("você na arvore mais proxima");
            cocos();
        }
    }
    private static void lutaurso() {
        System.out.println("Voce tirou 3 hp do urso, ele vai te morder, seja rápido! (soconoolho/chutenofucinho)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("soconoolho")) {
            System.out.println("o urso fica cego, voce tirou 2 hp");
            cego();
        } else {
            System.out.println("você quebra o fucinho do urso e ele foge, fim de combate!");
        }
    }

    private static void cego() {
        System.out.println("o urso está cego. (matar/deixarvivo)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("matar")) {
            System.out.println("Você mata o urso.                                            porém...");
            filhotes();
        } else {
            System.out.println("o urso te cheira e te mata.");
        }
    }

    private static void filhotes() {
        System.out.println("3 filhotes minusculos e indefesos sam dos matos para tentar ajudar sua mãe, estão chorando. (deixarvivo/...)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("deixarvivo")) {
            System.out.println("os filhotes fogem com medo.");
        } else {
            System.out.println("voce os pega pela cabeça, e esmaga. um a um, sem exeções, todos tentam fugir, desesperados, mas você é um monstro, não é?... todos estão mortos...");
            monster();
        }
    }

    private static void monster() {
        System.out.println("você está satisfeito com oque você fez? (sim/não)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("sim")) {
            System.out.println("então você se orgulha?...");
            continuar();
        } else {
            System.out.println("...");
        }
    }
    private static void continuar() {
        System.out.println("você começa a caminhar (continuar/parar)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("continuar")) {
            System.out.println("voce continua correndo");
            continuar();
        } else {
            System.out.println("comi seu cu gostoso");
        }
    }





    private static void cocos() {
        System.out.println("você vê cocos encima de sua cabeça (jogar/esperar)");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("jogar")) {
            System.out.println("você errou e o urso subiu na arvore, você morreu!");
        } else {
            System.out.println("Lol, o urso subiu e voce morreu, medroso!");
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
