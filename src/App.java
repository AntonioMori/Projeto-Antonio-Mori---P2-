import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {

    // Aqui é um código que a cada letra ele vai escrevendo na tela com o delay personalizado, criando um efeito de delay
    public static void slowestPrint(String output) {
        for (int i = 0; i<output.length(); i++) {
          char c = output.charAt(i);
          System.out.print(c);
          try {
            TimeUnit.MILLISECONDS.sleep(50);
          }
          catch (Exception e) {
    
          }
        }
    }
     // Delay de 30
     public static void slowPrint(String output) {
        for (int i = 0; i<output.length(); i++) {
          char c = output.charAt(i);
          System.out.print(c);
          try {
            TimeUnit.MILLISECONDS.sleep(30);
          }
          catch (Exception e) {
    
          }
        }
    }
    public static void main(String[] args) throws Exception {
    
        //slowPrint("oi esse é um teste para ver se está funcionando");
        // Scanner definido como input(entrada)
        Scanner input = new Scanner(System.in);

        // Conversa introdutória com o usuário
        slowestPrint("[...S0S SIGNAL INCOMING...]\n");
        Thread.sleep(2000);
        slowestPrint("...");
        Thread.sleep(2800);
        slowestPrint("Oláaaa humm...");
        Thread.sleep(2000);
        slowPrint("\nqual é o seu nome?");
        Thread.sleep(2000);
        slowestPrint("\nBem esqueça isso, deixaremos os detalhes para depois...");
        Thread.sleep(1000);
        slowestPrint("agora apenas preste atenção nas instruções ok?");
        Thread.sleep(3000);
        slowestPrint("\nAo chegar os comandos em seu sistema, inicie em modo de segurança ok? ISSO É DE EXTREMA IMPORTÂNCIA, minha vida depende disso...");
        Thread.sleep(1000);
        slowPrint("eu devia soar mais desesperado mas por algum motivo os monstros parecem estar impedidos de entrar aqui, hmm, poxa espere ai.. você deve estar se perguntando o que está acontecendo, masss.. Meu DEUSS ELES ESTÃO ENTRANDO AQUI, NÃO TEMOS MAIS TEMPO!\nApenas obedeça esse sinal de socorro! POR FAVOR, MINHA VIDA ESTÁ EM SUAS MÃOS! NÃO PA###@(!$ .3´~<,12301101010000100000010001001000\n\n[ERROR] \n\n[end of transmition] \n\nDigite \"yes\" para iniciar modo de segurança.");
        
        String resposta = input.nextLine();
        if (resposta.equals("yes")) {
            
            System.out.println("Modo de segurança iniciado.");
            System.out.println("");
         
            System.out.println("Seja bem vindo á parte fácil! A construção do seu guerreiro, escolha as peças com sabedoria ou encare a derrota iminente.");
            System.out.println("Qual é o seu nome e o do seu robozinho? \"ps: separe os nomes atraves de uma vírgula\"");
            //use a ferramenta split para separar usando uma virgula , leia  a linha inteira usando nextLine e depois use o split
            
            String nomeInteiro = input.nextLine();
            String[] nomes = nomeInteiro.split(",");
            String nomeUser = nomes[0];
            String nomeRobo = nomes[1];
            System.out.println("\nPrazer "+nomeUser+"! Seu robozinho se chamará "+nomeRobo+"!\n\nAgora vamos dar continuidade a construção do seu robo!\nVocê deseja que ele seja feito de qual material?\n[Aço] / [Ouro] / [Cobre] / [Plástico]");
            String tipoRobo = input.nextLine();
            while(!tipoRobo.equalsIgnoreCase("Aço") && !tipoRobo.equalsIgnoreCase("Ouro") && !tipoRobo.equalsIgnoreCase("Cobre") && !tipoRobo.equalsIgnoreCase("Plástico")){
                System.out.println("Você digitou algo errado, tente novamente!\nVocê deseja que ele seja feito de qual material?\n[Aço] / [Ouro] / [Cobre] / [Plástico]");
                tipoRobo = input.nextLine();
            }

            
            
            //equals ignore case
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        } 
        else {
            System.out.println("Modo de segurança não iniciado.");
            
        }
        
        
        
       
    }
}
