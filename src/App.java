import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Oláaaa Muito Prazer, através desse jogo interativo você irá construir um robo guerreiro para tentar matar o terrível inimigo que ó aguarda! Preencha as perguntas e personalize o seu combatente. Boa sorte na sua jornada!");
        
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
}
