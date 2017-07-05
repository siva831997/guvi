package guvi;

import java.util.*;

public class Count {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int b=s.nextInt();
	int c=0,v=0,n=0;
	while(b!=0){
		c=b%10;
		v+=c;
		b=b/10;
	}
	String r=Integer.toString(v);
	String h=new StringBuffer(r).reverse().toString();
	if(r.equals(h)){
	System.out.println("palindrome");
	}else{
		System.out.println("not palinderome");
	}
}}
