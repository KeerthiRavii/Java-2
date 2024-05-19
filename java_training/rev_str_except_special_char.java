package java_training;
import java.util.*;
public class rev_str_except_special_char {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] ch=str.toCharArray();
		char temp;
		int i;int j;
		//  sc.close();
		int len=str.length();
		for(i=0, j=len-1;i<j; i++,j--) {
			while(!(( ch[i]>='Z' && ch[i]<='A') || (ch[i]>='z' && ch[i]<='a') || 
					(ch[i]<=1 && ch[i]>=9)))
				i++;
			
			while(!(( ch[j]>='Z' && ch[j]<='A') || (ch[j]>='z' && ch[j]<='a') || 
					(ch[j]<=1 && ch[j]>=9)))
				j--;
			
			if(i<j) {
				temp=ch[i];//ch[i]=(ch[i]+ch[j])-(ch[j]=ch[i])
				ch[i]=ch[j];
				ch[j]=temp;
				
			}
			
		}
	
		for(i=0;i<str.length();i++)
		System.out.print(ch[i]);
	}

}
