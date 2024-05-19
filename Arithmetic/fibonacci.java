package Arithmetic;
import java.util.*;

public class fibonacci {
	public static void main(String[] args ) {
		Scanner k=new Scanner(System.in);
		 int count=k.nextInt();
		 
		int n1=0,n2=1,n3,i;
		System.out.print(n1+" "+n2);
		for(i=0;i<=count;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			k.close();
		}
	}	
}
	
    /* int n1=0,n2=1,n3=0;    
		 int c=0;    
		  System.out.print(n1+" "+n2);
			    while(count<=10){    
			         n3 = n1 + n2;    
			         n1 = n2;    
			         n2 = n3;    
			         System.out.print(" "+n3);   
			   
		              count ++;
		             */