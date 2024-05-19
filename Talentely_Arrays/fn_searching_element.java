package Talentely_Arrays;
import java.util.*;
public class fn_searching_element {
 static int search(int arr[],int key,int size) {
	 
	 for(int i=0;i<size;i++) {
		 if(arr[i]==key)
			 return 1;
		
	 }
	 return 0;
 }
 
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int size=sc.nextInt();
	
	 int[] arr=new int[size];
	 
	 for(int i=0;i<size;i++) {
		 arr[i]=sc.nextInt();
	 }
	 int key=sc.nextInt();
	if( search(arr,key,size)==1)
		System.out.print("Element is found");
	else
		System.out.print("Element is not found");
 }
}
