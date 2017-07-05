package guvi;

import java.util.*;

public class Count {
public static void main(String[] args) {
	int c=0;
	 int[] arr1 = {4,7,3,9,2};
     int[] arr2 = {3,2,12,9,40,32,4};
     for(int i=0;i<arr1.length;i++){
         for(int j=0;j<arr2.length;j++){
             if(arr1[i]==arr2[j]){
                c++;
             }         
 }
}if(c==0){
System.out.println("not subset");
}else
{
	System.out.println("subset");
}
     }}
