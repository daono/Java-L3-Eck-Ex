import java.util.Scanner;

public class EE34Phrase {
	
public static Scanner scan = new Scanner( System.in );
	public static void main(String[] args) {
		String phrase; //phrase entrée par l'utilisateur
		int i; //compteur
		char l;
		l=0 ;
		
	        System.out.print("Tapez une phrase ");
	        phrase = scan.nextLine();
	        
	    for ( i = 0;  i < phrase.length();  i++ ) {
	       l=phrase.charAt(i);
	            
	       if ( Character.isLetter(l) )
	    	      System.out.print(l);  
	    	 else 
	    	    System.out.println();   
	    	   
	    }
	 
	} 
}

