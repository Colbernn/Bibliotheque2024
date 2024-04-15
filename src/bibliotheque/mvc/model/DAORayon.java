package bibliotheque.mvc.model;

import bibliotheque.metier.Rayon;
import bibliotheque.metier.Livre;
import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.TypeLivre;
import bibliotheque.mvc.observer.Subject;

import java.util.List;
import java.util.Set;

public abstract class DAORayon extends Subject {


    public abstract Rayon add( Rayon elt) ;

    public abstract boolean remove( Rayon elt) ;

    public abstract Rayon update(Rayon elt) ;

    public abstract Rayon read(Rayon rech) ;

    public abstract List<Rayon> getAll() ;

    public List<Rayon> getNotification(){
        return getAll();
    }
}