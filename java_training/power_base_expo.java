package java_training;
import java.util.*;
public class power_base_expo {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int base=sc.nextInt();
	 int power=sc.nextInt();
	// System.out.print(Math.pow(base,power));
	 double res=Math.pow(base, power);
	System.out.printf("%.0f",res);
	sc.close();
 }
}
