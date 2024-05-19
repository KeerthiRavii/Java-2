package java_training;
import java.util.*;

public class triangle {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int l1=sc.nextInt();
		int l2=sc.nextInt();
		int l3=sc.nextInt();
		sc.close();
		if((l1+l2)>l3) {
			if((l2+l3)>l1){
				if((l3+l1)>l2) {
					System.out.println("Triangle can be formed");
				}
			}
		}
		else {
			System.out.println("Triangle can not be formed");
		}
	}
}
