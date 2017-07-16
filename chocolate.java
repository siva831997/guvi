import java.util.Scanner;
public class MChocolate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int piece=0;
		piece=(m!=0&&n!=0)?m*n:0;
		System.out.println("the piece are:"+(piece-1));

	}

}
