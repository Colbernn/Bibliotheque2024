package bibliotheque.anonyme;

import bibliotheque.metier.Auteur;
import bibliotheque.metier.Ouvrage;

import java.util.Collections;
import java.util.Comparator;

public class TriAuteur {
public static void main(String args[]){

         //tri sur l'age
         Collections.sort(laut, new Comparator<Auteur>(){ //au lieu de new AgeComparator


        //tri sur le nom
         Collections.sort(laut, new Comparator<Auteur>());


         public int compare(Auteur aut1,Auteur aut2){
                        String aut1Nom = aut1.getNom();
                        String aut2Nom = aut2.getNom();
                         return aut1Nom.compareTo(aut2Nom);
                         }
 }
                 );

         System.out.println("\n\nOrdre des auteurs apres tri sur le nom");
                 System.out.println(laut);

    }
}
