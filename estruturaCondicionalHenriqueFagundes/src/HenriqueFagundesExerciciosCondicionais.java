package estruturaCondicionalHenriqueFagundes.src;

import java.util.Scanner;

/**
 * Classe que contém métodos para resolver diversos desafios condicionais.
 */
public class HenriqueFagundesExerciciosCondicionais {

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

        if (temperatura >= 25){
            System.out.println("É dia de Praia!");
        }else if (temperatura >= 15){
            System.out.print("Como está o tempo? (ensolarado/chuvoso): ");
            tempo = entrada.nextLine().toLowerCase();
            if (tempo.equals("ensolarado")){
                System.out.println("Piquenique no Parque!");
            }else{
                System.out.println("Vamos ler um livro em casa!");
            }
        }else{
            System.out.println("Está muito frio. Vamos ler um livro em casa " + "e tomar um chocolate quente!");
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
        System.out.println("Qual é a estação do ano?: ");
        estacao = entrada.nextLine().toLowerCase();

        if (estacao.equals("verao")){
            System.out.println("Use roupas mais frescas!");
        }else if (estacao.equals("inverno")){
            System.out.println("Use roupas quentes!");
        }else if (estacao.equals("outono") || estacao.equals("primavera")){
            System.out.println("Use a roupa que preferir!");
        }else{
            System.out.println("Essa estação não existe!");
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
        System.out.println("Digite a senha correta e receba um doce!");
        senha = entrada.nextLine().toLowerCase();

        if (senha.equals("abracadabra")){
            System.out.println("Senha correta! Você recebeu um doce.");
        }else{
            System.out.println("Senha incorreta! Você decide desistir.");
        }
        entrada.close();
    }

    /**
     * O Gato Misterioso: Determina se a sorte está ao seu lado ou se deve ter cuidado
     * com base na posição do rabo do gato.
     */
    public static void gatoMisterioso() {
        String raboDoGato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você vê um gato preto em seu caminho, o rabo dele está levantado ou abaixado?: ");
        raboDoGato = entrada.nextLine().toLowerCase();

        if (raboDoGato.equals("levantado")){
            System.out.println("A sorte está do seu lado!");
        }else if (raboDoGato.equals("abaixado")){
            System.out.println("Um obstáculo está a frente! Tome cuidado!");
        }else{
            System.out.println("Resposta inválida.");
        }entrada.close();
    }

    /**
     * A Escolha do Caminho: Decide o caminho a seguir com base na direção indicada pela placa.
     * Direita leva a um rio cristalino e esquerda a um campo florido.
     */
    public static void escolhaDoCaminho() {
        String direcao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você caminhava pela floresta, e encontra uma bifurcação! A placa indica 'direita' e 'esquerda', qual caminho você seguirá?: ");
        direcao = entrada.nextLine().toLowerCase();

        if (direcao.equals("direita")){
            System.out.println("Você seguiu para a direita, e encontrou um rio cristalino!");
        }else if (direcao.equals("esquerda")){
            System.out.println("Você seguiu para a esquerda, e encontrou um campo florido!");
        }else{
            System.out.println("Este caminho não existe.");
        }
        entrada.close();
    }

    /**
     * O Sorvete Refrescante: Escolhe o sabor do sorvete com base no sabor favorito de uma amiga.
     */
    public static void sorveteRefrescante() {
        String sorveteFavorito;
        Scanner entrada = new Scanner(System.in);
        System.out.println("O dia está quente, e você decide tomar um sorvete com sua amiga. Qual o sabor favorito dela? (chocolate/morango/limão): ");
        sorveteFavorito = entrada.nextLine().toLowerCase();

        if (sorveteFavorito.equals("chocolate")){
            System.out.println("Você decide comprar um chocolate também.");
        }else if (sorveteFavorito.equals("morango")){
            System.out.println("Você escolhe o sabor morango.");
        }else if (sorveteFavorito.equals("limao")){
            System.out.println("Você divide um sabor cítrico com sua amiga.");
        }else{
            System.out.println("Este sabor não existe.");
        }
        entrada.close();
    }

    /**
     * O Livro Encantado: Mostra uma história de aventura em dias pares e de romance em dias ímpares.
     */
    public static void livroEncantado() {
        int diaDeHoje;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que dia é hoje?");
        diaDeHoje = entrada.nextInt();

        if (diaDeHoje % 2 == 0) {
            System.out.println("O Livro Encantado lhe mostra uma história de aventura.");
        }else {
            System.out.println("O Livro Encantado lhe mostra uma história de romance.");
        }
        entrada.close();
    }

    /**
     * A Música Favorita: Cria uma playlist com base no artista favorito inserido.
     */
    public static void musicaFavorita() {
        String artistaFavorito;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu artista/banda favorito(a)?");
        artistaFavorito = entrada.nextLine().toLowerCase();

        if (artistaFavorito.equals("michael jackson")) {
            System.out.println("Você cria uma playlist de hits dançantes.");
        }else if (artistaFavorito.equals("the beatles")) {
            System.out.println("Você cria uma playlist de músicas clássicas.");
        }else if (artistaFavorito.equals("queen")) {
            System.out.println("Você cria uma playlist de Rock.");
        }else {
            System.out.println("Você cria músicas do(a) artista/banda " + artistaFavorito + ".");
        }
        entrada.close();
    }

    /**
     * O Presente Perfeito: Escolhe o presente com base nos interesses do amigo.
     */
    public static void presentePerfeito() {
        String interessesDoAmigo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Do que seu amigo gosta/O que você acha que seu amigo quer?");
        interessesDoAmigo = entrada.nextLine().toLowerCase();

        if (interessesDoAmigo.equals("esportes")) {
            System.out.println("Você compra um tênis para seu amigo.");
        }else if (interessesDoAmigo.equals("ler")) {
            System.out.println("Você compra um livro para seu amigo.");
        }else if (interessesDoAmigo.equals("jogos")) {
            System.out.println("Você compra um videogame para seu amigo.");
        }else{
            System.out.println("Você decide dar um(a) " + interessesDoAmigo + " ao seu amigo.");
        }
        entrada.close();
    }

    /**
     * O Animal Falante: Interage com diferentes animais falantes e descobre suas mensagens.
     */
    public static void animalFalante() {
        String animal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você entra em uma floresta mágica e encontra um animal falante. Que animal você encontra?");
        animal = entrada.nextLine().toLowerCase();

        if (animal.equals("papagaio")) {
            System.out.println("O papagaio te conta piadas engraçadas.");
        }else if (animal.equals("macaco")) {
            System.out.println("O macaco lhe dá aulas de escalada.");
        }else if (animal.equals("elefante")) {
            System.out.println("O elefante lhe dá um passeio pela floresta em suas costas.");
        }
        entrada.close();
    }
}
