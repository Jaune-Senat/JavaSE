package exoHeritage;

import java.time.LocalDate;

public class Enseignant extends Personne {
    protected LocalDate dateDebut;
    protected LocalDate dateFin;
    protected String matiere;

    public Enseignant(String nom, String prenom, String courriel, LocalDate dateDebut, LocalDate dateFin, String matiere) {
        super.nom = nom;
        super.prenom = prenom;
        super.courriel = courriel;
        this.dateDebut = LocalDate.now();
        this.dateFin = null;
        this.matiere = matiere;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }
    public LocalDate getDateFin() {
        return dateFin;
    }
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
    public String getMatiere() {
        return matiere;
    }
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
    @Override
    public String toString() {
        return  prenom + " " + nom + " arrivé le : " + dateDebut + " est enseignant en " + matiere;
    }
}
