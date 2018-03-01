public class EE36Diviseurs {
  public static void main(String[] args) {
      int N;  
      int maxnbdiv;
      maxnbdiv = 1;
      int[] nbtemp; //stocke temporairement le nb de div pour chaque nb

      nbtemp = new int[10001];
      nbtemp[1] = 1;

      
      for ( N = 2;  N <= 10000;  N++ ) {
        int test;  
        int nbdiv; 
        nbdiv = 0;
          for ( test = 1;  test <= N;  test++ ) {
            if ( N % test == 0 )
                nbdiv++;
          }
           
        nbtemp[N] = nbdiv;
           
        if (nbdiv > maxnbdiv) {
          maxnbdiv = nbdiv;
          }
       
       }
      
System.out.println("Parmi les entiers entre 1 et 10000,");
System.out.println("Le plus grand nombre de diviseurs est de " + maxnbdiv);
System.out.println("Les nombres qui ont autant de diviseurs sont");
  for ( N = 1; N <= 10000; N++ ) {
   if ( nbtemp[N] == maxnbdiv ) {
    System.out.println( "   " + N );
           }
       }
   
   }

}