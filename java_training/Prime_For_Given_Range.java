package java_training;

import java.util.Scanner;

public class Prime_For_Given_Range {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		if(start==1)
			start=start+1;
		int end=sc.nextInt();
		int count=0;
		sc.close();
	
  for(int i=start;i<=end;i++) {
	for(int j=1;j<=i/2;j++) {
		if(i%j==0) {
			count++;
	}}
  if(count<2) {
	  
	 System.out.print(i+",");
	}
	count=0;
	}}}
/* public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    long start=sc.nextLong();
	    long end=sc.nextLong();
	    long count=0;
	    if(start==1)
	    start=start+1;
	    for(long i=start;i<end;i++){
	      for(long j=1;j<=i/2;j++){
	      if(i%j==0){
	      count++;
	      //System.out.println(count+i);}
	      }}
	   if(count<2){
	    System.out.print(i+",");
	    }
	    count=0;
	    }  }}*/