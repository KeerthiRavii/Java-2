package java_training;
import java.util.*;

public class Multiplesof11 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  if(n%11==0) {
		  System.out.println("Divisible by 11");
	  }
	  else {
		  System.out.println("Not Divisible by 11");
	  }
	  sc.close();
  }
}
