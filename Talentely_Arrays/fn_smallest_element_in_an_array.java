package Talentely_Arrays;

import java.util.Scanner;

public class fn_smallest_element_in_an_array {
	 static int min(int arr[],int size) {
    	 int  min=arr[0];
    	  for(int i=0;i<size;i++) {
    		  if(min>arr[i])
    			  min=arr[i];
    	  }
    	  return min;
      }
      
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  int size=sc.nextInt();
    	  int arr[]=new int[size];
    	  for(int i=0;i<size;i++) {
    		  arr[i]=sc.nextInt();
    	  }
 System.out.println("Minimum element in the array is:"+min(arr,size));
    	  }

}
