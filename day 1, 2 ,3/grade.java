
import java.util.Scanner;
public class grade
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    int marks = s.nextInt();
	    
	    if(marks >= 80){
	        System.out.println("Grade = A");
	    }else if (marks >= 60) {
	        System.out.println("Grade = B");
	    }else if (marks >= 40) {
	        System.out.println("Grade = C");
	    }else
		System.out.println("Grade = fail");
	}
}
