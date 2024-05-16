package EstruturaDeRepeticao;

import java.util.Random;
import java.util.Scanner;

/**
 * Jogo de aventura interativo que ensina o uso de loops while e for em Java.
 * @author Samuel Levi Araújo Alves @see <a href="https://www.linkedin.com/in/samuel-levi-alves/">samuel-levi-alves</a>
 * @version 1.0.0
 */
public class JogoAventuraLoops {

    private static Scanner entradaDoTeclado = new Scanner(System.in);
    private static Random numeroAleatorio = new Random();
    private static int frutasColetadas = 0;
    private static boolean chaveEncontrada = true;
    private static int passosLabirinto = 0;
    private static int posicaoX = 0;
    private static int posicaoY = 0;

    /**
     * Método principal que inicia o jogo e guia o jogador pela aventura.
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) throws InterruptedException {
        introducao();
        florestaEncantada();

        if (frutasColetadas >= 20) { // Verifica se o jogador coletou frutas suficientes para prosseguir
            cavernaDesafios();

            if (chaveEncontrada) { // Verifica se o jogador encontrou a chave na caverna
                labirintoTempo();
            }
        }

        if (passosLabirinto < 50) { // Verifica se o jogador saiu do labirinto a tempo
            torreMago();
        }
    }

    /**
     * Apresenta a introdução da história do jogo com delays para facilitar a leitura.
     * @throws InterruptedException Para lidar com interrupções durante o delay.
     */
    private static void introducao() throws InterruptedException {
        System.out.println("Bem-vindo ao Reino dos Loops!");
        Thread.sleep(100);
        System.out.println("Você é um aventureiro em busca do tesouro perdido.");
        Thread.sleep(100);
        System.out.println("Prepare-se para enfrentar desafios e desvendar mistérios usando o poder dos loops!");
        Thread.sleep(200);
    }

    /**
     * Apresenta a Floresta Encantada e seus desafios com loops.
     * @throws InterruptedException Para lidar com interrupções durante o delay.
     */
    private static void florestaEncantada() throws InterruptedException {
        System.out.println("\nVocê chegou na esquina da sua rua. Escolha um caminho:");
        Thread.sleep(1000);
        System.out.println("1. Voltar para Casa");
        System.out.println("2. ir para a Escola");
        System.out.println("3. ir para a LanHouse");

        int escolha = entradaDoTeclado.nextInt();
        entradaDoTeclado.nextLine(); // Limpar o buffer

        switch (escolha) {
            case 1: coletarFrutas(); break;
            case 2: atravessarRio(); break;
            case 3: desviarObstaculos(); break;
            default: System.out.println("Escolha inválida! Tente novamente."); florestaEncantada(); // Reinicia a escolha se inválida
        }
    }

    /**
     * Desafio da Floresta Encantada: coletar 10 frutas mágicas usando um loop for.
     * Demonstra o funcionamento de um loop for com um exemplo prático.
     */
    private static void coletarFrutas() throws InterruptedException {
        System.out.println("\nVocê quiz ir para casa.");
        Thread.sleep(1000); // Delay para dar tempo de leitura
        System.out.println("Seu Pai te viu e ficou Bravo com Você! colete Frutas para deixa-lo feliz");
        Thread.sleep(1500);

        System.out.println("\n** Prepare-se para chutar a fruteira! **\n");
        Thread.sleep(2000);
        System.out.println("A cada chute, vai cair uma fruta.");
        Thread.sleep(2000);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Você pegou uma Fruta! (" + i + "/20)");
            frutasColetadas++;
            Thread.sleep(10); // Delay para visualizar a coleta
        }

