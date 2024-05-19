package Talentely_Arrays;

import java.util.Scanner;

public class print_elements_right_to_left {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			//System.out.println(arr[i]);
		}
		
		for(int i=size-1;i>=0;i--) {
			//arr[i]=sc.nextInt();
		System.out.print(arr[i]+" ");
		}
	}
}
