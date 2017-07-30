public class Guvi {   
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
         String g =s.nextLine();
       String v="",h="";
       char b;
        for (int i = 0; i < g.length()-1; i++) {
            for (int j = g.length();(g.substring(i,j).length())>=2; j--) {
               v=g.substring(i,j);
               if(v.equalsIgnoreCase(new StringBuilder(v).reverse().toString())&&v.length()>h.length()){
                   h=v;
                   System.out.println(v);
               }
            }
  
        }
    }
    
}
