package myPackage;
/**
 * 
 * @author daono
 *This program rolls a pair of dice and counts the number of times
 *the pair has to be rolled until we get a certain total
 *Then statistics are printed such as
 *the average number of rolls,
 * the standard deviation,
 * and the maximum number of rolls.
 */
public class Main {
   
   private static PairOfDice dice = new PairOfDice();

   
   public static void main(String[] args) {
   
       System.out.println("Dice Total   Avg # of Rolls   Stand. Deviation   Max # of Rolls");
       System.out.println("----------   --------------   ----------------   --------------");

       for ( int total = 2;  total <= 12;  total++ ) {
          StatCalc stats; 
          stats = new StatCalc();
          for ( int i = 0; i < 10000; i++ ) {
          
             stats.enter( getCompteur(total) );
          }
          System.out.printf("%6d", total);
          System.out.printf("%18.3f", stats.getMean());
          System.out.printf("%19.3f", stats.getStandardDeviation());
          System.out.printf("%14.3f", stats.getMax());
          System.out.println();
       }
       
   }
   
/**
 * 
 * @param the total we want to get with the pair of dice
 * @return the number of times we needed to roll the pair of dice to get that total
 */
   static int getCompteur( int N ) {
       int compteur = 0; 
       do {
          dice.roll();
          compteur++;
       } while ( dice.getTotal() != N );
       return compteur;
   }

   
} 