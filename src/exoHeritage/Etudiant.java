package exoHeritage;

public class Etudiant extends Personne {
    private String niveau;
    private int note;
    private int moyenne;

    public Etudiant(String prenom, String nom,String courriel, String niveau, int note, int moyenne) {
        super.nom = nom;
        super.prenom = prenom;
        super.courriel = courriel;
        this.niveau = niveau;
        this.note = note;
        this.moyenne = moyenne;
    }

    public String getNiveau() {
        return niveau;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }
    public int getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(int moyenne) {
        this.moyenne = moyenne;
    }
}
