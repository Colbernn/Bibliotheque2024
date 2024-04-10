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


    public abstract Set<Ouvrage> listerOuvrages(Ouvrage a);

    public abstract List<Livre> listerLivre(Ouvrage a, TypeLivre tl) ;

    public abstract List<Ouvrage> listerOuvrages(Ouvrage a, String genre);

    public List<Ouvrage> getNotification(){
        return getAll();
    }
}