package Arithmetic;
import java.util.*;

public class primenumbers {
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
    int n= S.nextInt();
    
    int flag=0,i;
    int m=n/2;
    
    if(n==0||n==1) {
    	System.out.println("n is not a prime number");
    }
    else {
    	for(i=2;i<=m;i++) {
    		if(n%i==0) {
    			System.out.println("n is not a prime number");
    			flag=1;
    			  S.close();
    		}
    	}
    	

    if(flag==0) {
    	System.out.println("n is a prime number");
    
    }
 
    }
    
	}
	
	
}
