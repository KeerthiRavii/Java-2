package java_training;
//import java.util.*;
public class Swap_Without_Temp_Variable {
//Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
int num1=5;
int num2=9;

num1=num1-num2;
num2=num2+num1;
num1=num2-num1;
System.out.println(num1);
System.out.println(num2);

}
}