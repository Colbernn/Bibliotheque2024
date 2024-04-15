package bibliotheque.mvc.view;

import bibliotheque.metier.Lecteur;
import bibliotheque.metier.TypeLivre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static bibliotheque.utilitaires.Utilitaire.*;


public class LecteurViewConsole extends AbstractViewLecteur {
    Scanner sc = new Scanner(System.in);


    @Override
    public void menu() {
        update(LecteurController.getAll());
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
        Lecteur a = la.get(nl);
        boolean ok = LecteurController.remove(a);
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
            System.out.println("adresse");
            String adresse = sc.nextLine();
            System.out.println("mail");
            String mail = sc.nextLine();
            System.out.println("tel");
            String tel = sc.nextLine();
            System.out.println("numero de lecteur");
            int numlecteur = sc.nextInt();
            System.out.println("date");
            LocalDate dn = lecDate();
            Lecteur rech = new Lecteur(numlecteur,nom, prenom,dn, adresse, mail, tel);
            Lecteur a = LecteurController.search(rech);
            if(a==null) affMsg("Lecteur inconnu");
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
        Lecteur l = la.get(choix-1);
         do {
            try {
                String nom = modifyIfNotBlank("nom", l.getNom());
                String prenom = modifyIfNotBlank("prénom", l.getPrenom());
                String adresse = modifyIfNotBlank("nationalité", l.getAdresse());
                String mail = modifyIfNotBlank("nationalité", l.getMail());
                String tel = modifyIfNotBlank("nationalité", l.getTel());
                l.setNom(nom);
                l.setPrenom(prenom);
                l.setAdresse(adresse);
                l.setMail(mail);
                l.setTel(tel);
                break;
            } catch (Exception e) {
                System.out.println("erreur :" + e);
            }
        }while(true);
        LecteurController.update(l);
   }


    public void ajouter() {
        Lecteur le;
        do {
            try {
                System.out.println("nom ");
                String nom = sc.nextLine();
                System.out.println("prénom ");
                String prenom = sc.nextLine();
                System.out.println("adresse");
                String adresse = sc.nextLine();
                System.out.println("mail");
                String mail = sc.nextLine();
                System.out.println("tel");
                String tel = sc.nextLine();
                System.out.println("numero de lecteur");
                int numlecteur = sc.nextInt();
                System.out.println("date");
                LocalDate dn = lecDate();
                le = new Lecteur(numlecteur,nom, prenom,dn, adresse, mail, tel);
                break;
            } catch (Exception e) {
                System.out.println("une erreur est survenue : "+e.getMessage());
            }
        }while(true);
        LecteurController.add(le);
    }

    public void special(Lecteur a) {

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


    public void listerGenre(Lecteur a) {
        System.out.println("genre :");
        String genre = sc.nextLine();
        affListe(new ArrayList(LecteurController.listerOuvrages(a,genre)));
    }


    public void listerOuvrages(Lecteur a){
        affList(new ArrayList(LecteurController.listerOuvrages(a)));
    }


    public void listerLivres(Lecteur a){
        TypeLivre[] tlv = TypeLivre.values();
        int ch2 = choixListe(List.of(tlv));
        TypeLivre tl = tlv[ch2-1];
        affList(new ArrayList(LecteurController.listerLivre(a,tl)));
    }

    @Override
    public void affList(List la) {
        affListe(la);
    }
}
