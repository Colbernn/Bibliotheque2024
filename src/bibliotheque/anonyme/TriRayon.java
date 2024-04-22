package bibliotheque.anonyme;

import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.Rayon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TriRayon {
public static void main(String args[]){

    ArrayList<Rayon> lray = new ArrayList<>();
         Collections.sort(lray, new Comparator<Rayon>());


         public int compare(Rayon ray1, Rayon ray2){
                        String ray1Code = ray1.getCodeRayon();
                        String ray2Code = ray2.getCodeRayon();
                         return ray1Code.compareTo(ray2Code);
                         }
 }
                 );

         System.out.println("\n\nOrdre des rayon apres tri sur le code");
                 System.out.println(lray);

    }
}
