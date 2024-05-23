import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

/**
 * Classe que contém métodos para resolver diversos desafios condicionais.
 */
public class AliceExerciciosCondicionais {

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
        System.out.println("Qual a temperetura?:");
        temperatura = entrada.nextInt();
        System.out.print("Como está o tempo? (ensorado/chuvoso) ");
        tempo = entrada.nextLine().toLowerCase();

        if (temperatura >= 25) {
            System.out.println("É dia de praia !");
        } else if (temperatura >= 15 && tempo.equals("ensolarado")) {
            System.out.println("Dia de parque");
        }else {
            System.out.println("Dia de ficar em casa");
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
        System.out.println("Digite a estação: ");
        estacao = entrada.nextLine().toLowerCase();

        if (estacao.equals("verao")){
            System.out.println("Mostrar roupas leves e frescas");
        } else if (estacao.equals("inverno")) {
            System.out.println("Apresentar opções quentinhas e aconchegantes.");
        } else if (estacao.equals("primavera") || estacao.equals("outono")) {
            System.out.println("Dar sugestões para qualquer tipo de clima.");
        } else {
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
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a senha");
        String senhaDigitada = entrada.nextLine();

        if (senhaCorreta.equals(senhaDigitada)) {
            System.out.println("Aqui está seu doce!");
        } else {
            System.out.println("Senha incorreta. Tente Novamente!");
            maquinaDeDoces();
        } entrada.close();

    }

    /**
     * O Gato Misterioso: Determina se a sorte está ao seu lado ou se deve ter cuidado
     * com base na posição do rabo do gato.
     */
    public static void gatoMisterioso() {
        boolean raboLevantado = true; // exemplo de estado do rabo

        if (raboLevantado) {
            System.out.println("A sorte está ao seu lado");
        } else {
            System.out.println("Cuidado, pode haver um obstáculo à frente.");
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
