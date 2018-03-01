	/** 
 	* Ce programme permet de savoir combien de fois on doit lancer une paire de dés pour obtenir un snake eyes
 	* Pour rappel: on obtient un snake eyes lorsque la somme des dés est égale à 2
 	* @author daono
 	* @version 2
 	* @param sommedesdés représente la somme des dés
 	* @return nblancers représente le nombre de lancers qu'il faut afin d'obtenir un snake eyes
 	* @throws IllegalArgumentException si jamais la somme des dés n'est pas comprise entre 2 et 12
*/

package monPackage;

public class EE43LancerDes {



        public static void main(String[] args) {
                System.out.println("On a eu besoin de " + lancers(2)+" lancers de des pour obtenir un snake eyes");
                
                
        }
        
        public static int lancers(int sommedesdés)
        {
                if(sommedesdés < 2 || sommedesdés > 12)
                {
                        throw new IllegalArgumentException("Erreur, la somme des dés n'est pas comprise entre 2 et 12");
                }
                int dé1;
                int dé2;
                int nblancers=0;
                
                do {
                        dé1 = (int) (Math.random()*6.0+1);
                        dé2 = (int) (Math.random()*6.0+1);
                        nblancers++;
                }while(dé1+dé2 != sommedesdés);
                
                return nblancers;
        }

}
