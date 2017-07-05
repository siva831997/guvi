package guvi;

import java.util.*;

public class Count {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=5;
	int c=0;
	int f=0,g=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	System.out.println("ENTER THE TARGET:");
	int t=s.nextInt();
	for(int i=0;i<n&&c<=1;i++){
		for(int j=0;j<n&&i!=j;j++){
			if(a[i]+a[j]==t){
				f=i;
				g=j;
				c++;
			}
	}
	}
	System.out.println(a[f]);
	System.out.println(a[g]);
   
}
     }
