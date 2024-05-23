package estruturaCondicionalJezreel.src;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Classe que contém métodos para resolver diversos desafios condicionais.
 */
public class JezreelExerciciosCondicionais {

    /**
     * O Dia Perfeito: Analisa as condições climáticas e sugere uma atividade adequada.
     * Se a temperatura for 25 graus ou mais, sugere ir à praia.
     * Se a temperatura for 15 graus ou mais e estiver ensolarado, sugere passear no parque.
     * Caso contrário, sugere ficar em casa.
     */
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

        if (estacao.equals("verão")){
            System.out.println("Dar sugestão para roupas leves e frescas!");
        } else if (estacao.equals("inverno")) {
            System.out.println("Dar sugestão para roupar quentinhas.");
        } else if (estacao.equals("outono") || estacao.equals("outono")) {
            System.out.println("Dar sugestão de roupas para qualquer tipo de clima");
        } else {
            System.out.println("Digite uma opção válida.");
        }scan.close();
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

        if (senha.equals("abracadabra")){
            System.out.println("Senha correta!Pegue seu docê.");
        } else {
            System.out.println("Senha incorreta! Tente novamente.");
            maquinaDeDoces();
        } entrada.close();
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
        } entrada.close();
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
        } entrada.close();
    }

    /**
     * O Sorvete Refrescante: Escolhe o sabor do sorvete com base no sabor favorito de uma amiga.
     */
    public static void sorveteRefrescante() {

    }

    /**
     * O Livro Encantado: Mostra uma história de aventura em dias pares e de romance em dias ímpares.
     */
    public static void livroEncantado() {

    }

    /**
     * A Música Favorita: Cria uma playlist com base no artista favorito inserido.
     */
    public static void musicaFavorita() {

    }

    /**
     * O Presente Perfeito: Escolhe o presente com base nos interesses do amigo.
     */
    public static void presentePerfeito() {

    }

    /**
     * O Animal Falante: Interage com diferentes animais falantes e descobre suas mensagens.
     */
    public static void animalFalante() {

    }
}