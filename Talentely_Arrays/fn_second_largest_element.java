package Talentely_Arrays;
import java.util.*;
public class fn_second_largest_element {
	
	  static int second_larg_ele(int arr[], int size)
	  {
	    int ind,first,second;
	    first=second=Integer.MIN_VALUE;    //doubt
	    for(ind=0;ind<size;ind++)
	    {
	      if(arr[ind] > first)
	      {
	        second = first;
	        first = arr[ind];
	      }
	      else if(arr[ind] > second && arr[ind]!=first)
	      {
	        second = arr[ind];
	      }
	    }
	    return second;
	  }
	  public static void main(String[] args)
	  {
	    int ind,size;
	    Scanner sc = new Scanner(System.in);
	    size = sc.nextInt();
	    int[] arr = new int[size];
	    for(ind=0; ind<size; ind++)
	      arr[ind]=sc.nextInt();
	    System.out.printf("%d",second_larg_ele(arr,size));
	  }
	

}
