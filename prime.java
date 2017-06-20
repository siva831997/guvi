package prefix;
import java.util.Scanner;
public class Prefix {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			 String[] ch=new String[100];
			 String g="1",m=" ",h="0",f="0";
			 int k=sc.nextInt();
			 int i=0,j=0;
			 for(i=0;i<Math.pow(2,k);i++){
				m=Integer.toBinaryString(i) ;
			
				if(m.length()==k){
					System.out.println(m);
				}
				else
				{  f="";
				for(j=0;j<(k-m.length());j++){
					
					f+=h;}
				System.out.println(f+m); 
					
				}
				
					
				} 
	
				}
		}
		
