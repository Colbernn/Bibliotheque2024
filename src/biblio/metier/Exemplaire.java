package biblio.metier;

import java.util.List;

public class Exemplaire {
    private String matricule;
    private String descriptionEtat;
    private Ouvrage ouvrage;
    private Rayon rayon;
    private List<Location> locations;

    public Exemplaire(String matricule, String descriptionEtat, Ouvrage ouvrage) {
        this.matricule = matricule;
        this.descriptionEtat = descriptionEtat;
        this.ouvrage = ouvrage;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getDescriptionEtat() {
        return descriptionEtat;
    }

    public void setDescriptionEtat(String descriptionEtat) {
        this.descriptionEtat = descriptionEtat;
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    public Rayon getRayon() {
        return rayon;
    }

    public void setRayon(Rayon rayon) {
        this.rayon = rayon;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    /*public void modifierEtat(String etat){

    }

    public void lecteurActuel(){

    }

    public void lecteurs(){

    }

    public void enVoiMailLecteurActuel(Mail mail){

    }

    public void enVoiMailLecteurs(Mail mail){

    }

    public boolean enRetard(){

    }

    public int joursRetard(){

    }

    public boolean enlocation(){

    }*/


}
