import java.util.Scanner;

/**
 * Classe que contém métodos para resolver diversos desafios condicionais.
 */
public class VitorioExerciciosCondicionais {

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
        System.out.println("Qual a temperatura do dia de hoje?");
        temperatura = entrada.nextInt();
        System.out.println("como tá to tempo? (ensolarado/chuvoso)");
        tempo = entrada.nextLine().toLowerCase();

        if (temperatura >= 25) {
            System.out.println("é dia de praia!");
        } else if (temperatura >= 15 && tempo.equals("ensolarado")) {
            System.out.println("piquenique no parque!");
        } else System.out.println("vai ler um livro, eistein.");
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
        System.out.println("Qual é a estação do ano? ( Verão/Inverno/Primavera/Outono");
        estacao = entrada.nextLine().toLowerCase();

        if (estacao.equals("verão")) {
            System.out.println("Tenha roupas leves e frescas!");
        } else if (estacao == "inverno"){
            System.out.println("tenha roupas quentinhas!");
        } else if (estacao == "outono"){
            System.out.println("qualquer roupa serve.");
        }else if (estacao == "primavera"){
            System.out.println("qualquer roupa serve.");
        }else {
            System.out.println("Você não escolheu ou não digitou corretamente uma estação");
        }entrada.close();

    }

    /**
     * A Máquina de Doces: Fornece um doce se a senha correta "abracadabra" for inserida.
     * Caso contrário, mostra uma mensagem de erro.
     */
    public static void maquinaDeDoces() {

        String senhaCorreta = "abracadabra";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a senha correta: ");
        String senhaDigitada = entrada.nextLine();

        if (senhaCorreta.equals(senhaDigitada))
        {
            System.out.println("Aqui está seu doce!");
        } else {
            System.out.println("senha incorreta!");
            maquinaDeDoces();
        }

    }

    /**
     * O Gato Misterioso: Determina se a sorte está ao seu lado ou se deve ter cuidado
     * com base na posição do rabo do gato.
     */
    public static void gatoMisterioso() {

        String posicaoDoRabo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quanl é a posição do rabo do gato? (levantado/abaixado)");
        posicaoDoRabo = entrada.nextLine().toLowerCase();

        if (posicaoDoRabo.equals("levantado")) {
            System.out.println("Siga traquilo(a) pois a sorte esta ao seu lado!");
        }else if (posicaoDoRabo == "abaixado") {
            System.out.println("Tome muito cuidado pode ter armadilhas pela frente!!!");
        }else {
            System.out.println("Reinicie pois esta opção não é valida.");
        }
        entrada.close();
    }

    /**
     * A Escolha do Caminho: Decide o caminho a seguir com base na direção indicada pela placa.
     * Direita leva a um rio cristalino e esquerda a um campo florido.
     */
    public static void escolhaDoCaminho() {



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