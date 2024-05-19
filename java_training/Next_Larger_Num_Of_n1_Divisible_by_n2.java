package java_training;
import java.util.*;
public class Next_Larger_Num_Of_n1_Divisible_by_n2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		for(int i=n1+1;i!=0;i++) {
			if(i%n2==0) {
				System.out.print(i);
				break;}
		}
	}

}
