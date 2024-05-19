package java_training;

import java.util.Scanner;

public class lab {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l1=sc.nextInt();
		int l2=sc.nextInt();
		int l3=sc.nextInt();
		String s=sc.next();
		//int l=Integer.parseInt(s);
	/*	int min1=0,min2=0,min3=0;
		if(l1<l2 && l1<l3) {
		min1=l1;}
		else if(l2<l3 && l2<l1) {
			 min2=l2;}
		else {
			min3=l3;}
		
		/*if(l!=min1) {
			System.out.print("min is:"+min1);		}
		else if(l!=min2) {
			System.out.print("min is:"+min2);}
		else {
			System.out.print("min is:"+min3);
		}
		if(s==l1) {
			System.out.print("min is:"+min2);
		}
		else if(s==l2){
			System.out.print("min is:"+min1);
		}
		else if(s==l3){
			System.out.print("min is:"+min1);
		}

}*/  if(s.equals("l1")) {
	if(l2>l3)
		System.out.print("l3 "+l3);
	else
		System.out.print("l2 "+l2);
}
if(s.equals("l2")) {
	if(l1>l3)
		System.out.print("l3 "+l3);
	else
		System.out.print("l1 "+l1);
}
if(s.equals("l3")) {
	if(l1>l2)
		System.out.print("l2 "+l2);
	else
		System.out.print("l3 "+l3);
}
		}}
