public class Fibonacci1 {
    static void fibonacci(int n){

        if(n<=1){
            return 0;
        }else if(n==2){
            return 1;
        }

        int v1 = fibonacci(n-1);
        int v2 = fibonacci(n-2);

    }

    public static void main(String args[]){    
        int count=10;    
        System.out.print(n1+" "+n2);//printing 0 and 1    
        fibonacci(count-2);//n-2 because 2 numbers are already printed   
       }  
}
