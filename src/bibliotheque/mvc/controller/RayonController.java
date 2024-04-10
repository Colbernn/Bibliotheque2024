package bibliotheque.mvc.controller;

import bibliotheque.metier.Rayon;
import bibliotheque.metier.Livre;
import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.TypeLivre;
import bibliotheque.metier.Rayon;
import bibliotheque.metier.Rayon;
import bibliotheque.mvc.model.DAORayon;
import bibliotheque.mvc.view.AbstractViewRayon;

import java.util.List;
import java.util.Set;


public class RayonController {

    protected DAORayon model;
    protected AbstractViewRayon view;

    public RayonController(DAORayon model, AbstractViewRayon view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
    }

    public List<Rayon> getAll(){
        List<Rayon> l = model.getAll();
        return l;
    }

    public Rayon add( Rayon elt) {
        Rayon nelt = model.add(elt);
        return nelt;
    }


    public boolean remove(Rayon elt) {
        return model.remove(elt);
    }
    public Rayon update(Rayon elt) {
        return model.update(elt);
    }

    public Rayon search(Rayon rech) {
        return  model.read(rech);
    }
    public Set<Ouvrage> listerOuvrages(Rayon a) {
      return model.listerOuvrages(a);
    }

    public List<Livre> listerLivre(Rayon a, TypeLivre tl) {

        return model.listerLivre(a,tl);
    }

    public List<Ouvrage> listerOuvrages(Rayon a, String genre) {
       return model.listerOuvrages(a,genre);
    }
}
