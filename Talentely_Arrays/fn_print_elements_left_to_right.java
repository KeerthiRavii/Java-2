package Talentely_Arrays;

import java.util.Scanner;


	
public class fn_print_elements_left_to_right  {

	static void print_left_to_right(int arr[],int size){
		for(int i=0;i<size;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
	}
	
public static void main(String[] args) 
{   
            Scanner sc = new Scanner(System.in);
           int size=sc.nextInt();
           int[]arr=new int[size];
           
           for(int i=0;i<size;i++) {
   			arr[i]=sc.nextInt();
   		}
           print_left_to_right(arr,size);
	 }

}



