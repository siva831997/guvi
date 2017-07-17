package guvi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class Count {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int w1,l1;
		int w2,l2;
		System.out.println("Enter rectangle1 width & length");
       w1=s.nextInt();
       l1=s.nextInt();        
    	System.out.println("Enter rectangle1 width & length");
    	 w2=s.nextInt();
         l2=s.nextInt();
     
        if((w2<=w1&&l2<=l1))
            System.out.println("Possible");
        else 
        	System.out.println("Not Possible");
	    
	}
}
