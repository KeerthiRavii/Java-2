package Talentely_Arrays;
import java.util.*;
public class fn_largest_element {
      static int max(int arr[],int size) {
    	 int  max=arr[0];
    	  for(int i=0;i<size;i++) {
    		  if(max<arr[i])
    			  max=arr[i];
    	  }
    	  return max;
      }
      
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  int size=sc.nextInt();
    	  int arr[]=new int[size];
    	  for(int i=0;i<size;i++) {
    		  arr[i]=sc.nextInt();
    	  }
 System.out.println("Maximum element in the array is:"+max(arr,size));
    	  }
} 
