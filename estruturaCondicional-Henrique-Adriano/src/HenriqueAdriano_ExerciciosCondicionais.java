import java.util.Scanner;

/**
 * Classe que contém métodos para resolver diversos desafios condicionais.
 */
public class HenriqueAdriano_ExerciciosCondicionais {

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

        System.out.println("Qual a temperatura?: ");
        temperatura = entrada.nextInt();

        System.out.println("Como está o tempo?(ensolarado/chuvoso):");
        tempo = entrada.nextLine().toLowerCase();

        if (temperatura >= 25){
            System.out.println("Está quente, é dia de praia!");

        } else if (temperatura >= 15 && tempo.equals("ensolarado")) {
            System.out.println("O tempo está ótimo para ir ao Parque.");

        } else {
            System.out.println("Fique em casa, o tempo não está bom para sair.");
        }entrada.close();

    }

    /**
     * O Roupeiro Inteligente: Sugere roupas com base na estação do ano.
     * Mostra roupas leves e frescas no verão, opções quentinhas no inverno,
     * e roupas para qualquer clima na primavera e no outono.
     */
    public static void roupeiroInteligente() {
        String estacao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a estação do ano?(Verão/Inverno/Outono/Primavera");
        estacao = entrada.nextLine().toLowerCase();

        if (estacao.equals("verão")){
            System.out.println("Use roupas curtas como shorts e blusa de manga curta");

        } else if (estacao.equals("inverno")){
            System.out.println("Use roupas quentes como calças e casacos");

        } else if (estacao.equals("primavera")||estacao.equals("outono")){
            System.out.println("Use roupas de sua escolha");
        }entrada.close();

    }

    /**
     * A Máquina de Doces: Fornece um doce se a senha correta "abracadabra" for inserida.
     * Caso contrário, mostra uma mensagem de erro.
     */
    public static void maquinaDeDoces() {
        String senha;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a senha da máquina?");
        senha = entrada.nextLine().toLowerCase();

        if (senha.equals("abracadabra")){
            System.out.println("Você acertou a senha!(despeja um doce)");

        } else {
            System.out.println("Você errou a senha.");
        }entrada.close();

    }

    /**
     * O Gato Misterioso: Determina se a sorte está ao seu lado ou se deve ter cuidado
     * com base na posição do rabo do gato.
     */
    public static void gatoMisterioso() {
        String raboGato;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a posição do rabo do gato?(Baixo/Alto).");
        raboGato = entrada.nextLine().toLowerCase();

        if (raboGato.equals("baixo")){
            System.out.println("Você está com azar, o rabo do gato está baixo.");

        }else if (raboGato.equals("alto")){
            System.out.println("Você está com sorte! O rabo do gato está alto");
        }entrada.close();
    }

    /**
     * A Escolha do Caminho: Decide o caminho a seguir com base na direção indicada pela placa.
     * Direita leva a um rio cristalino e esquerda a um campo florido.
     */
    public static void escolhaDoCaminho() {
        String caminho;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a direção da placa você seguirá?(Esquerda/Direita)");
        caminho = entrada.nextLine().toLowerCase();

        if (entrada.equals("esquerda")){
            System.out.println("Você chegou a um campo cristalino");

        }else if (entrada.equals("direita"));
        {
            System.out.println("Você chegou a um lago cristalino");
        }entrada.close();

    }

    /**
     * O Sorvete Refrescante: Escolhe o sabor do sorvete com base no sabor favorito de uma amiga.
     */
    public static void sorveteRefrescante() {
        String saborSorvete;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o sabor favorito de seu amigo(a)?");
        saborSorvete = entrada.nextLine().toLowerCase();

        System.out.println("O sabor do sorvete é " + saborSorvete);
        entrada.close();
    }

    /**
     * O Livro Encantado: Mostra uma história de aventura em dias pares e de romance em dias ímpares.
     */
    public static void livroEncantado() {
        String dias;
        Scanner entrada = new Scanner(System.in);

        System.out.println("O dia atual é par ou impar?");
        dias = entrada.nextLine().toLowerCase();

        if (dias.equals("par")) {
            System.out.println("Leia Percy Jackson");

        }else if (dias.equals("impar")){
            System.out.println("Leia Turma da Mónica Jovem");
        }entrada.close();
    }

    /**
     * A Música Favorita: Cria uma playlist com base no artista favorito inserido.
     */
    public static void musicaFavorita() {
        String artistaFav;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual desses é seu artista favorito?(Eminem/Michael Jackson/Bruno Mars/Justin Bieber");
        artistaFav = entrada.nextLine().toLowerCase();

        if (artistaFav.equals("emine")){
            System.out.println("Escute:Rap god, godzilla e Lose Yourself");

        }else if (artistaFav.equals("michael jackson")){
            System.out.println("Escute:Thriller, Billy Jeans e Beat it");

        }else if (artistaFav.equals("bruno mars")){
        System.out.println("Escute:Treasure, Count on me e Talking to the Moon");

    }else if (artistaFav.equals("justin bieber")){
        System.out.println("Escute:Ghost, Love Me e Never say Never");

    }entrada.close();
    }

    /**
     * O Presente Perfeito: Escolhe o presente com base nos interesses do amigo.
     */
    public static void presentePerfeito() {
        String interesse;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o interesse de seu amigo(a)?(Technologia/Arte/Anime)");
        interesse = entrada.nextLine().toLowerCase();

        if (interesse.equals("technologia")){
            System.out.println("Você deve comprar um celular ou um computador.");

        }else if (interesse.equals("arte")){
            System.out.println("Você deve comprar um kit de desenho ou uma mesa de desenho digital.");

        }else if (interesse.equals("anime")){
            System.out.println("Você deve comprar um manga ou uma action fígure.");

        }entrada.close();
    }

    /**
     * O Animal Falante: Interage com diferentes animais falantes e descobre suas mensagens.
     */
    public static void animalFalante() {
        String animal;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o animal você escolhe?(Baleia/Anta/Avestruz/Ornitorrinco");
        animal = entrada.nextLine().toLowerCase();

        if (animal.equals("baleia")) {
            System.out.println("A baleia-azul alimenta-se de, aproximadamente, oito toneladas de krill diariamente." +
                    "A baleia-azul é o maior animal do mundo, apresentando até 33 metros de comprimento e mais de 140 toneladas.");
        } else if (animal.equals("anta")) {
            System.out.println("As Antas têm a capacidade de nadar e mergulhar em rios e lagos, o que a torna uma excelente nadadora.");

        } else if (animal.equals("avestruz")) {
            System.out.println("O avestruz não voa e, por isso, desenvolveu pernas muito fortes, capazes de dar arrancadas muito rápidas quando necessário.");

        } else if (animal.equals("ornitorrinco")) {
            System.out.println("Ornitorrincos são animais que podem viver até 20 anos na natureza." +
                    "Eles não possuem estômagos.Seus pelos brilham sob a luz negra.");
        }entrada.close();
    }
}