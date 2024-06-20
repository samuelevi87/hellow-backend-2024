package estruturaCondicionalRenan.src;

import java.util.Scanner;

/**
 * Classe que contém métodos para resolver diversos desafios condicionais.
 */
public class RenanExerciciosCondicionais {
    
    /**
     * O Dia Perfeito: Analisa as condições climáticas e sugere uma atividade adequada.
     * Se a temperatura for 25 graus ou mais, sugere ir à praia.
     * Se a temperatura for 15 graus ou mais e estiver ensolarado, sugere passear no parque.
     * Caso contrário, sugere ficar em casa.
     */
    public static void diaPerfeito() {
        int temperatura;
        String tempo;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual a temperatura?: ");
        temperatura = entrada.nextInt();
        entrada.nextLine();


        if (temperatura >= 25) {
            System.out.println("É dia de Praia!");
        } else if (temperatura >= 15) {
            System.out.print("Como está o tempo? (ensolarado/chuvoso): ");
            tempo = entrada.nextLine().toLowerCase();
            if (tempo.equals("ensolarado")) {
                System.out.println("Piquenique no Parque!");
            } else {
                System.out.println("Vamos ler um livro em casa!");
            }
        } else {
            System.out.println("Está muito frio. Vamos ler um livro em casa " +
                    "e tomar um chocolate quente!");
        }
        entrada.close();
    }

    /**
     * O Roupeiro Inteligente: Sugere roupas com base na estação do ano.
     * Mostra roupas leves e frescas no verão, opções quentinhas no inverno,
     * e roupas para qualquer clima na primavera e no outono.
     */
    public static void roupeiroInteligente() {
        String estacao;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é a sua estação do ano?(verão/inverno/primavera/outono): ");
        estacao = scan.nextLine().toLowerCase();

        if (estacao.equals("verão")) {
            System.out.println("Dar sugestão para roupas leves e frescas!");
        } else if (estacao.equals("inverno")) {
            System.out.println("Dar sugestão para roupar quentinhas.");
        } else if (estacao.equals("outono") || estacao.equals("outono")) {
            System.out.println("Dar sugestão de roupas para qualquer tipo de clima");
        } else {
            System.out.println("Digite uma opção válida.");
        }
        scan.close();
    }


    /**
     * A Máquina de Doces: Fornece um doce se a senha correta "abracadabra" for inserida.
     * Caso contrário, mostra uma mensagem de erro.
     */
    public static void maquinaDeDoces() {
        String senha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a senha para poder ganhar um docê: ");
        senha = entrada.nextLine().toLowerCase();

        if (senha.equals("abracadabra")) {
            System.out.println("Senha correta!Pegue seu docê.");
        } else {
            System.out.println("Senha incorreta! Tente novamente.");
            maquinaDeDoces();
        }
        entrada.close();
    }

    /**
     * O Gato Misterioso: Determina se a sorte está ao seu lado ou se deve ter cuidado
     * com base na posição do rabo do gato.
     */
    public static void gatoMisterioso() {
        String posiçãoRaboGato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("qual é a posição do rabo do gato?(cima/baixo)");
        posiçãoRaboGato = entrada.nextLine().toLowerCase();

        if (posiçãoRaboGato.equals("cima")) {
            System.out.println("Parabéns! Você está com sorte hoje.");
        } else if (posiçãoRaboGato.equals("baixo")) {
            System.out.println("Que pena! você esta com azar hoje.");
        } else {
            System.out.println("Posição inválida! Tente novamente.");
            gatoMisterioso();
        }
        entrada.close();
    }

    /**
     * A Escolha do Caminho: Decide o caminho a seguir com base na direção indicada pela placa.
     * Direita leva a um rio cristalino e esquerda a um campo florido.
     */
    public static void escolhaDoCaminho() {
        String caminho;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um caminho com base na direção indicada pela placa.(direita/esquerda)");
        caminho = entrada.nextLine().toLowerCase();

        if (caminho.equals("direita")) {
            System.out.println("Você foi para um rio cristalino.");
        } else if (caminho.equals("esquerda")) {
            System.out.println("Você foi para um campo florido");
        } else {
            System.out.println("Direção inválida! Tente Novamente.");
            escolhaDoCaminho();
        }
        entrada.close();
    }

