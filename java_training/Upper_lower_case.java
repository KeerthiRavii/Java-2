package java_training;
import java.util.Scanner;

public class Upper_lower_case {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
        sc.close();
		{
			if((ch>='a') && (ch<='z')||(ch>='A') && (ch<='Z')) {
				if((ch>='a')&&(ch>='z')) {
				System.out.printf("%c",ch+32);
			 }
				else  {
					System.out.printf("%c",ch-30);
				 }
			}
			else {
				System.out.println("Not a alphabet");
			}
			
		
		
}
}
}