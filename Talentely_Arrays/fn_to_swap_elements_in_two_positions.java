package Talentely_Arrays;
import java.util.*;
public class fn_to_swap_elements_in_two_positions {
	static void swap(int size,int arr[],int pos1,int pos2) {
		if(pos1>=size||pos2>=size||size<0) {
			System.out.print("Invalid");}
		else {
			int temp=arr[pos1];
			 arr[pos1]=arr[pos2];
			 arr[pos2]=temp;
		
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int pos1=sc.nextInt();
		int pos2=sc.nextInt();
		 
		swap(size,arr,pos1,pos2);
		
		
	}
	
}
