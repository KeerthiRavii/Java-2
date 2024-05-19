package java_training;
import java.util.*;
public class Star_Pattern_2 {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 
    	 for(int i=n;i>=1;i--) {
    		 for(int j=n;j<=i;j--) {
    			 System.out.print("*");
    		 }
    		 System.out.println();
    	 }
     }
}
