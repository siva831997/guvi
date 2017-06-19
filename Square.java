package encoder;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		int[] a=new int[5];
		int[] b=new int[5];
		Scanner s=new Scanner(System.in);
for(int i=0;i<4;i++){
	a[i]=s.nextInt();
	b[i]=s.nextInt();
}
if(a[0]==b[3]&&b[0]==a[1]&&b[1]==a[2]&&b[2]==a[3])
{
	System.out.println("Square");
}else
{
System.out.println("not Square"); }
	}

}
