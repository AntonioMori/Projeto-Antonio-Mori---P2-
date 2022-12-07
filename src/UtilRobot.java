import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.Random;

public class UtilRobot {

    // Aqui é um código que a cada letra ele vai escrevendo na tela com atraso
    // personalizado, criando um efeito de delay
    Scanner input = new Scanner(System.in, "UTF-8");
    Random random = new Random();

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


}
