package biblio.metier;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class CD extends Ouvrage {

    private long code;
    private byte nbrePlages;
    private LocalTime dureeTotale;

    public CD(String titre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage,
              double prixLocation, String langue, String genre, long code, byte nbrePlages, LocalTime dureeTotale) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.code = code;
        this.nbrePlages = nbrePlages;
        this.dureeTotale = dureeTotale;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public byte getNbrePlages() {
        return nbrePlages;
    }

    public void setNbrePlages(byte nbrePlages) {
        this.nbrePlages = nbrePlages;
    }

    public LocalTime getDureetotale() {
        return dureeTotale;
    }

    public void setDureetotale(LocalTime dureetotale) {
        this.dureeTotale = dureetotale;
    }

    /*public double amenderetard(int njours){

    }*/
}
