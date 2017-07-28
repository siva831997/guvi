class Star
public static void main(String[] args){
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    String m="*";
		    String k="";
		        for (int i = n-2; i >=0; i--) {		
		        	 k="";
		        	for(int j=i;j>=0;j--){		        		
		        	k+=m;	
		        	}		        	
					System.out.println(k+" "+k);
				}
		        }}
