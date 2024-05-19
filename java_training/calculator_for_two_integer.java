package java_training;
import java.util.*;
public class calculator_for_two_integer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		char ch=sc.next().charAt(0);
		//int n3;
		switch(ch) {
		case '+':
			System.out.print(n1+n2);
			break;
		case '-':
			System.out.print(n1-n2);
			break;
		case '*':
			System.out.print(n1*n2);
			break;
    	case '%':
			System.out.print(n1%n2);
			break;
		case '/':
			System.out.print(n1/n2);
			break;
		default:
			System.out.print("none");
			break;
			
	}
		sc.close();
}
}
