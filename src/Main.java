import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double addnotes = 0;

        System.out.println("Indiquez le nombre de notes pour la moyenne");

        int nbnotes = scanner.nextInt();

        for(int i = 1; i<= nbnotes; i++){
            System.out.println("Indiquez la note " + i + ":");
            double nombre = scanner.nextInt();
            addnotes += nombre;
        }

        double moyenne = addnotes/nbnotes;

        if (moyenne >=10){
            System.out.println("Avec une moyenne de "+ moyenne +",vous êtes admis");
        }else {
            System.out.println("Avec une moyenne de "+ moyenne +", vous êtes ajourné");
        }
    }
}