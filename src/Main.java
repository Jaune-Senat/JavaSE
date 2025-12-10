import ExoClass.Enseignant;
import ExoClass.Etudiant;
import ExoClass.Filiere;
import ExoClass.Specialite;

import java.util.*;

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
        //Specialite resp = new Specialite("Responsable");

        List<Specialite> specialiteList = new ArrayList<>(Arrays.asList(java,html,js,gdp,php));

        Enseignant tyson = new Enseignant("Tyson",java,null);
        Enseignant einstein = new Enseignant("Einstein",php, null);
        Enseignant curie = new Enseignant("Curie",java, null);
        Enseignant planck = new Enseignant("Planck",js,null);
        Enseignant burns = new Enseignant("Charles Montgomery Burns",null,cda);
        Enseignant zak = new Enseignant("Zak Kas",null,marketing);

        List<Enseignant> enseignantList = new ArrayList<>(Arrays.asList(einstein,curie,planck,tyson, burns,zak));

        Scanner sc = new Scanner(System.in);
        System.out.println("Tapez 1 pour rechercher par formateur ou 2 pour rechercher par filière");
        int choice = sc.nextInt();
        if(choice==1){
            rechercheParFormateur(sc,filiereList, enseignantList);
        }else if(choice==2){
            rechercheParFiliere(sc,filiereList, enseignantList);
        }else{
            System.out.println("Veuillez entrer 1 ou 2");
        }

        /*for(Filiere fil : filiereList){
            for(Enseignant ens : enseignantList){
                System.out.println("Entrez un nom de filière ou de formateur");
                String nom = sc.nextLine();
                Boolean trouve = false;
                int nb = 0;
                System.out.println(ens.getNom() + " " + nom);
                if(nom.length()<2 && ens.getNom().toLowerCase().contains(nom.toLowerCase())){
                    trouve = true;
                    System.out.println(ens.getNom() + " anime la formation " + ens.getFiliere().getCode() + " avec ces apprenants :");
                    for (Etudiant  etu : etudiantList){
                        nb ++;
                        System.out.println(nb + ". " + etu.getNom());
                    }
                }else if(nom.length()>2 && fil.getCode().toLowerCase().contains(nom.toLowerCase())&& Objects.equals(ens.getFiliere().getCode(), fil.getCode())){
                    trouve = true;
                    System.out.println(fil.getCode()+ " est animé par " +ens.getNom() + " avec ces apprenants :");
                    for (Etudiant  etu : etudiantList){
                        if(!Objects.equals(etu.getFiliere().getCode(), fil.getCode())){
                            System.out.println(" Aucun étudiant dans cette filière");
                        }else {
                            nb++;
                            System.out.println(nb + ". " + etu.getNom());
                        }
                    }
                }else if(nom.length()>2 && fil.getCode().toLowerCase().contains(nom.toLowerCase())&& !Objects.equals(ens.getFiliere().getCode(), fil.getCode())){
                    trouve = true;
                    System.out.println("La filière " + fil.getCode() + " existe mais n'a actuellement aucun formateur ");
                }else if(nom.length()<=2 ){
                System.out.println("Indiquez au moins trois caractères");
                }if(!trouve){
                    System.out.println("Formateur ou filière non trouvée");
                }
            }
        }*/
    }
    public static void rechercheParFiliere(Scanner sc, List<Filiere> fil, List<Enseignant> ens){
        System.out.println("Entrez un nom de formateur");
        String choix = sc.nextLine();
        Boolean cherche = false;
        if(choix.length()<2){
            System.out.println("Veuillez entrer au moins trois lettres");
        } else if (Object) {

        }


    }
    public static void  rechercheParFormateur(Scanner sc, List<Filiere> fil, List<Enseignant> ens){
        System.out.println("Entrez un nom de filière");
        String choix = sc.nextLine();
        Boolean cherche = false;
        if(choix.length()<2){
            System.out.println("Veuillez entrer au moins trois lettres");
        }
    }
}
