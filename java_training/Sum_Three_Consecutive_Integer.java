package java_training;
import java.util.*;
public class Sum_Three_Consecutive_Integer {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 long inp=sc.nextLong();
    	 long i;
    	 long sum=0,n1=0,n2=0,n3=0;
    	 
    	// for(i=1;i<inp;i++) 
    	/* {
    		 sum=temp+i;//0+1-->1
    		 temp=sum;//1
    		 flag=i;//1
    		 if(inp==sum) {
    			 three=temp-flag;
    			 System.out.print(flag+" "+i+" "+three);}
    		 
    	 }*/
    	 for(i=1;i<inp;i++) 
    	 {
    		 sum=(i+1)+(i+2)+(i+3);
    		 if(sum==inp) {
    			 n1=i+1;
    		     n2=i+2;
    		     n3=i+3;
    			 System.out.print(n1+" "+n2+" "+n3);
    			 break;
    			 }
    	 }
    	sc.close(); 
     }
}
