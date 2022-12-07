import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class App {

    // Aqui é um código que a cada letra ele vai escrevendo na tela com atraso
    // personalizado, criando um efeito de delay
    public static void slowestPrint(String output) {
        for (int i = 0; i < output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (Exception e) {

            }
        }
    }

    // Delay de 30
    public static void slowPrint(String output) {
        for (int i = 0; i < output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(30);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) throws Exception {

        // Scanner definido como input(entrada)
        Scanner input = new Scanner(System.in, "UTF-8");
        Random random = new Random();

        // Conversa introdutória com o usuário
        slowestPrint("[...S0S SIGNAL INCOMING...]\n");
        Thread.sleep(2000);
        slowestPrint("...");
        Thread.sleep(2800);
        slowestPrint("Oláaaa humm...");
        Thread.sleep(2000);
        slowestPrint("\nQue estranho..");
        Thread.sleep(2000);
        slowestPrint("O meu sinal devia estar chegando para o exército e não para voc...");
        Thread.sleep(1300);
        slowestPrint("\nEnfim...");
        Thread.sleep(1300);
        slowestPrint(" qual é o seu nome?");
        Thread.sleep(2000);
        slowestPrint("\nBem esqueça isso, deixaremos os detalhes para depois...");
        Thread.sleep(1000);
        slowestPrint("agora apenas preste atenção nas instruções ok?");
        Thread.sleep(3000);
        slowestPrint("\nAo chegar os comandos em seu sistema, inicie em modo de segurança ok?");
        Thread.sleep(1000);
        slowestPrint("\nISSO É DE EXTREMA IMPORTÂNCIA, minha vida depende disso...");
        Thread.sleep(2000);
        slowestPrint("\n...");
        Thread.sleep(2000);
        slowestPrint("\npor algum motivo os monstros parecem estar impedidos de entrar aqui,");
        Thread.sleep(3000);
        slowestPrint(" hmmmmm, poxa espere ai.. você deve estar se perguntando o que está acontecendo né,");
        Thread.sleep(2000);
        slowestPrint(" masss.. fique tranquilo. Eu vou te explicar a situação.");
        Thread.sleep(2000);
        slowestPrint("\n[BOOOOOOOOM] - \"Barulho de explosão\"");
        Thread.sleep(2000);
        slowestPrint("\nMeu DEUSS ELES ESTÃO ENTRANDO AQUI, NÃO TEMOS MAIS TEMPO!");
        Thread.sleep(2000);
        slowestPrint(
                "\nApenas obedeça esse sinal de socorro! POR FAVOR, MINHA VIDA ESTÁ EM SUAS MÃOS! NÃO PA###@(!$ .3´~<,12301101010000100000010001001000");
        Thread.sleep(2000);
        slowestPrint("\n\n[ERROR] \n\n");
        Thread.sleep(2000);
        slowestPrint("[end of transmition] \n\nDigite \"yes\" para iniciar modo de segurança.\n");

        // Variável que recebe a resposta do usuário, levando a um dos finais caso a
        // resposta seja "yes" ou "no"
        // Primeiro final caso seja não o cientista morre e o usuário perde

        String resposta = input.nextLine();

        if (resposta.equalsIgnoreCase("yes")) {
            // se a resposta for sim:

            slowestPrint("\nModo de segurança sendo iniciado...\n");
            Thread.sleep(1000);
            // Criação da variável fora do for para que ela não seja recriada a cada loop
            // início da tela de loading

            int porcentagem = 0;
            for (int i = 0; i < 11; i++) {
                System.out.println(porcentagem + "%");
                Thread.sleep(500);
                porcentagem += 10;
            }

            slowestPrint("\nModo de segurança iniciado com sucesso.");
            slowestPrint("[Sistema auxiliar ligado]");
            // continuação da história e início das escolhas

            Thread.sleep(2000);
            slowPrint(
                    "\n\nSeja bem vindo ao menu interativo! Eu irei auxiliar na construção do seu robo guerrilheiro, escolha as peças com sabedoria ou encare a derrota iminente.");
            Thread.sleep(1000);
            slowPrint(
                    "\nPara começarmos qual é o seu nome e o do seu robo? \"ps: separe os nomes atraves de uma vírgula\"\n");
            // use a ferramenta split para separar usando uma virgula , leia a linha inteira
            // usando nextLine e depois use o split
            // recebe o nome do usuário e o nome do robô
            String nomeInteiro = input.nextLine();
            String[] nomes = nomeInteiro.split(",");

            // cria dois novos objetos referentes a cada nome recebido
            String nomeUser = nomes[0];
            String nomeRobo = nomes[1];

            // criação da entidade do robo
            Entidade robo1 = new Entidade(nomeRobo, 100, 100, 10, 0, 1);

            // implementação dos objetos tributos
            // inicia a conversa com o usuário e explica o que são os tributos
            slowPrint("\nPrazer " + nomeUser + "! Seu robo se chamará " + nomeRobo + "!\n\nAgora vamos á construção!");
            Thread.sleep(1500);
            slowPrint("\nPorém antes de continuarmos devo lhe avisar de alguns detalhes importantes.");
            Thread.sleep(1500);
            slowPrint(
                    "\nO que está sendo construido não é um robô comum, ele é um robô de guerra, os seus atributos serão definidos de acordo com as suas escolhas.");
            Thread.sleep(2500);

            // PAREI AQUI (CRIAR FUNÇÃO QUE RETORNA OS TRIBUTOS ATUALIZADOS TODA VEZ Q A
            // FUNÇÃO FOR CHAMADA)
            // REFAZER AQUI UMA FUNÇÃO PARA TRAZER OS TRIBUTOS ATUALIZADOS

            slowPrint("\nAtualmente os seus tributos estão classificados como:\n\n" + robo1.mostrarStatus());
            Thread.sleep(1500);
            slowPrint(
                    "\n\nQual dos seguintes materiais será a base para a construção do seu robo?\n\n[Aço] / [Ouro] / [Cobre] / [Plástico] / [Madeira]\n");

            // recebe a resposta do usuário sobre o tipo do robo
            String tipoRobo = input.nextLine();

            /// Falta incrementar o que vai aumentar em seu status de acordo com as escolhas
            /// Falta adicionar uma descrição para cada material
            /// continuação das próximas escolhas a seguir, e continuação da história
            /// if nao ta sendo executado caso true

            if (tipoRobo.equalsIgnoreCase("Aço")) {
                slowPrint(
                        "\nVocê escolheu o material Aço, ele é muito resistente e durável, mas é muito pesado, o que pode atrapalhar na mobilidade do seu robozinho.");
                robo1.ataque += 5;
                System.out.println(robo1.ataque);
            } else if (tipoRobo.equalsIgnoreCase("Ouro")) {
                slowPrint(
                        "\nVocê escolheu o material Ouro, ele Não é tão resistente assim, mas deixa o seu robo lindo e brilhante, o que pode atrapalhar na mobilidade do seu robozinho.");
            } else if (tipoRobo.equalsIgnoreCase("Cobre")) {
                slowPrint(
                        "\nVocê escolheu o material Cobre, ele é muito resistente e durável, mas é muito pesado, o que pode atrapalhar na mobilidade do seu robozinho.");
            } else if (tipoRobo.equalsIgnoreCase("Plástico")) {
                slowPrint(
                        "\nVocê escolheu o material Plástico, ele é muito resistente e durável, mas é muito pesado, o que pode atrapalhar na mobilidade do seu robozinho.");

                int vida1 = random.nextInt(10 + 50);

                robo1.setVida(vida1);
            } else if (tipoRobo.equalsIgnoreCase("Madeira")) {
                slowPrint("\nVocê escolheu o materil mais inútil e ele pegou fogo durante o processo de montagem.");
                slowestPrint("\nO robo não foi construido no tempo devido. O cientista e sua familia morreram.");
                slowestPrint("\n\n[GAME OVER]");
            }
            // condicional para repetir as perguntas caso seja digitada uma opção inválida
            else {
                System.out.println(
                        "\nVocê digitou algo errado, tente novamente!\nVocê deseja que ele seja feito de qual material?\n[Aço] / [Ouro] / [Cobre] / [Plástico]\n");
                tipoRobo = input.nextLine();

            }

            // equals ignore case
            // cada morte vai ser um capitulo
            //ctr l k mais f orgniza o código
            // ctrl d seleciona mais de uma palavra ao mesmo tempo

        } else {
            slowestPrint("Modo de segurança não iniciado.");
            slowestPrint("\nAs instruções foram ignoradas. O cientista e sua familia morreram.");
            slowestPrint("\n\n[GAME OVER]");

        }

        input.close();

    }

}
