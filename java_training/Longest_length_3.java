package java_training;
import java.util.*;

public class Longest_length_3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int num3=sc.nextInt();
	
	if((num1>num2)&&(num1>num3)) {
		System.out.printf("%d is greater",num1);
	}
	else if((num2>num3)) {
		System.out.printf("%d is greater",num2);}
	else {
		System.out.printf("%d is greater",num3);
	}
	sc.close();
}
}
