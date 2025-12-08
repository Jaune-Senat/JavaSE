import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int math = rand.nextInt(1,100);
        int guess = 0;

        while (guess != math){
            System.out.println("Indiquez un entier compris entre 1 et 100");
            guess = scanner.nextInt();

            if(guess > math){
                System.out.println(guess + " est trop grand");
            } else if (guess < math) {
                System.out.println(guess + " est trop petit");
            }else {
                System.out.println(guess + " est la bonne réponse");
            }
        }
        scanner.close();
    }
}