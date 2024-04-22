package bibliotheque.anonyme;

import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.Rayon;

import java.util.Collections;
import java.util.Comparator;

public class TriRayon {
public static void main(String args[]){

         //tri sur l'age
         Collections.sort(lemp, new Comparator<Ouvrage>(){ //au lieu de new AgeComparator


        //tri sur le nom
         Collections.sort(, new Comparator<Ouvrage>()


         public int compare(Rayon ray1, Rayon ray2){
                        String ouv1Titre = ouv1.getTitre();
                        String ouv2Titre = ouv2.getTitre();
                         return ouv1Titre.compareTo(ouv2Titre);
                         }
 }
                 );

         System.out.println("\n\nOrdre des employes apres tri sur le nom");
                 System.out.println(lemp);

    }
}
