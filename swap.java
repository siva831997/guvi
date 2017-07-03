package guvi;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
 String g=s.next();
 String j="";
 if(g.length()%2==0){
 for(int i=0;i<g.length()-1;i+=2){
	 j+=g.substring(i+1,i+2)+g.substring(i,i+1);
 }}
 else{
	 for(int i=0;i<g.length()-1;i+=2){
		 j+=g.substring(i+1,i+2)+g.substring(i,i+1);
 }j+=g.substring(g.length()-1,g.length());}
 System.out.println(j);
	}

}
