package Talentely_Arrays;

import java.util.Scanner;

public class fn_print_element_morethan_half_size_of_array {
	static void major_ele(int arr[],int size){
		System.out.println("the element that is more than thehalf size of an array:");
		for(int i=0;i<size;i++) {
			if(arr[i]>size/2)
		System.out.println(arr[i]);
	}

}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	
	int[] arr=new int[size];
	
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	
	}
	major_ele(arr,size);

}}