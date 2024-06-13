import javax.swing.*;
import java.util.Scanner;

/**
 * Classe que contém métodos para resolver diversos desafios condicionais.
 */
public class LucasExerciciosCondicionais {

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
        System.out.println("Como esta o tempo?: (ensolarado/chuvoso)");
        tempo = entrada.nextLine().toLowerCase();

        if (temperatura >= 25) {
            System.out.println("É dia de Praia!");
        } else if (temperatura >= 15 && tempo.equals("ensolarado")) {
            System.out.println("Piquenique no Parque!");
        } else {
            System.out.println("Vamos ler um livro em casa!" + "e tomar um chocolate quente!");

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
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a estacao do ano: (Verão/Inverno/Outono/Primavera)");
        estacao = entrada.nextLine().toLowerCase();

        if (estacao.equals("verão")) {
            System.out.println("Usar roupas leves");

        } else if (estacao.equals("inverno")) {
            System.out.println("Usar roupas quentinhas");

        } else if (estacao.equals("outono") || estacao.equals("primavera")) {
            System.out.println("Usar qualquer roupa de sua preferência");

        } else {
            System.out.println("Escolha uma opção valida.Tente de novo");
            roupeiroInteligente();
        }
        entrada.close();
    }

    /**
     * A Máquina de Doces: Fornece um doce se a senha correta "abracadabra" for inserida.
     * Caso contrário, mostra uma mensagem de erro.
     */
    public static void maquinaDeDoces() {
        String senha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a senha correta?");
        senha = entrada.nextLine().toLowerCase();

        if (senha.equals("abracadabra")) {
            System.out.println("Senha correta");

        } else {
            System.out.println("Senha incorreta.Tente de novo");
            maquinaDeDoces();
        }entrada.close();
    }

    /**
     * O Gato Misterioso: Determina se a sorte está ao seu lado ou se deve ter cuidado
     * com base na posição do rabo do gato.
     */
    public static void gatoMisterioso() {
        String posicao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a posição do rabo do gato (alto/baixo)");
        posicao = entrada.nextLine().toLowerCase();

        if (posicao.equals("alto")) {
            System.out.println("Você esta com sorte");

        } else if (posicao.equals("baixo")){
            System.out.println("Você esta sem sorte");

        }else {
            System.out.println("Avise a posição do rabo certo.Tente denovo");
            gatoMisterioso();
        }entrada.close();
    }


        /**
         * A Escolha do Caminho: Decide o caminho a seguir com base na direção indicada pela placa.
         * Direita leva a um rio cristalino e esquerda a um campo florido.
         */
        public static void escolhaDoCaminho () {
            String caminho;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Qual caminho você quer ir (direita/esquerda)");
            caminho = entrada.nextLine().toLowerCase();

            if (caminho.equals("direita")) {
                System.out.println("Você chegou em um rio cristalino");

            } else if (caminho.equals("esquerda")){
            System.out.println("Você chegou em um campo florido");

            }else {
                System.out.println("Avise o caminho certo.Tente denovo");
                escolhaDoCaminho();
            }entrada.close();

        }

        /**
         * O Sorvete Refrescante: Escolhe o sabor do sorvete com base no sabor favorito de uma amiga.
         */
        public static void sorveteRefrescante () {
        String sorvete;
        Scanner entrada = new Scanner(System.in);

            System.out.println("Qual o sabor de sorvete");
            sorvete = entrada.nextLine().toLowerCase();

            if (sorvete.equals("chocolate")){
                System.out.println("Esse é meu sabor preferido");

            } else if (sorvete.equals("Morango")){
                System.out.println("Não gosto desse sabor");
            }entrada.close();
        }

        /**
         * O Livro Encantado: Mostra uma história de aventura em dias pares e de romance em dias ímpares.
         */
        public static void livroEncantado () {

        }

        /**
         * A Música Favorita: Cria uma playlist com base no artista favorito inserido.
         */
        public static void musicaFavorita () {

        }

        /**
         * O Presente Perfeito: Escolhe o presente com base nos interesses do amigo.
         */
        public static void presentePerfeito () {

        }

        /**
         * O Animal Falante: Interage com diferentes animais falantes e descobre suas mensagens.
         */
        public static void animalFalante () {

        }
    }
