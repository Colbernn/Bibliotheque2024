package bibliotheque.mvc.view;

import bibliotheque.metier.Ouvrage;
import bibliotheque.mvc.controller.OuvrageController;
import bibliotheque.mvc.observer.Observer;

import java.util.List;


public abstract  class AbstractViewOuvrage implements Observer {

    protected OuvrageController OuvrageController;
    protected List<Ouvrage> la;

    public void setController(OuvrageController OuvrageController) {
        this.OuvrageController = OuvrageController;
    }

    public abstract void menu();

    public abstract void affList(List la);

    public List<Ouvrage> getAll(){
        return la;
    }
    @Override
    public void update(List la) {
        this.la = la;
        affList(la);
    }
}
