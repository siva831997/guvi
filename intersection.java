package guvi;
import java.util.Scanner;
public class Count {
	public static void main(String args[])
	{
		int a=0,b=0;		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the upper and lower");
		int u=s.nextInt();
		int l=s.nextInt();
		for(int i=1;i<=u-1;a=a+i,i++);
		for(int j=1;j<=l-1;b=b+(a*j),j++);
	       System.out.println(b);  
	        
		
	}	}

