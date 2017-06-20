package guvi;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		

	
		
				Scanner s=new Scanner(System.in);
			int sum=0,a=0,b=0,c=0,d=0;
				 for(int i=2;i<200 ;i++)
			        {
			        	int count=0;
			        	
			        	for(int j=2;j<i;j++)
			        	{
			        		if (i % j == 0) {
			   		     count++;
			   		     break;
			   		    }
			   		   }
			        	if(sum<100&&count==0){
				   			
				   			if(i<=9){
				   				sum=sum+i;
				   				System.out.println(i);
				   			}
				   			
				   			
				   			else
				   					if(i>9){
				   						c+=sum;
				   						d=i;
				   				 
				   				    System.out.println(i);
				   			while(d>9){
				   				a=0;
				   				   	while(d>0){
				   				 	b=d%10;
				   				   	a=a+b;
				   				   	d=d/10;
				   				   		}					   		
				   				   		d=a;
				   				   
				   			}
				   							   			
				   			sum+=d;
				   			
				   					}          
				   			
				   				   					
				   				   				}}
				   				   		}
			        
}
				   						
