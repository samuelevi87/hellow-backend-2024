import java.util.Scanner;

/**
 * Classe que contém métodos para resolver diversos desafios condicionais.
 */
public class GabrielPamplonaExerciciosCondicionais {

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
        System.out.println("Como esta o tempo? (ensolarado/chuvoso: ");
        tempo = entrada.nextLine().toLowerCase();

        if (temperatura >= 25) {
            System.out.println("É dia de praia!");
        } else if ((temperatura >= 15) && tempo.equals("ensolarado")) {
            System.out.println("Piquenique no Parque!");
        } else {
            System.out.println("Vamos ler um livro em casa!");
        }
        entrada.close();
    }


    /**
     * O Roupeiro Inteligente: Sugere roupas com base na estação do ano.
     * Mostra roupas leves e frescas no verão, opções quentinhas no inverno,
     * e roupas para qualquer clima na primavera e no outono.
     */
    public static void roupeiroInteligente() {
        String Estaçao;
        Scanner entrada = new Scanner(System.in);
        Estaçao = entrada.nextLine().toLowerCase();

        if (Estaçao.equals("verao")) {
            System.out.println("Mostrar roupas leves e frescas");


             }else if (Estaçao.equals("inverno")) {
            System.out.println("Apresentar opções quentinhas e aconchegantes.");
        }else if (Estaçao.equals("primavera") || Estaçao.equals("outono")) {
            System.out.println("Dar sugestões para qualquer tipo de clima.");
        }else {
            System.out.println("Digite uma opção válida!");
            roupeiroInteligente();

        }
  entrada.close();
    }

    /**
     * A Máquina de Doces: Fornece um doce se a senha correta "abracadabra" for inserida.
     * Caso contrário, mostra uma mensagem de erro.
     */
    public static void maquinaDeDoces() {
        String senhaCorreta = "abracadabra";
        String senhaDoUsuario;
        Scanner estrada = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        senhaDoUsuario = estrada.nextLine().toLowerCase();

        if (senhaDoUsuario.equals(senhaCorreta)){
            System.out.println("Você ganhou um doce!");
        }else {
            System.out.println("Senha icorreta. Tente novamente");
            maquinaDeDoces();
        }

    }

    /**
     * O Gato Misterioso: Determina se a sorte está ao seu lado ou se deve ter cuidado
     * com base na posição do rabo do gato.
     */
    public static void gatoMisterioso() {
        boolean raboLevantado = true;

        if (raboLevantado) {
            System.out.println("A sorte está ao seu lado!");
        }else {
            System.out.println("Cuidado, pode haver um obstaculo á frente.");
        }

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
