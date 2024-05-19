package loops;
import java.util.*;
public class print_alphabet_n_times {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		//char ch=sc.next();
		char s=ch;
sc.close();

for(int i=0;i<4;i++) {
		while(ch<='z') {
			System.out.print(ch);
			ch++;
		
		}
		System.out.print("\n");
		ch=s;
		//System.out.print(ch+" i="+i);
			
		}
	}
}