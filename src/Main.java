import ExoClass.Enseignant;
import ExoClass.Etudiant;
import ExoClass.Filiere;
import ExoClass.Specialite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Filiere cda = new Filiere("CDA", "Concepteur Developpeur");
        Filiere marketing = new Filiere("Marketing", "Faire acheter");
        Filiere assDeV = new Filiere("Assistance de vie", "Aidant");

        List<Filiere> filiereList = new ArrayList<>(Arrays.asList(cda,marketing,assDeV));

        Etudiant homer = new Etudiant("Homer", "Simpson", cda );
        Etudiant bart = new Etudiant("Bart", "Simpson", cda);
        Etudiant vaness =  new Etudiant("Vanessa", "Sultan", marketing);
        Etudiant marge =   new Etudiant("Marge", "Simpson", marketing);
        Etudiant lisa = new Etudiant("Lisa", "Simpson", marketing);

        List<Etudiant> etudiantList = new ArrayList<>(Arrays.asList(homer, bart,vaness,marge,lisa));


        Specialite java = new Specialite("JAVA/JEE");
        Specialite html = new Specialite("HTML/CSS");
        Specialite js = new Specialite("JS");
        Specialite gdp = new Specialite("Gestion de projet");
        Specialite php = new Specialite("PHP");
        Specialite resp = new Specialite("Responsable");

        List<Specialite> specialiteList = new ArrayList<>(Arrays.asList(java,html,js,gdp,php));

        Enseignant tyson = new Enseignant("Tyson",java,cda);
        Enseignant einstein = new Enseignant("Einstein",php, cda);
        Enseignant curie = new Enseignant("Curie",java, cda);
        Enseignant planck = new Enseignant("Planck",js,cda);
        Enseignant burns = new Enseignant("Charles Montgomery Burns",resp,cda);
        Enseignant zak = new Enseignant("Zak Kas",resp,marketing);

        List<Enseignant> enseignantList = new ArrayList<>(Arrays.asList(einstein,curie,planck,tyson, burns,zak));

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
        for (Filiere fil : filiereList) {
            System.out.println("\nFiliere : " + fil.getCode());

            int nb =0;
            boolean trouve = false;

            for(Enseignant ens : enseignantList) {
                if(Objects.equals(ens.getSpecialite().getNom(), resp.getNom()) && Objects.equals(ens.getFiliere().getCode(), fil.getCode())) {
                    System.out.println("\nFormateur : " + ens.getNom()+ "\n");

                    for (Etudiant etu : etudiantList) {
                        if (etu.getFiliere().getCode().equals(fil.getCode())) {
                            nb++;
                            System.out.println(nb + "- " + etu.getPrenom() + " " + etu.getNom());
                            trouve = true;
                        }
                    }
                }
            }if(!trouve){
            System.out.println("\nPas d'inscrit");
            }
        }
    }
}
