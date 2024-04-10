package bibliotheque.mvc.view;

import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.TypeLivre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static bibliotheque.utilitaires.Utilitaire.*;


public class OuvrageViewConsole extends AbstractViewOuvrage {
    Scanner sc = new Scanner(System.in);


    @Override
    public void menu() {
        update(OuvrageController.getAll());
        List options = Arrays.asList("ajouter", "retirer", "rechercher","modifier","fin");
        do {
            int ch = choixListe(options);

            switch (ch) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    retirer();
                    break;
                case 3:
                    rechercher();
                    break;
                case 4:
                    modifier();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

    private void retirer() {
        int nl = choixElt(la)-1;
        Ouvrage a = la.get(nl);
        boolean ok = OuvrageController.remove(a);
        if(ok) affMsg("client effacé");
        else affMsg("client non effacé");
    }

    private void affMsg(String msg) {
        System.out.println(msg);
    }


    public void rechercher() {
        try {
            System.out.println("nom ");
            String nom = sc.nextLine();
            System.out.println("prénom ");
            String prenom = sc.nextLine();
            System.out.println("nationalité");
            String nat = sc.nextLine();
            Ouvrage rech = new Ouvrage(nom, prenom, nat);
            Ouvrage a = OuvrageController.search(rech);
            if(a==null) affMsg("Ouvrage inconnu");
            else {
                affMsg(a.toString());
                special(a);
            }
        }catch(Exception e){
            System.out.println("erreur : "+e);
        }

    }


    public void modifier() {
        int choix = choixElt(la);
        Ouvrage a = la.get(choix-1);
         do {
            try {
                String nom = modifyIfNotBlank("nom", a.getNom());
                String prenom = modifyIfNotBlank("prénom", a.getPrenom());
                String nat = modifyIfNotBlank("nationalité", a.getNationalite());
                a.setNom(nom);
                a.setPrenom(prenom);
                a.setNationalite(nat);
                break;
            } catch (Exception e) {
                System.out.println("erreur :" + e);
            }
        }while(true);
        OuvrageController.update(a);
   }


    public void ajouter() {
        Ouvrage a;
        do {
            try {
                System.out.println("nom ");
                String nom = sc.nextLine();
                System.out.println("prénom ");
                String prenom = sc.nextLine();
                System.out.println("nationalité");
                String nat = sc.nextLine();
                a = new Ouvrage(nom, prenom, nat);
                break;
            } catch (Exception e) {
                System.out.println("une erreur est survenue : "+e.getMessage());
            }
        }while(true);
        OuvrageController.add(a);
    }

    public void special(Ouvrage a) {

        List options = Arrays.asList("lister ouvrages", "lister livres", "lister par genre","fin");
        do {
            int ch = choixListe(options);

            switch (ch) {

                case 1:
                    listerOuvrages(a);
                    break;
                case 2:
                    listerLivres(a);
                    break;
                case 3:
                    listerGenre(a);
                    break;
                  case 4 :return;
            }
        } while (true);

    }


    public void listerGenre(Ouvrage a) {
        System.out.println("genre :");
        String genre = sc.nextLine();
        affListe(new ArrayList(OuvrageController.listerOuvrages(a,genre)));
    }


    public void listerOuvrages(Ouvrage a){
        affList(new ArrayList(OuvrageController.listerOuvrages(a)));
    }


    public void listerLivres(Ouvrage a){
        TypeLivre[] tlv = TypeLivre.values();
        int ch2 = choixListe(List.of(tlv));
        TypeLivre tl = tlv[ch2-1];
        affList(new ArrayList(OuvrageController.listerLivre(a,tl)));
    }

    @Override
    public void affList(List la) {
        affListe(la);
    }
}
