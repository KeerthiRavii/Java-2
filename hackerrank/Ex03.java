package hackerrank;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner y = new Scanner(System.in);
		int n = y.nextInt();
		
		if(n%2==1){
	        System.out.println("Weird");
		}
	    else if(n%2==0 && n>=2 && n<=5){
	     
	            System.out.println("Not weird");
	        }
	    else if(n%2==0 && n>=6 && n<=20){
	        
	            System.out.println("Weird");
	        }
	   
	    else if (n%2==0 && n>=20){
	       
	        System.out.println("Not weird");
	    }
	   
	    
		y.close();
		
		}
		
		
}
	

