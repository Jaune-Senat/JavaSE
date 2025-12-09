//import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Ecrivez un court texte en une ligne maximum");
        String phrase = scanner.nextLine();
        int countV = 0;

        for(int i = 0; i<phrase.length(); i++){
           char c = Character.toLowerCase(phrase.charAt(i));
           if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
               countV++;
           }
        }

        System.out.println("Dans la phrase  , il y a " + countV + " voyelles ");
        scanner.close();
    }
}