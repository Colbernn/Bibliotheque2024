package bibliotheque.anonyme;

import bibliotheque.metier.Ouvrage;
import bibliotheque.utilitaires.comparators.OuvrageComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TriOuvrage {
public static void main(String args[]){

         //tri sur l'age
         Collections.sort(laut, new Comparator<Ouvrage>(){ //au lieu de new AgeComparator


        //tri sur le nom
         Collections.sort(, new Comparator<Ouvrage>());


         public int compare(Ouvrage ouv1,Ouvrage ouv2){
                        String ouv1Titre = ouv1.getTitre();
                        String ouv2Titre = ouv2.getTitre();
                         return ouv1Titre.compareTo(ouv2Titre);
                         }
 }
                 );

         System.out.println("\n\nOrdre des ouvrages apres tri sur le titres");
                 System.out.println(laut);

    }
}
