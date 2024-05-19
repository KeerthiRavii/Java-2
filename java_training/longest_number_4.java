package java_training;

import java.util.Scanner;

public class longest_number_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		
		sc.close();
		
		if((num1>num2)&&(num1>num3)&&(num1>num4)) {
			System.out.printf("%d is larger number",num1);
		}
		else if((num2>num3)&&(num2>num4)) {
			System.out.printf("%d is larger number",num2);
		}
		else if(num3>num4) {
			System.out.printf("%d is larger number",num3);
		}
		else {
			System.out.printf("%d is larger number",num4);
		}

}
}