import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre");

        int nombre = scanner.nextInt();

        if (nombre %2 == 1){
            System.out.println("Ce nombre est impair");
        }else {
            System.out.println("Ce nombre est pair");
        }
    }
}