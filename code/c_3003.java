import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int w_a = 0 ,w_b = 0 ;
        
        for(int i = 0 ; i < n ; i++){
            String[] line = sc.nextLine().split(" ");
            if(Math.abs(jud(line[0]) - jud(line[1]))== 2) {
            		if(jud(line[0]) == 3) {
            				w_b++;
            		} else{
            				w_a++;
            			} 
            	continue;
            }
            
            if(jud(line[0]) > jud(line[1])){
            	w_a++;
            }else if(jud(line[0]) < jud(line[1])){
            	w_b++;
            }
        }
        System.out.printf("%d\n%d",w_a,w_b);

    }
    
    public static int jud(String a){
    		switch(a){
    			case "c":
    					return 3;
    			
    			case "p":
    					return 2;
    				
    			case "g":
    					return 1;
    				
  				default:
  						return 0;
    		}	
    }
}