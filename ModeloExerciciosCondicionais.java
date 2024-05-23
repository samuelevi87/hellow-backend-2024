import java.io.InputStream;
import java.util.Scanner;

/**
 * Classe que contém métodos para resolver diversos desafios condicionais.
 */
public class ModeloExerciciosCondicionais {

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
    public void roupeiroInteligente() {
String estacao;
Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a estação do ano?");
        estacao = entrada.nextLine();
        if (estacao.equals("verão")) {
            System.out.println("Roupas leves");
        } else if (estacao.equals("Inverno")) {
            System.out.println("Roupas quentes");
        }else if (estacao.equals("Primavera")) {
            System.out.println("Use roupas para qualquer clima");
        }else {
            System.out.println("Use roupas para qualquer clima");
        }entrada.close();

           }

    }

    /**
     * A Máquina de Doces: Fornece um doce se a senha correta "abracadabra" for inserida.
     * Caso contrário, mostra uma mensagem de erro.
     */
    public void maquinaDeDoces() {

    }

    /**
     * O Gato Misterioso: Determina se a sorte está ao seu lado ou se deve ter cuidado
     * com base na posição do rabo do gato.
     */
    public void gatoMisterioso() {
        Boolean posicao;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Qual a posição do  rabo do gato?");
        posicao = entrada.nextBoolean();


        }

    /**
     * A Escolha do Caminho: Decide o caminho a seguir com base na direção indicada pela placa.
     * Direita leva a um rio cristalino e esquerda a um campo florido.
     */
    public void escolhaDoCaminho() {

    }

    /**
     * O Sorvete Refrescante: Escolhe o sabor do sorvete com base no sabor favorito de uma amiga.
     */
    public void sorveteRefrescante() {

    }

    /**
     * O Livro Encantado: Mostra uma história de aventura em dias pares e de romance em dias ímpares.
     */
    public void livroEncantado() {

    }

    /**
     * A Música Favorita: Cria uma playlist com base no artista favorito inserido.
     */
    public void musicaFavorita() {

    }

    /**
     * O Presente Perfeito: Escolhe o presente com base nos interesses do amigo.
     */
    public void presentePerfeito() {

    }

    /**
     * O Animal Falante: Interage com diferentes animais falantes e descobre suas mensagens.
     */
    public void animalFalante() {

    }
}
