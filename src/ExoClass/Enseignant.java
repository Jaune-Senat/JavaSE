package ExoClass;

public class Enseignant {
    private  String nom;
    private final Specialite specialite;
    private Filiere filiere;

    public Enseignant(String nom, Specialite specialite, Filiere filiere) {
        this.nom = nom;
        this.specialite = specialite;
        this.filiere = filiere;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Specialite getSpecialite() {
        return specialite;
    }
    public Filiere getFiliere() {
        return filiere;
    }
}
