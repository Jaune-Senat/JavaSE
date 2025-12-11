

import exoBibliotheque.Livre;
import exoHeritage.Enseignant;
import exoHeritage.Etudiant;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    /*Scanner sc = new Scanner(System.in);

    double prixTotal = 0;

    List<Livre> bibliotheque = new ArrayList<Livre>();
    System.out.println("Indiquez le nombre de livres à ajouter");
    int nbL = sc.nextInt();
    sc.nextLine();

        for (int i = 0; i < nbL; i++) {
           System.out.println("=== Enregistrement du nouveau livre ===");

           Livre nvLivre = new Livre(sc);

           bibliotheque.add(nvLivre);
        }

    System.out.println("\n ---- Affichage des livres ----");

        for (Livre livre : bibliotheque) {
            System.out.println(livre.getTitre());
            prixTotal += livre.getPrix();
        }

        System.out.println("== Nombre total des livres dans la bibliotheque : " + bibliotheque.size() + " ==");
        System.out.println("== Le prix total des livres dans la bibliotheque est : " + prixTotal + " ==");*/
        Etudiant jean = new Etudiant("jean", "philippe","jean.philippe@yahoo.fr", "premiere",16, 12);
        Enseignant patrick = new Enseignant("patrick", "stewart", "patrick.stewart@alice.fr", LocalDate.now(), null, "Physique");

        System.out.println(patrick);
    }
}
