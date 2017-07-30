package javaapplication1;

import java.util.Scanner;


public class NewClass3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       String g =s.nextLine();
       String v="";
       char b;
       int d=0;
       for(int i=0;i<g.length();i++){
           b=Character.toLowerCase(g.charAt(i));
           //System.out.println(b);
           d=0;
             for (int j = 0; j < g.length(); j++) {
               if(b==Character.toLowerCase(g.charAt(j))){
                 d++;  
               }}
               if((d>2||d==1)&&(v.contains(String.valueOf(b))==false)){
                   v+=b;
           }
       } 
        System.out.println(v);
    }
}
