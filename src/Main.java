import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la première note");

        int nb1 = scanner.nextInt();

        System.out.println("Entrez la deuxième note");

        int nb2 = scanner.nextInt();

        System.out.println("Entrez la troisième note");

        int nb3 = scanner.nextInt();

        int moyenne = (nb1 +nb2 +nb3)/3 ;

        if (moyenne >= 10){
            System.out.println("Vous êtes admis");
        }else {
            System.out.println("Vous êtes ajourné");
        }
    }
}