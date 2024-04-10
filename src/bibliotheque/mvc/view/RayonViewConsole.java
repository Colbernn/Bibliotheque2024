package bibliotheque.mvc.view;

import bibliotheque.metier.Rayon;
import bibliotheque.metier.TypeLivre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static bibliotheque.utilitaires.Utilitaire.*;


public class RayonViewConsole extends AbstractViewRayon {
    Scanner sc = new Scanner(System.in);


    @Override
    public void menu() {
        update(RayonController.getAll());
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
        Rayon a = la.get(nl);
        boolean ok = RayonController.remove(a);
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
            Rayon rech = new Rayon(nom, prenom, nat);
            Rayon a = RayonController.search(rech);
            if(a==null) affMsg("Rayon inconnu");
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
        Rayon a = la.get(choix-1);
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
        RayonController.update(a);
   }


    public void ajouter() {
        Rayon a;
        do {
            try {
                System.out.println("nom ");
                String nom = sc.nextLine();
                System.out.println("prénom ");
                String prenom = sc.nextLine();
                System.out.println("nationalité");
                String nat = sc.nextLine();
                a = new Rayon(nom, prenom, nat);
                break;
            } catch (Exception e) {
                System.out.println("une erreur est survenue : "+e.getMessage());
            }
        }while(true);
        RayonController.add(a);
    }

    public void special(Rayon a) {

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


    public void listerGenre(Rayon a) {
        System.out.println("genre :");
        String genre = sc.nextLine();
        affListe(new ArrayList(RayonController.listerOuvrages(a,genre)));
    }


    public void listerOuvrages(Rayon a){
        affList(new ArrayList(RayonController.listerOuvrages(a)));
    }


    public void listerLivres(Rayon a){
        TypeLivre[] tlv = TypeLivre.values();
        int ch2 = choixListe(List.of(tlv));
        TypeLivre tl = tlv[ch2-1];
        affList(new ArrayList(RayonController.listerLivre(a,tl)));
    }

    @Override
    public void affList(List la) {
        affListe(la);
    }
}
