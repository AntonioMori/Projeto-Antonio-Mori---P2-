import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Oláaaa humm... eu devia soar mais desesperado mas por algum motivo os monstros parecem estar impedidos de entrar aqui, hmm, poxa espere ai.. você deve estar se perguntando o que está acontecendo, masss.. MAS NÃO TEMOS TEMPO!\nApenas obedeça esse sinal de socorro! POR FAVOR, MINHA VIDA ESTÁ EM SUAS MÃOS! NÃO PA###@(!$ .3´~<,12301101010000100000010001001000\n\n[ERROR] \n\n[end of transmition] \n\nDigite \"yes\" para iniciar modo de segurança.");
        
        String resposta = input.nextLine();
        if (resposta.equals("yes")) {
            
            System.out.println("Modo de segurança iniciado.");

         
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
            break
        }
        
        
        
       
    }
}
