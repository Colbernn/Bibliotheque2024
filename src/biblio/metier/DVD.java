package biblio.metier;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class DVD extends Ouvrage{
    private long code;
    private LocalTime dureeTotale;
    private byte nbreBonus;
    private List<String> autresLangues;
    private List<String> sousTitres;

    public DVD(String titre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage,
               double prixLocation, String langue, String genre, long code, LocalTime dureeTotale, byte nbreBonus,
               List<String> autresLangues, List<String> sousTitres) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.code = code;
        this.dureeTotale = dureeTotale;
        this.nbreBonus = nbreBonus;
        this.autresLangues = autresLangues;
        this.sousTitres = sousTitres;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public LocalTime getDureeTotale() {
        return dureeTotale;
    }

    public void setDureeTotale(LocalTime dureeTotale) {
        this.dureeTotale = dureeTotale;
    }

    public byte getNbreBonus() {
        return nbreBonus;
    }

    public void setNbreBonus(byte nbreBonus) {
        this.nbreBonus = nbreBonus;
    }

    public List<String> getAutresLangues() {
        return autresLangues;
    }

    public void setAutresLangues(List<String> autresLangues) {
        this.autresLangues = autresLangues;
    }

    public List<String> getSousTitres() {
        return sousTitres;
    }

    public void setSousTitres(List<String> sousTitres) {
        this.sousTitres = sousTitres;
    }

   /* public double amendeRetard(int njours){

    }*/
}
