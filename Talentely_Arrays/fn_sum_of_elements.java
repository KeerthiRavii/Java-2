package Talentely_Arrays;

import java.util.Scanner;

public class fn_sum_of_elements {
	static void sum(int arr[],int size){
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		System.out.print(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		sum(arr,size);
	}
	

}