        System.out.println("\nParabéns! Você coletou todas as frutas e deixou seu pai feliz!");
        labirintoTempo();
    }

    /**
     *
     *
     */
    private static void atravessarRio() throws InterruptedException {
        System.out.println("\nVocê escolheu a escola.");
        Thread.sleep(1000);
        System.out.println("Precisa destruir as matérias.");
        Thread.sleep(1500);

        int tempo = 0;
        boolean atravessou = false;

        while (!atravessou) {
            tempo += numeroAleatorio.nextInt(4) + 1; // Avança o tempo em 1 a 4 segundos
            if (tempo % 3 == 0) { // Verifica se passou um múltiplo de 3 segundos
                System.out.println("Destrua o montro/professor!");
                if (numeroAleatorio.nextBoolean()) { // 50% de chance de sucesso
                    atravessou = true;
                    System.out.println("Você destruiu os monstros!");
                } else {
                    System.out.println("Você foi forçado a copiar um livro inteiro, tente novamente!");
                    tempo = 0; // Reinicia o tempo
                }
            }
        }
        // ... (continuação da aventura)
    }

    /**
     * Desafio da escola: ...
     * Utiliza um loop while com condição de parada aleatória para simular os obstáculos.
     */
    private static void desviarObstaculos() throws InterruptedException {
        System.out.println("\nVocê escolheu a LanHouse.");
        Thread.sleep(1500);
        System.out.println("Mate seus amigos no Kour.io!!!");
        Thread.sleep(2000);

        int distancia = 0;
        boolean encontrouObstaculo = false;

        while (!encontrouObstaculo && distancia < 50) { // Distância máxima a percorrer
            distancia += numeroAleatorio.nextInt(5) + 1; // Avança de 1 a 5 metros
            if (numeroAleatorio.nextInt(10) < 3) { // 30% de chance de encontrar um obstáculo
                encontrouObstaculo = true;
                System.out.println("Seu amigo acertou um Hs. você morreu!!!");
            } else {
                System.out.println("Você matou " + distancia + " inimigos!!!");
            }
        }

        if (!encontrouObstaculo) {
            System.out.println("Parabéns! Você ficou em Tp1!!!");
        }
        // ... (continuação da aventura)
    }

    /**
     * Apresenta a Caverna dos Desafios e seus enigmas com loops.
     */
    private static void cavernaDesafios() throws InterruptedException {
        System.out.println("\nVocê começou uma GunMode. Escolha um lado para seguir:");
        Thread.sleep(1000);
        System.out.println("1. corredor direito");
        System.out.println("2. corredor esquerdo");
        System.out.println("3. Meio");

        int escolha = entradaDoTeclado.nextInt();
        entradaDoTeclado.nextLine(); // Limpar o buffer

        switch (escolha) {
            case 1: salaFechadura(); break;
            case 2: salaBlocos(); break;
            case 3: salaMensagemSecreta(); break;
            default: System.out.println("Escolha inválida! Tente novamente."); cavernaDesafios();
        }
    }

    /**
     * Desafio da Caverna dos Desafios: encontrar a combinação de uma fechadura testando diferentes números.
     * Utiliza um loop for para iterar pelas possíveis combinações.
     */
    private static void salaFechadura() throws InterruptedException {
        System.out.println("\nVocê foi pela lado direito, advinhe o possível pixel em que seu amigo sniper pode estar.");
        Thread.sleep(3000);
        System.out.println("tem 3 sky's, com pixels entre 1 e 2.");
        Thread.sleep(2000);

        int[] combinacao = {numeroAleatorio.nextInt(2) + 1, numeroAleatorio.nextInt(2) + 1, numeroAleatorio.nextInt(2) + 1};
        int[] palpite = new int[3];

        while (true) {
            System.out.println("Digite os 3 números da Sky's Pixel (separados por espaço):");
            for (int i = 0; i < 3; i++) {
                palpite[i] = entradaDoTeclado.nextInt();
            }

            if (palpite[0] == combinacao[0] && palpite[1] == combinacao[1] && palpite[2] == combinacao[2]) {
                System.out.println("Parabéns! Você pegou o Sniper!!!");
                chaveEncontrada = true; // Encontra a chave para usar mais tarde
                break;
            } else {
                System.out.println("O sniper te Matou, Newba!!!");
            }
        }
        // ... (continuação da aventura)
    }

    /**
     * Desafio da Caverna dos Desafios: mover blocos para abrir um caminho.
     * Utiliza um loop while com um contador para controlar o número de movimentos.
     * Demonstra o funcionamento de um loop while com um exemplo prático.
     */
    private static void salaBlocos() throws InterruptedException {
        System.out.println("\nVocê entrou na Sala dos Blocos.");
        Thread.sleep(1000); // Delay para dar tempo de leitura
        System.out.println("Mova os blocos para abrir o caminho! (digite 'frente', 'tras', 'esquerda' ou 'direita'):");
        Thread.sleep(2000);

        System.out.println("\n** Prepare-se para usar o poder do loop while! **\n");
        Thread.sleep(2000);
        System.out.println("Enquanto o caminho não estiver aberto e você tiver movimentos, o loop continuará...");
        Thread.sleep(2000);

        int movimentosRestantes = 1000;
        boolean caminhoAberto = false;
        int posicaoBlocoX = 3; // Posição inicial do bloco
        int posicaoBlocoY = 2;

        while (movimentosRestantes > 0 && !caminhoAberto) {
            System.out.println("\nMovimentos restantes: " + movimentosRestantes); // Informa os movimentos restantes
            String direcao = entradaDoTeclado.nextLine().toLowerCase();
            switch (direcao) {
                case "frente":
                    posicaoBlocoY--;
                    break;
                case "tras":
                    posicaoBlocoY++;
                    break;
                case "esquerda":
                    posicaoBlocoX--;
                    break;
                case "direita":
                    posicaoBlocoX++;
                    break;
                default:
                    System.out.println("Direção inválida! Tente novamente.");
                    continue; // Volta para o início do loop
            }

            System.out.println("Você moveu o bloco para " + direcao + ". Agora ele está na Posição X/Y: "+ posicaoBlocoX+"/"+posicaoBlocoY);
            movimentosRestantes--;

            // Lógica para verificar se o caminho foi aberto
            if (posicaoBlocoX == 5 && posicaoBlocoY == 0) {
                caminhoAberto = true;
            }
        }

        if (caminhoAberto) {
            System.out.println("Parabéns! Você abriu o caminho!");
        } else {
            System.out.println("Você não conseguiu abrir o caminho a tempo!");
        }
        // ... (continuação da aventura)
    }

    /**
     * Desafio da Caverna dos Desafios: decifrar uma mensagem secreta escrita em um código numérico.
     * Utiliza um loop for para percorrer a mensagem e decodificá-la.
     */
    private static void salaMensagemSecreta() throws InterruptedException {
        System.out.println("\nVocê entrou na Sala da Mensagem Secreta.");
        Thread.sleep(1000);
        System.out.println("Decifre a mensagem para continuar!");
        Thread.sleep(2000);

        String mensagemCodificada = "19 21 12 1 20 15"; // Exemplo de mensagem codificada
        String mensagemDecifrada = "";

        for (String codigo : mensagemCodificada.split(" ")) {
            int numero = Integer.parseInt(codigo);
            char letra = (char) (numero + 64); // Decodifica o número em letra (A=1, B=2, etc.)
            mensagemDecifrada += letra;
        }

        System.out.println("A mensagem decifrada é: " + mensagemDecifrada);
        // ... (continuação da aventura)
    }

    /**
     * Desafio do Labirinto do Tempo: encontrar a saída do labirinto.
     * Utiliza um loop while para controlar os movimentos do jogador até encontrar a saída.
     */
    private static void labirintoTempo() throws InterruptedException {
        System.out.println("\nVocê entrou No Valorant por um código. Você chegou no Bomb A.");
        Thread.sleep(1000);
        System.out.println("Encontre a Spike antes que o tempo acabe!");
        Thread.sleep(2000);

        System.out.println("\n** Prepare-se para usar o Tp do Omen!!! **\n");
        Thread.sleep(2000);
        System.out.println("Enquanto você não encontrar a Spike e ainda tiver Tp's, A Spike continuará...");
        Thread.sleep(2000);

        boolean encontrouSaida = false;
        int limitePassos = 2000;

        while (!encontrouSaida && passosLabirinto < limitePassos) {
            System.out.println("\nPassos restantes: " + (limitePassos - passosLabirinto));
            System.out.println("Escolha uma direção (frente, tras, esquerda, direita):");
            String direcao = entradaDoTeclado.nextLine().toLowerCase();
            passosLabirinto++;

            switch (direcao) {
                case "frente":
                    posicaoY++;
                    break;
                case "tras":
                    posicaoY--;
                    break;
                case "esquerda":
                    posicaoX--;
                    break;
                case "direita":
                    posicaoX++;
                    break;
                default:
                    System.out.println("Direção inválida! Tente novamente.");
                    passosLabirinto--; // Não conta o movimento inválido
                    continue;
            }

            // Lógica para verificar se o jogador encontrou a saída (exemplo)
            if (posicaoX == 5 && posicaoY == 5) {
                encontrouSaida = true;
            } else {
                System.out.println("Você ainda está no labirinto.");
            }
        }

        if (encontrouSaida) {
            System.out.println("Parabéns! Você encontrou a Spike e defusou!!!");
            salaBlocos();
        } else {
            System.out.println("O tempo acabou! A Spike detonou e Você perdeu o round.");
        }
        // ... (continuação da aventura)
    }

    /**
     * Desafio da Torre do Mago: decifrar um código secreto usando um loop for.
     */
    private static void torreMago() throws InterruptedException {
        System.out.println("\nVocê chegou à Torre do Mago.");
        Thread.sleep(1000);
        System.out.println("Decifre o código secreto para derrotar o mago e conseguir o tesouro!");
        Thread.sleep(2000);

        System.out.println("\n** Prepare-se para usar o poder do loop for! **\n");
        Thread.sleep(2000);
        System.out.println("O loop for te ajudará a testar cada número do código...");
        Thread.sleep(2000);

        int[] codigoSecreto = {2, 4, 8, 16, 32}; // Exemplo de código secreto
        int[] palpite = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do código: ");
            palpite[i] = entradaDoTeclado.nextInt();
        }

        boolean codigoCorreto = true;
        for (int i = 0; i < 5; i++) {
            if (palpite[i] != codigoSecreto[i]) {
                codigoCorreto = false;
                break;
            }
        }

        if (codigoCorreto) {
            System.out.println("Parabéns! Você decifrou o código e derrotou o mago!");
            System.out.println("Você encontrou o tesouro e venceu o jogo! 🏆");
        } else {
            System.out.println("Código incorreto! O mago te derrotou.");
        }
    }

}
