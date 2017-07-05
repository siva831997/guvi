
import java.util.*;

public class Count {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string word ");
	String b=s.next();
	char c=' ';
	String h="";
   for(int i=0;i<b.length();i++){
	   c=b.charAt(i);
	   if(c!=' '){
		   h=h+c;
		   b=b.replace(c,' ');
	   }
   }System.out.println("non duplicate word "+h);
}
     }
