//import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Indiquez combien de nombres vous souhaitez");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        double sum = 0;

        for(int i = 1; i<= size; i++) {
            System.out.println("indiquez l'entier "+ i);
            double nb = scanner.nextDouble();
            sum += nb;
        }
        double moyenne = sum/size;

        System.out.println("La somme des chiffres du tableau est : " + sum);

        System.out.println("La moyenne des chiffres du tableau est : " + moyenne);
    }
}