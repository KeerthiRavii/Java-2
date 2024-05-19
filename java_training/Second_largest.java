package java_training;
import java.util.*;

public class Second_largest {
  public static void main(String [] args) {
	  Scanner sc=new Scanner(System.in);
	    int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		int max,min,total;
		max=num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println("max is:"+max);
		
		min= num1<num2?(num1<num3?num1:num3):(num2<num3?num2:num3);
		System.out.println("min is:"+min);
		total=num1+num2+num3;
		int t;
		t=total-max-min;
		System.out.println("The second largest number is:"+t);
		
		sc.close();
		
  }
}
