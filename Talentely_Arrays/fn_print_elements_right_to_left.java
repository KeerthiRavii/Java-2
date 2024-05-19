package Talentely_Arrays;
import java.util.*;
public class fn_print_elements_right_to_left {
  static void print_right_to_left(int arr[],int size){
		
		for(int i=size-1;i>=0;i--) {
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
	print_right_to_left(arr,size);
  }
	
}

