package hackerrank;

import java.util.Scanner;

public class demo {
public static void main(String[] args) {
		
		Scanner y = new Scanner(System.in);
		int n = y.nextInt();
		 if(n==0) {
			 System.out.println("Weird");
		 }
		 else if(n%2==0 && n>6) {
	 System.out.println("tt");
		 }
		 
		 else {
			 System.out.println("f");
		 }

		 y.close();
}
}