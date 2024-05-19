package Talentely_Arrays;
import java.util.*;
public class print_elements_left_to_right {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}
	}

}
