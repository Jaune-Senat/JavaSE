package exoBibliotheque;

import java.util.Scanner;

public class Livre {
    private String titre;
    private String auteur;
    private double prix;

    public Livre(Scanner sc) {
        System.out.print("Entrez le titre du livre : ");
        this.titre = sc.nextLine();
        System.out.print("Entrez l'auteur du livre : ");
        this.auteur = sc.nextLine();
        System.out.print("Entrez le prix du livre : ");
        this.prix = sc.nextDouble();

        sc.nextLine();
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Livre : " + titre + ", auteur : " + auteur + ", prix : " + prix + " €";
    }
}
