import ExoClass.Enseignant;
import ExoClass.Specialite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

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