package java_training;
import java.util.*;
public class print_UpperCase_Last {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char []ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(ch[i]>='A' && ch[i]<='Z')
				continue;
			else
				System.out.print(ch[i]);
		}
		
		for(int i=0;i<str.length();i++) {
			if(ch[i]>='A' && ch[i]<='Z')
				System.out.print(ch[i]);
		}
	}

}
