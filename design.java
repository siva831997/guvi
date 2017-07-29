import java.util.*;
public class JavaApplication1 {

       public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] input=new String[n+1];
       int r=n/2,k=r;
               String v,h="";
               if(n%2!=0){
               for (int i = 0; i <n; i++) {
             char b=(char)(96+((n+1)/2));
             h="";
             int z=(n+1)/2;
                        for (int j = 0; j < n; j++) {
                 if(b>'a'&&z>1){
                     v=b+" ";
                     b--;
                     z--;
                 } else
                 {
                     v=b+" ";                     
                    b++;
                 }if((i>0&&i<n-1)&&(j>=r&&j<=k)){
                            v="  ";                           
                 }
                 h+=v;}if(i>0&&i<n/2){
                 r--;k++;}else
                     if(i>=n/2&&i<n-1){
                         r++;k--;
                        }
            input[i]=h;    
            }}
        for (int i = 0; i < n; i++) {
            System.out.println(input[i]);            
        }}
}
