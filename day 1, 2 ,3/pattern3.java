
import java.util.Scanner;
public class pattern3
{
	public static void main(String[] args) {
	   int i , j , n=5; 
	    
      //1st half
      for (i= 1; i<=n ; i++)  {  
          
           for (j=1; j<=n-i; j++) {  
              System.out.print(" ");  
            }  
           for(j=1 ; j<=i*2-1 ; j++){ 
               System.out.print("*");
               
           }  
           System.out.println();

    }  
    
    //2nd half
    for(i=n-1 ; i >0 ; i--){
        for (j=1; j<=n-i; j++) {  
              System.out.print(" ");  
            }  
           for(j=1 ; j<=i*2-1 ; j++){ 
               System.out.print("*");
               
           }  
           System.out.println();
    }
  }  
}
