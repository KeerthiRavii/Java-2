package Talentely_Arrays;

import java.util.Scanner;

public class fn_count_no_0_and_1 {
	
	static void count_zero(int arr[],int size){
		int zc=0,oc=0;
		for(int i=0;i<size;i++) {
			if(arr[i]==0)
			zc++;
		else
			oc++;
			}
		System.out.println("0 count:"+zc);
		System.out.print("1 count:"+oc);
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
	}
	count_zero(arr, size);	
	}
	}