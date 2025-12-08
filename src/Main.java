import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rand = 67;
        int guess = 0;

        while (guess != rand){
            System.out.println("Indiquez un entier compris entre 1 et 100");
            guess = scanner.nextInt();

            if(guess > rand){
                System.out.println(guess + " est trop grand");
            } else if (guess < rand) {
                System.out.println(guess + " est trop petit");
            }else {
                System.out.println(guess + " est la bonne réponse");
            }
        }
        scanner.close();
    }
}