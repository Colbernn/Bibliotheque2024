package bibliotheque.metier;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Auteur {
    private  String nom,prenom;
    private String nationalite;
    private List<Ouvrage> louvrage = new ArrayList<>();

    public Auteur(String nom, String prenom, String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public List<Ouvrage> getLouvrage() {
        return louvrage;
    }

    public void setLouvrage(List<Ouvrage> louvrage) {
        this.louvrage = louvrage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auteur auteur = (Auteur) o;
        return Objects.equals(nom, auteur.nom) && Objects.equals(prenom, auteur.prenom) && Objects.equals(nationalite, auteur.nationalite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, nationalite);
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nationalite='" + nationalite + '\'' +
                '}';
    }
    public void addOuvrage(Ouvrage o ){
        louvrage.add(o);
        o.getLauteurs().add(this);
    }

    public void remove(Ouvrage o){
        louvrage.remove(o);
        o.getLauteurs().remove(this);
    }

    public List<Ouvrage> listerOuvrages(){
        List<Ouvrage> ouvrages = new ArrayList<>();
        for(Ouvrage ouv : louvrage){
            ouvrages.add(new Ouvrage(ouv.getTitre(), ouv.getAgeMin(), ouv.getDateParution(), ouv.getTo(), ouv.getPrixLocation(), ouv.getLangue(), ouv.getGenre()));
        }

        return ouvrages;
    }

    public List<Ouvrage> listerOuvrages(TypeOuvrage to){
        List<Ouvrage> ouvrages = new ArrayList<>();
        for(Ouvrage ouv : louvrage){
            if(ouv.to==to) {
                ouvrages.add(new Ouvrage(ouv.getTitre(), ouv.getAgeMin(), ouv.getDateParution(), ouv.getTo(), ouv.getPrixLocation(), ouv.getLangue(), ouv.getGenre()));
            }
        }

        return ouvrages;
    }
    public List<Livre> listerLivres(TypeLivre tl){
        List<Livre> livres = new ArrayList<>();
        for(Ouvrage ouv : louvrage){
            if(ouv.tl==tl && ouv.to==TypeOuvrage.LIVRE) {
                livres.add(new Ouvrage(ouv.getTitre(), ouv.getAgeMin(), ouv.getDateParution(), ouv.getTo(), ouv.getPrixLocation(), ouv.getLangue(), ouv.getGenre()));
            }
        }

        return livres;
    }
    public List<Ouvrage> listerOuvrages(String genre){
        List<Ouvrage> ouvrages = new ArrayList<>();
        for(Ouvrage ouv : louvrage){
            if(ouv.genre==genre) {
                ouvrages.add(new Ouvrage(ouv.getTitre(), ouv.getAgeMin(), ouv.getDateParution(), ouv.getTo(), ouv.getPrixLocation(), ouv.getLangue(), ouv.getGenre()));
            }
        }

        return ouvrages;
    }
}
