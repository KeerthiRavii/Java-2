package java_training;

import java.util.Scanner;

public class Sum_Two_Consecutive_Num {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  int inp=sc.nextInt();
    	  int sum=0,temp=0;
    	  for(int i=0;i<inp;i++) {
    		  sum=temp+i;
    		  if(sum==inp) {
    			  System.out.print(temp+","+i);
    			  break;
    			  }
    		  else
    		  temp=i;
    	  }
    	 sc.close();
    	  } 
    	  }
      
