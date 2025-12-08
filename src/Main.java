import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre nom");

        String nom = scanner.nextLine();

        System.out.println("Votre nom est" + nom);
    }
}