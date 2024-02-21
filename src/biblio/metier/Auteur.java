package biblio.metier;

import java.util.List;

public class Auteur {
    private String nom;
    private String prenom;
    private String nationalite;
    private List<Ouvrage> ouvrages;

    public Auteur(String nom, String prenom, String nationalite) {
        this.nom = nom;
        this.prenom=prenom;
        this.nationalite=nationalite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setOuvrages(List<Ouvrage> ouvrages) {
        this.ouvrages = ouvrages;
    }

    public void listerouvrages(){

    }

   /* public void listerOuvrages(TypeOuvrage typesOuvrages, TypeLivre typeLivre){

    }

    public void listerOuvrages(String genre){

    }*/
}
