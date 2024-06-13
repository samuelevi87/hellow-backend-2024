import java.util.Scanner;

/**
 * Classe que contém métodos para resolver diversos desafios condicionais.
 */
public class JoaoBressaniniExerciciosCondicionais {

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
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual estação estamos?(verão/inverno/primavera/outono)");
        estacao = entrada.nextLine().toLowerCase();
        if (estacao.equals("verão")) {
            System.out.println("Mostrar opções de roupas leves e frescas!");

        } else if (estacao.equals("inverno")) {
            System.out.println("Apresentar opções quentinhas!");

        } else if (estacao.equals("primavera") || estacao.equals("outono")) {
            System.out.println("Mostrar opções para todos os tipos de clima!");

        } else {
            System.out.println("Escolha uma opção valida!");
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
        System.out.println("Qual a senha secreta?");
        senha = entrada.nextLine().toLowerCase();
        if (senha.equals("abracadabra")) {
            System.out.println("Parabéns,senha correta, pegue um doce!");
        } else {
            System.out.println("A senha esta incorreta, tente novamente!");
            maquinaDeDoces();
        }
        entrada.close();

    }

    /**
     * O Gato Misterioso: Determina se a sorte está ao seu lado ou se deve ter cuidado
     * com base na posição do rabo do gato.
     */
    public static void gatoMisterioso() {
        String pocicao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a pocição do rabo do gato?(Alto/Baixo)");
        pocicao = entrada.nextLine().toLowerCase();

        if (pocicao.equals("alto")) {
            System.out.println("Você esta com sorte hoje!");

        } else if (pocicao.equals("baixo")) {
            System.out.println("Você esta sem sorte hoje.");
        } else {
            System.out.println("Escolha uma opção valida!");
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
        System.out.println("Escolha um caminho: (Direita/Esquerda)");
        caminho = entrada.nextLine().toLowerCase();

        if (caminho.equals("direita")) {
            System.out.println("Você chegou em um rio cristalino, aproveite!");
        } else if (caminho.equals("esquerda")) {
            System.out.println("Você chegou em um campo florido, aprecie a vista!");
        } else {
            System.out.println("Escolha uma opção valida!");
            escolhaDoCaminho();

        }entrada.close();

    }

    /**
     * O Sorvete Refrescante: Escolhe o sabor do sorvete com base no sabor favorito de uma amiga.
     */
    public static void sorveteRefrescante() {
        String sorvete;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um sabor de sorvete!");
        sorvete = entrada.nextLine().toLowerCase();

        if (sorvete.equals("chocolate"));{
        System.out.println("Otima escolha, esse é o meu favorito!");

        ] else if {
                System.out.println("Esse sabor é muito bom!");
            }entrada.close();
            }

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