    /**
     * O Sorvete Refrescante: Escolhe o sabor do sorvete com base no sabor favorito de uma amiga.
     */
    public static void sorveteRefrescante() {
        String saborDoSoverte;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o soverte favorito de sua amiga?");
        saborDoSoverte = entrada.nextLine().toLowerCase();

        if (saborDoSoverte.equals("chocolate")) {
            System.out.println("O sorvete que você comprou foi de chocolate.");
        } else if (saborDoSoverte.equals("morango")) {
            System.out.println("O sorvete que você comprou é o de morango.");
        } else if (saborDoSoverte.equals("limão")) {
            System.out.println("Você dividirá um sabor cítrico com ela.");
        } else {
            System.out.println("Sabor inválido! Tente Novamente.");
            sorveteRefrescante();
        }
        entrada.close();
    }

    /**
     * O Livro Encantado: Mostra uma história de aventura em dias pares e de romance em dias ímpares.
     */
    public static void livroEncantado() {
        int dia;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que dia é hoje?: ");
        dia = entrada.nextInt();
        entrada.nextInt();

        if (dia == 2) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 4) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 6) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 8) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 10) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 12) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 14) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 16) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 18) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 20) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 22) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 24) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 26) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 28) {
            System.out.println("Leia uma historia de aventura.");
        } else if (dia == 30) {
            System.out.println("Leia uma historia de aventura.");
        } else {
            System.out.println("leia um livro de romance");
        }
        entrada.close();
    }


    /**
     * A Música Favorita: Cria uma playlist com base no artista favorito inserido.
     */
    public static void musicaFavorita() {
        String musica;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o seu artista favorito?:");
        musica = entrada.nextLine().toLowerCase();

        if (musica.equals("michael jackson")) {
            System.out.println("Ouça uma playlist que te faça dançar!");
        } else if (musica.equals("the beatles")) {
            System.out.println("Ouça uma playlist com musicas classicas para curtir");
        } else if (musica.equals("queen")) {
            System.out.println("Ouça uma playlist com musicas do genero rock!💀");
        } else {
            System.out.println("Artista não detectado! Tente novamente.");
            musicaFavorita();
        } entrada.close();
    }

    /**
     * O Presente Perfeito: Escolhe o presente com base nos interesses do amigo.
     */
    public static void presentePerfeito() {
        String presente;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é a atividade que seu amigo é apaixonado?: ");
        presente = entrada.nextLine().toLowerCase();

        if (presente.equals("esporte")) {
            System.out.println("Compre um tênis ou uma bola.");
        } else if (presente.equals("ler")) {
            System.out.println("Um livro será a opção perfeita para você comprar para ele.");
        } else if (presente.equals("jogos")) {
            System.out.println("Compre um videogame, para deixar-lo feliz");
        } else {
            System.out.println("Atividade não encontrada. Tente novamente.");
        }
    }

    /**
     * O Animal Falante: Interage com diferentes animais falantes e descobre suas mensagens.
     */
    public static void animalFalante() {
        String animal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o animal falantes que está na floresta?");
        animal = entrada.nextLine().toLowerCase();

        if (animal.equals("papagaio")) {
            System.out.println("Ele te conta piadas engraçadas para te fazer rir até a barriga doer");
        } else if (animal.equals("macaco")) {
            System.out.println("Ele te ensinará a escalar as árvores mais altas da floresta com maestria.");
        } else if (animal.equals("elefante")) {
            System.out.println("Ele te levará para um passeio inesquecível em suas costas, mostrando as maravilhas da floresta.");
        } else {
            System.out.println("Animal inválido. Tente novamente!");
            animalFalante();
        } entrada.close();
    }
}