package bibliotheque.mvc.model;

import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.Livre;
import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.TypeLivre;
import bibliotheque.mvc.observer.Subject;

import java.util.List;
import java.util.Set;

public abstract class DAOOuvrage extends Subject {


    public abstract Ouvrage add( Ouvrage elt) ;

    public abstract boolean remove( Ouvrage elt) ;

    public abstract Ouvrage update(Ouvrage elt) ;

    public abstract Ouvrage read(Ouvrage rech) ;

    public abstract List<Ouvrage> getAll() ;

    public List<Ouvrage> getNotification(){
        return getAll();
    }
}