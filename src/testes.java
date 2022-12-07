import java.util.Scanner;
import java.util.Random;


public class testes {
    
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int a = random.nextInt(10+50);
    System.out.println(a);


    
    System.out.println("[end of transmition] \n\nDigite \"yes\" para iniciar modo de segurança.");

        // Variável que recebe a resposta do usuário

        String resposta = input.nextLine();
        if (resposta.equals("yes")) {
            System.out.println("Modo de segurança sendo iniciado...");
            Thread.sleep(1000);
            int porcentagem = 0;
            for (int i = 0; i < 11; i++) {
                System.out.println( porcentagem + "%");
                Thread.sleep(500);
                porcentagem = porcentagem + 10;
            }
            System.out.println("\nModo de segurança iniciado com sucesso.");
            System.out.println("[Sistema auxiliar ligado]");
         
            System.out.println("Seja bem vindo á parte fácil! A construção do seu guerreiro, escolha as peças com sabedoria ou encare a derrota iminente.");
            System.out.println("Qual é o seu nome e o do seu robozinho? \"ps: separe os nomes atraves de uma vírgula\"");
        }//if
        input.close();
                }//string
                        }//class
