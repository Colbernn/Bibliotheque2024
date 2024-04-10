package bibliotheque.mvc.model;

import bibliotheque.metier.Rayon;
import bibliotheque.metier.Livre;
import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.TypeLivre;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RayonModel extends DAORayon {

    private List<Rayon> ldatas = new ArrayList<>();


    @Override
    public Rayon add( Rayon elt) {
        boolean present =ldatas.contains(elt);
        if (!present) {
            ldatas.add(elt);
            notifyObservers();
            return elt;
        } else return null;
    }

    @Override
    public boolean remove( Rayon elt) {
        boolean ok = ldatas.remove(elt);
        notifyObservers();
        return ok;
    }

    @Override
    public Rayon update(Rayon elt) {
        int p = ldatas.indexOf(elt);
        if (p < 0) return null;
        ldatas.set(p, elt);
        notifyObservers();
        return elt;
    }

    @Override
    public Rayon read(Rayon rech) {
        int p = ldatas.indexOf(rech);
        if(p<0) return null;
        return ldatas.get(p);
    }

    @Override
    public List<Rayon> getAll() {
        return ldatas;
    }

    @Override
    public Set<Ouvrage> listerOuvrages(Rayon a) {
        return a.listerOuvrages();
    }

    @Override
    public List<Livre> listerLivre(Rayon a, TypeLivre tl) {
        return a.listerLivres(tl);
    }

    @Override
    public List<Ouvrage> listerOuvrages(Rayon a, String genre) {
        return a.listerOuvrages(genre);
    }
}
