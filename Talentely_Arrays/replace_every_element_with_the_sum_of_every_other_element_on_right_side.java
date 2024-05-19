package Talentely_Arrays;
import java.util.*;
public class replace_every_element_with_the_sum_of_every_other_element_on_right_side {
    static void sum_and_swap(int arr[],int size){
    	int sum=0;
    	for(int i=0;i<size;i++) {
    		sum=sum+arr[i];
    	}
    	for(int i=0;i<size;i++) {
    		arr[i]=sum-arr[i];
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
    	sum_and_swap(arr,size);
    }
}
