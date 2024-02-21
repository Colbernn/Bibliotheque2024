package biblio.metier;

import java.util.List;

public class Rayon {
    private String codeRayon;
    private String genre;
    private List<Exemplaire> exemplaires;

    public Rayon(String codeRayon, String genre, List<Exemplaire> exemplaires) {
        this.codeRayon = codeRayon;
        this.genre = genre;
        this.exemplaires = exemplaires;
    }

    public Rayon(String codeRayon, String genre) {
        this.codeRayon = codeRayon;
        this.genre = genre;
    }

    public String getCodeRayon() {
        return codeRayon;
    }

    public void setCodeRayon(String codeRayon) {
        this.codeRayon = codeRayon;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Exemplaire> getExemplaires() {
        return exemplaires;
    }

    public void setExemplaires(List<Exemplaire> exemplaires) {
        this.exemplaires = exemplaires;
    }

    /*public List<Exemplaire> listerExamplaire(){

    }*/
}
