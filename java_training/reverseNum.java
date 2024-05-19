package java_training;
import java.util.*;
public class reverseNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int rem;
		int ans=0;
		while(num>0) {
			rem=num%10;
			ans=ans*10+rem;
			num=num/10;
		}
		System.out.print(ans);
   }

}

