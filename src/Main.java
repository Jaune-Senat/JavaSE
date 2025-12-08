import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indiquez un entier positif");

        int nb = scanner.nextInt();

        for(int i = 1; i<= 10; i++){
            System.out.println(i +" x "+ nb + " = " + i*nb);
        }
    }
}