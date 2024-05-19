package java_training;
import java.util.*;

public class Vowel_consonant {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		sc.close();
		{
		if((ch>='a') && (ch<='z')) {
			//System.out.println("Alphabet");
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
				System.out.println("Vowel");
			}
			else {
				System.out.println("Consonant");
			}
		}
		else {
			System.out.println("Not a alphabet");
		}
		}
		
		
	}

}
