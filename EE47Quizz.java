	/** 
 	* Ce programme permet d'administrer un quizz d'additions.
 	* Le quizz comporte 10 questions
 	* Chaque question est une addition de nombre générés aléatoirement. Par exemple 1+3=?
 	* L'utilisateur doit répondre à la totalité des questions
 	* Le programme permet ensuite d'afficher la réponse de l'utilisateur et d'indiquer si celle ci est correcte ou erronnée
 	* Si la reponse est correcte, le programme indique à l'utilisateur qu'il a la bonne réponse.
 	* Si la réponse est fausse, le programme indique la bonne réponse à l'utilisateur
 	* Pour chaque bonne réponse, l'utilisateur gagne 10 points.
 	* Le programme affiche finalement le score de l'utilisateur
 	* 
 	* @author daono
 	* @version 2
 	*
 	
*/

package monPackage;

import java.util.Scanner;

public class EE47Quizz {

        private static int[] nb1;
        private static int[] nb2;
        private static int[] rep;
        
        public static void main(String[] args) {
                quizz();
                admin();
                note();
        }
        
        private static void quizz()
        {
                nb1= new int [10];
                nb2= new int [10];
                        for(int i = 0; i<10; i++)
                        {
                                nb1[i] = (int)(Math.random()*50+1);
                                nb2[i] = (int)(Math.random()*50+1);
                        }
        
       } 
        
        private static void admin()
        {
                Scanner scan = new Scanner(System.in);
                rep= new int[10];
                for(int i = 0; i<10; i++)
                {
                        System.out.println("Question " +(i+1) + " : "+nb1[i]+" + "+nb2[i]+ " = ?");
                        rep[i] = Integer.parseInt(scan.nextLine());
                }  
                scan.close();
         } 
        
        private static void note()
        {
                int nbrepok = 0;
                for(int i = 0; i<10;i++)
                {
                        if(rep[i] == nb1[i] + nb2[i])
                        {
                                System.out.println("Bravo ! La réponse était bien"+(nb1[i]+nb2[i]));
                                nbrepok++;
                        }
                        else
                        {
                               System.out.println("Oups ! Vous avez répondu "+ rep[i]+ " Mais la réponse etait : " +(nb1[i]+nb2[i]));
                         }
                

                }
                nbrepok=nbrepok*10;
                System.out.println("Votre note finale est " + nbrepok+"/100");
        }
}

