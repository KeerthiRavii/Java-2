package loops;
import java.util.*;
public class print_a_z {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		int n=0;
		sc.close();
		
		while(ch<='z') {
			System.out.print(ch);
			ch++;
			n++;
			
		}
		System.out.print("\n");
		int i=0;
	
	
		
		while(i<n) {
			System.out.print("~");
			i++;
		}
		
}
}