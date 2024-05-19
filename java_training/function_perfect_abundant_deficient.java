package java_training;

import java.util.Scanner;

public class function_perfect_abundant_deficient {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	 
	   int factorial=fact(num);
	   System.out.println("The factorial is:"+factorial);
	   if(factorial==num)
		   System.out.println("Perfect");
	   else if(factorial>num)
		   System.out.println("Abundant");
	   else if(factorial<num)
		   System.out.println("Deficient");
   }
 
   public static int fact(int num) {
	   int sum=0;
	   for(int i=1;i<=num/2;i++) {
		   if(num%i==0) {
			
		   sum=sum+i;}
	   }
	   
	   return sum;
   }
   
}
