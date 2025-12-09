package ExoClass;

public class Enseignant {
    private  String nom;
    private final Specialite specialite;

    public Enseignant(String nom, Specialite specialite) {
        this.nom = nom;
        this.specialite = specialite;
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
}
