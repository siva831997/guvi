package encoder;

import java.util.Scanner;

public class twpTwomatrix {

	public static void main(String[] args) {
		int[][] a=new int[5][5];
		Scanner s=new Scanner(System.in);

		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				a[i][j]=s.nextInt();
			}
		}
		int t1=0,t2=0;
		t1=a[0][2];
		a[0][2]=a[1][2];
		a[1][2]=t1;
		t2=a[1][0];
		a[1][0]=a[1][1];
		a[1][1]=t2;
		System.out.println("the arranged matrix");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
	}

}
