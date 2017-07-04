package guvi;

import java.util.Scanner;

public class Count {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	 int num1=s.nextInt();
	 int i, j, flag, temp, count = 0;
	 if(num1<2){
		 System.out.println("no prime no");
	 }
	 for (i = 2; i <= num1; i++)
	    {
	        flag = 0;
	        for (j = 2; j <= i / 2; j++)
	        {
	            if ((i % j) == 0)
	            {
	                flag = 1;
	                break;
	            }
	        }

	        if (flag == 0)
	        {
	        	
	                       count++;
	        }
	    }System.out.println("the prime count are "+count);
	}


}
