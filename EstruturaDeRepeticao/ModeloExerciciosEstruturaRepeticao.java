package EstruturaDeRepeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe contendo desafios interativos com loops while e for para o aprendizado de programação Java.
 */
public class ModeloExerciciosEstruturaRepeticao {

    /**
     * Método principal que apresenta um menu de desafios e executa o escolhido pelo usuário.
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Scanner entradaDoTeclado = new Scanner(System.in);

        System.out.println("Escolha um desafio:");
        System.out.println("1. Contagem Regressiva Espacial");
        System.out.println("2. Tabuada Divertida");
        System.out.println("3. Caça ao Tesouro");
        System.out.println("4. Desenhando um Quadrado");
        System.out.println("5. Corrida de Caracóis");
        System.out.println("6. Fábrica de Chocolates");
        System.out.println("7. Crie sua Playlist");
        System.out.println("8. Jogo da Adivinhação");
        System.out.println("9. Contador de Vogais");
        System.out.println("10. Calculadora de Média");

        int escolha = entradaDoTeclado.nextInt();
        entradaDoTeclado.nextLine(); // Limpar o buffer

        switch (escolha) {
            case 1: contagemRegressivaEspacial(); break;
            case 2: tabuadaDivertida(entradaDoTeclado); break;
            case 3: cacaAoTesouro(entradaDoTeclado); break;
            case 4: desenhoQuadrado(entradaDoTeclado); break;
            case 5: corridaCaracois(); break;
            case 6: fabricaChocolates(entradaDoTeclado); break;
            case 7: criarPlaylist(entradaDoTeclado); break;
            case 8: jogoAdivinhacao(entradaDoTeclado); break;
            case 9: contadorVogais(entradaDoTeclado); break;
            case 10: calculadoraMedia(entradaDoTeclado); break;
            default: System.out.println("Escolha inválida!");
        }

        entradaDoTeclado.close();
    }

    /**
     * Simula uma contagem regressiva espacial de 10 a 0 com um loop while.
     */
    public static void contagemRegressivaEspacial() {

    }

    /**
     * Calcula e exibe a tabuada de um número fornecido pelo usuário.
     * @param entradaDoTeclado Objeto Scanner para leitura da entrada do usuário.
     */
    public static void tabuadaDivertida(Scanner entradaDoTeclado) {

    }

    /**
     * Jogo de adivinhação onde o usuário tenta descobrir um número secreto entre 1 e 100.
     * @param entradaDoTeclado Objeto Scanner para leitura da entrada do usuário.
     */
    public static void cacaAoTesouro(Scanner entradaDoTeclado) {

    }

    /**
     * Desenha um quadrado de asteriscos no console, com o tamanho do lado definido pelo usuário.
     * @param entradaDoTeclado Objeto Scanner para leitura da entrada do usuário.
     */
    public static void desenhoQuadrado(Scanner entradaDoTeclado) {

    }

    /**
     * Simula uma corrida de dois caracóis, onde cada um avança um número aleatório de casas a cada iteração.
     */
    public static void corridaCaracois() {

    }

    /**
     * Simula a produção de chocolates em uma fábrica, escolhendo aleatoriamente a cor de cada chocolate.
     * @param entradaDoTeclado Objeto Scanner para leitura da entrada do usuário.
     */
    public static void fabricaChocolates(Scanner entradaDoTeclado) {

    }

    /**
     * Permite ao usuário criar uma playlist digitando os nomes das músicas.
     * @param entradaDoTeclado Objeto Scanner para leitura da entrada do usuário.
     */
    public static void criarPlaylist(Scanner entradaDoTeclado) {

    }

    /**
     * Jogo de adivinhação onde o usuário tenta descobrir um número secreto entre 1 e 100.
     * @param entradaDoTeclado Objeto Scanner para leitura da entrada do usuário.
     */
    public static void jogoAdivinhacao(Scanner entradaDoTeclado) {

    }

    /**
     * Conta o número de vogais em uma frase fornecida pelo usuário.
     * @param entradaDoTeclado Objeto Scanner para leitura da entrada do usuário.
     */
    public static void contadorVogais(Scanner entradaDoTeclado) {

    }

    /**
     * Calcula a média de notas fornecidas pelo usuário.
     * @param entradaDoTeclado Objeto Scanner para leitura da entrada do usuário.
     */
    public static void calculadoraMedia(Scanner entradaDoTeclado) {

    }
}
