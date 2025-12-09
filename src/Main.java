import ExoClass.Enseignant;
import ExoClass.Etudiant;
import ExoClass.Filiere;
import ExoClass.Specialite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filiere cda = new Filiere("CDA", "Concepteur Developpeur");
        Filiere marketing = new Filiere("Marketing", "Faire acheter");
        Filiere assDeV = new Filiere("Assistance de vie", "Aidant");

        List<Filiere> filieres = new ArrayList<>(Arrays.asList(cda,marketing,assDeV));

        Etudiant homer = new Etudiant("Homer", "Simpson", cda );
        Etudiant bart = new Etudiant("Bart", "Simpson", cda);
        Etudiant vaness =  new Etudiant("Vanessa", "Sultan", marketing);
        Etudiant marge =   new Etudiant("Marge", "Simpson", marketing);
        Etudiant lisa = new Etudiant("Lisa", "Simpson", marketing);

        List<Etudiant> etudiants = new ArrayList<>(Arrays.asList(homer, bart,vaness,marge,lisa));

        System.out.println("Liste des filières");

        for (Filiere fil : filieres) {
            System.out.println("\nFiliere : " + fil.getCode());

            boolean trouve = false;
            int nb =0;
            for (Etudiant etu : etudiants) {
                if (etu.getFiliere().getCode().equals(fil.getCode())) {
                    nb ++;
                    System.out.println(nb + "- " +etu.getPrenom() + " "  + etu.getNom());
                    trouve = true;
                }
            }if(!trouve){
                System.out.println("Pas d'inscrit");
            }
        }


        Specialite java = new Specialite("JAVA/JEE");
        Specialite html = new Specialite("HTML/CSS");
        Specialite js = new Specialite("JS");
        Specialite gdp = new Specialite("Gestion de projet");
        Specialite php = new Specialite("PHP");

        List<Specialite> specialiteList = new ArrayList<>(Arrays.asList(java,html,js,gdp,php));

        Enseignant tyson = new Enseignant("Tyson",java);
        Enseignant einstein = new Enseignant("Einstein",php);
        Enseignant curie = new Enseignant("Curie",java);
        Enseignant planck = new Enseignant("Planck",js);

        List<Enseignant> enseignantList = new ArrayList<>(Arrays.asList(einstein,curie,planck,tyson));

        for (Specialite spec : specialiteList) {
           System.out.println("\n== " + spec.getNom()+ " ==");

           boolean trouve = false;
           for(Enseignant ens : enseignantList) {
               if(ens.getSpecialite().getNom().equals(spec.getNom())) {
                   System.out.println("- " + ens.getNom());
                   trouve = true;
               }
           }
           if(!trouve) {
               System.out.println("Aucun enseignant pour la specialite " + spec.getNom());
           }
        }
    }
}